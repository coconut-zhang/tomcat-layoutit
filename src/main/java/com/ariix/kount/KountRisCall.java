package com.ariix.kount;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import com.kount.ris.Inquiry;
import com.kount.ris.KountRisClient;
import com.kount.ris.Response;
import com.kount.ris.Update;
import com.kount.ris.transport.KountHttpTransport;
import com.kount.ris.util.AuthorizationStatus;
import com.kount.ris.util.CartItem;
import com.kount.ris.util.InquiryMode;
import com.kount.ris.util.MerchantAcknowledgment;
import com.kount.ris.util.RisException;
import com.kount.ris.util.payment.CardPayment;
import com.kount.ris.util.payment.NoPayment;
import com.kount.ris.util.payment.Payment;

public class KountRisCall {
	public static void main(String[] args) throws MalformedURLException {
		 
        URL url = new URL("https://risk.test.kount.net");
        String apiKey = new String("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxNzExMzAiLCJhdWQiOiJLb3VudC4xIiwiaWF0IjoxNDkzNjg5MTk4LCJzY3AiOnsia2EiOm51bGwsImtjIjpudWxsLCJhcGkiOnRydWUsInJpcyI6dHJ1ZX19.4Pr_xxRWv-nJaiHweDT4IztMF7WrwWGAI_bOAkSCqcs");
        //eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxNzExMzAiLCJhdWQiOiJLb3VudC4xIiwiaWF0IjoxNDk1NjgxMDM5LCJzY3AiOnsia2EiOm51bGwsImtjIjpudWxsLCJhcGkiOnRydWUsInJpcyI6dHJ1ZX19.r6pxKxLS5VP7IxWC0vgHAMwB2HT_puKDN0J68hHavDE
        //String apiKey = new String("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxNzExMzAiLCJhdWQiOiJLb3VudC4xIiwiaWF0IjoxNDk1NjgxMDM5LCJzY3AiOnsia2EiOm51bGwsImtjIjpudWxsLCJhcGkiOnRydWUsInJpcyI6dHJ1ZX19.r6pxKxLS5VP7IxWC0vgHAMwB2HT_puKDN0J68hHavDE");
        // Create a RIS client object with the target URL and your API key
        KountRisClient ris = new KountRisClient(url, apiKey);
        
        //KountHttpTransport transport = new KountHttpTransport();
        //transport.setReadTimeout(Integer.parseInt("20000"));
        //transport.setConnectTimeout(Integer.parseInt("20000"));
        //ris.setTransport(transport);

 
        // Create and populate a new Request. The Request will be handed
        // off to the RIS client to make the call and provide the response.
        Inquiry req = new Inquiry();
        req.setMerchantId(171130);
        req.setSessionId("62D62F564F7B5BB27D22A7B0693FFF45");
        req.setUniqueCustomerId("6000003");
        req.setKhashPaymentEncoding(true);
        //Payment payment = new Payment("CARD", "5454545454545454");
        Payment payment = new CardPayment("123456A12C34E56G7DFG");
        //Payment payment = new NoPayment();
        req.setPayment(payment);
        req.setCurrency("USD");
        req.setPayment(payment);
        req.setTotal(136);
        req.setCash(136);
        req.setCustomerName("arlo zhang");
        req.setEmail("arlo.zhang@ariix.com");
        req.setIpAddress("127.0.0.1");
        req.setMerchantAcknowledgment(MerchantAcknowledgment.YES);
        req.setWebsite("DEFAULT");
        CartItem item0 = new CartItem("SURROUND SOUND", "HTP-2920", "Pioneer High Power 5.1 Surround Sound System", 1, 49999);
        CartItem item1 = new CartItem("BLURAY PLAYER", "BDP-S500", "Sony 1080p Blu-Ray Disc Player", 1, 69999);
        Collection<CartItem> cart = new ArrayList<>();
        cart.add(item0);
        cart.add(item1);
        req.setCart(cart);
        req.setMode(InquiryMode.INITIAL_INQUIRY);
        req.setUserDefinedField("CustomerType", "REPRESENTATIVE");
        //req.setParm("CustomerType", "P");
        try {
            // This is the first point at which the code actually calls the Kount
            // services. Everything prior to this is simply setting up the payload.
            Response response = ris.process(req);
            String responseText = "Transaction ID: " + response.getTransactionId() + "\n\n";
            responseText += response;
            System.out.print(responseText);
            
            // Minimal RIS update example
            Update u = new Update();
            u.setSessionId("62D62F564F7B5BB27D22A7B0693FFF45");
            u.setTransactionId(response.getTransactionId());
            u.setMerchantAcknowledgment(MerchantAcknowledgment.NO);
            u.setAuthorizationStatus(AuthorizationStatus.APPROVED);
            u.setMerchantId(171130);
            try {
                Response r = ris.process(u);
                System.out.println("\r\n");
                System.out.println(r);
            } catch (RisException re) {
                re.printStackTrace();
            }
        } catch (RisException risException) {
            System.out.print(risException.getMessage());
        }
    }
}
