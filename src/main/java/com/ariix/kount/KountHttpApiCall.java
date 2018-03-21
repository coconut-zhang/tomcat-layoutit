package com.ariix.kount;

import java.io.IOException;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

public class KountHttpApiCall {

	public static void main(String[] args) {
        // Fake example transaction ID: 3YC00XQKNVMZ
        String url = "https://api.test.kount.net/rpc/v1/orders/detail.json?trid=3YC00XQKNVMZ";
        Header headerKey = new Header("X-Kount-Api-Key", "<!--Actual Kount RIS/API Key goes here-->");
 
        // Create an instance of HttpClient.
        HttpClient client = new HttpClient();
 
        // Create a method instance.
        GetMethod method = new GetMethod(url);
 
        // Provide custom retry handler is necessary
        method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
                new DefaultHttpMethodRetryHandler(3, false));
        method.addRequestHeader(headerKey);
 
        try {
            // Execute the method.
            int statusCode = client.executeMethod(method);
 
            if (statusCode != HttpStatus.SC_OK) {
                System.err.println("Method failed: " + method.getStatusLine());
            }
 
 
            // Read the response body.
            byte[] responseBody = method.getResponseBody();
 
            // Deal with the response.
            // Use caution: ensure correct character encoding and is not binary data
            System.out.println(new String(responseBody));
 
        } catch (HttpException e) {
            System.err.println("Fatal protocol violation: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Fatal transport error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Release the connection.
            method.releaseConnection();
        }
    }

}
