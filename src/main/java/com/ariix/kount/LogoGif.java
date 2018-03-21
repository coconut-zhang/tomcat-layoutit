package com.ariix.kount;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoGif extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException { 
	    String merchantId=request.getParameter("m");
	    String sessionId=request.getParameter("s");// Session ID 
	    String url="https://tst.kaptcha.com/logo.htm?m="+merchantId +"&s="+sessionId;
	    response.setStatus(HttpServletResponse.SC_FOUND);
	    response.sendRedirect(url);
	}
}
