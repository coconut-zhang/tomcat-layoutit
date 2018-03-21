package com.ariix.kount;

import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kount.ris.Inquiry;
import com.kount.ris.KountRisClient;
import com.kount.ris.Response;
import com.kount.ris.Update;
import com.kount.ris.util.Address;
import com.kount.ris.util.AuthorizationStatus;
import com.kount.ris.util.CartItem;
import com.kount.ris.util.InquiryMode;
import com.kount.ris.util.Khash;
import com.kount.ris.util.MerchantAcknowledgment;
import com.kount.ris.util.RisException;
import com.kount.ris.util.payment.CardPayment;
import com.kount.ris.util.payment.Payment;

public class KountRisCallServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String kountKey = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxNzExMzAiLCJhdWQiOiJLb3VudC4xIiwiaWF0IjoxNDkzNjg5MTk4LCJzY3AiOnsia2EiOm51bGwsImtjIjpudWxsLCJhcGkiOnRydWUsInJpcyI6dHJ1ZX19.4Pr_xxRWv-nJaiHweDT4IztMF7WrwWGAI_bOAkSCqcs";
	private static final String risUrl = "https://risk.test.kount.net";
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String cardN = request.getParameter("param1");
		String vcc = request.getParameter("param2");
		
		URL url = new URL(risUrl);
        String apiKey = new String(kountKey);
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
        req.setSessionId(session.getId());
        
        String cc = "";
        try {
			cc = Khash.hashPaymentToken("4111111111111111");
			System.out.println("---------------->" + cc + "<----------------");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        CardPayment payment = new CardPayment(cc);
        payment.setKhashed(false);
        req.setCurrency("USD");
        req.setPayment(payment);
        req.setTotal(1000000000);
        req.setCash(1000000000);
        req.setCustomerName("John Doe");
        req.setEmail("johndoe@test.com");
        req.setIpAddress("127.0.0.1");
        req.setMerchantAcknowledgment(MerchantAcknowledgment.YES);
        req.setWebsite("DEFAULT");
        req.setMode(InquiryMode.INITIAL_INQUIRY);
        
        req.setShippingPhoneNumber("");
        req.setBillingPhoneNumber("");
        //req.setOrderNumber("123a78d");
        
        Address addr = new Address();
        addr.setAddress1("563 West 500 South, Ste 300");
        addr.setCity("Bountiful");
        addr.setCountry("US");    //size limit 2?
        addr.setPostalCode("84010");
        addr.setState("Utah");
        req.setBillingAddress(addr);
        
        
        CartItem item0 = new CartItem("SURROUND SOUND", "HTP-2920", "Pioneer High Power 5.1 Surround Sound System", 1, 49999);
        CartItem item1 = new CartItem("BLURAY PLAYER", "BDP-S500", "Sony 1080p Blu-Ray Disc Player", 1, 69999);
        Collection<CartItem> cart = new ArrayList<>();
        cart.add(item0);
        cart.add(item1);
        req.setCart(cart);
        
        //req.setKhashPaymentEncoding();
        //req.setKhashPaymentEncoding(true);
        

        try {
            // This is the first point at which the code actually calls the Kount
            // services. Everything prior to this is simply setting up the payload.
            Response response = ris.process(req);
            String responseText = "Transaction ID: " + response.getTransactionId() + "\r\n" + "Auto: " + response.getAuto() + "\r\n" + "Score: " + response.getScore() + "\r\n";
            responseText += response;
            System.out.print(responseText);
            System.out.print(response.getOrderNumber());
            
            // Minimal RIS update example
            Update u = new Update();
            u.setSessionId(session.getId());
            u.setTransactionId(response.getTransactionId());
            u.setMerchantAcknowledgment(MerchantAcknowledgment.NO);
            u.setAuthorizationStatus(AuthorizationStatus.APPROVED);
            u.setMerchantId(171130);
            Response r = ris.process(u);
            System.out.println("\r\n");
            System.out.println(r);

            session.setAttribute("Inquiry", responseText);
            session.setAttribute("Update", r);
        } catch (RisException risException) {
            System.out.print(risException.getMessage());
        }
        
        //request.getRequestDispatcher("/index.jsp").forward(request, resp);
        
        resp.sendRedirect("/home/index.jsp");

	}
	
	private Map<String, String> inquiryKount() throws Exception{
		return null;
	}
	
	private Map<String, String> updateKount() throws Exception{
		return null;
	}
}
