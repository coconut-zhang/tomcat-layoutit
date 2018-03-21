package com.ariix.myTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

import com.chinapay.secss.SecssUtil;
import com.thoughtworks.xstream.core.util.Base64Encoder;

public class ChinaPayUtil {
	
	public String doPost(String url, Map<String, String> params,
			String charset, boolean pretty) {
		StringBuffer response = new StringBuffer();
		HttpClient client = new HttpClient();
		PostMethod method = new PostMethod(url);
		// 设置参数的字符集
		method.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET,
				charset);
		// 设置Http Post数据
		if (params != null) {
			// HttpMethodParams p = new HttpMethodParams();
			for (Map.Entry<String, String> entry : params.entrySet()) {
				// p.setParameter(entry.getKey(), entry.getValue());
				method.setParameter(entry.getKey(), entry.getValue());
			}
			// method.setParams(p);
		}
		try {
			client.executeMethod(method);
			if (method.getStatusCode() == HttpStatus.SC_OK) {
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(method.getResponseBodyAsStream(),
								charset));
				String line;
				while ((line = reader.readLine()) != null) {
					if (pretty)
						response.append(line).append(
								System.getProperty("line.separator"));
					else
						response.append(line);
				}
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			method.releaseConnection();
		}
		return response.toString();
	}
	
	public Map<String, Object> toMap(String url) {
		Map<String, Object> map = null;
		if (url != null && url.indexOf("&") > -1 && url.indexOf("=") > -1) {
			map = new HashMap<String, Object>();
			String[] arrTemp = url.split("&");
			for (String str : arrTemp) {
				//String[] qs = str.split("=");
				//map.put(qs[0], qs[1]);
				int idx = str.indexOf("=");
				map.put(str.substring(0, idx), str.substring(idx + 1));
			}
		}
		return map;
	}
	
	public String getCardTranData(){
		String cardJsonStr = "{\"CardNo\":\"6222000302104895457\"}";
		String encryptData = null;
		try {
			String cardJsonStr64 =  new Base64Encoder().encode(cardJsonStr.getBytes("utf-8"));
			SecssUtil secssUtil = new SecssUtil();
			// 从默认配置文件初始化安全控件
			secssUtil.init();
			System.out.println("测试初始化-->" + secssUtil.getErrMsg());
			
			secssUtil.encryptData(cardJsonStr64);
			encryptData = secssUtil.getEncValue();
			System.out.println("测试普通数据加密-->" + secssUtil.getErrMsg());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return encryptData;
	}
	
	public String getSignature() {
		Map<String, Object> myMap = new HashMap<String, Object>();
		// 参与签名的字段和值
		String encryptData = getCardTranData();
		myMap.put("Version", "20150922");
		myMap.put("MerId", "000001707191527");
		myMap.put("TranType", "0504");
		myMap.put("OriTranType", "9901");
		myMap.put("BusiType", "0001");
		myMap.put("CardTranData", encryptData);

		SecssUtil secssUtil = new SecssUtil();
		// 从默认配置文件初始化安全控件
		secssUtil.init();

		System.out.println("测试初始化-->" + secssUtil.getErrMsg());
		secssUtil.sign(myMap);
		if (!"00".equals(secssUtil.getErrCode())) {
			System.out.println("签名过程发生错误，错误信息为-->" + secssUtil.getErrMsg());
			return null;
		}
		String sign = secssUtil.getSign();
		System.out.println("sign-->" + sign);

		return sign;
	}
	
	public String getCardTranData4SignAndPay(){
		String cardJsonStr = "{\"CardNo\":\"6222000302104895457\",\"CertType\":\"01\",\"CertNo\":\"120111198210240538\",\"MobileNo\":\"15022308758\"}";
		String encryptData = null;
		try {
			String cardJsonStr64 =  new Base64Encoder().encode(cardJsonStr.getBytes("utf-8"));
			SecssUtil secssUtil = new SecssUtil();
			// 从默认配置文件初始化安全控件
			secssUtil.init();
			System.out.println("测试初始化-->" + secssUtil.getErrMsg());
			
			secssUtil.encryptData(cardJsonStr64);
			encryptData = secssUtil.getEncValue();
			System.out.println("测试普通数据加密-->" + secssUtil.getErrMsg());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return encryptData;
	}
	
	public String getSignature4SignAndPay(String ip) {
		Map<String, Object> myMap = new HashMap<String, Object>();
		// 参与签名的字段和值
		String encryptData = getCardTranData4SignAndPay();
		myMap.put("Version", "20150922");
		myMap.put("MerId", "000001707191527");
		myMap.put("MerOrderNo", "12345678");
		myMap.put("TranDate", "20170802");
		myMap.put("TranTime", "114901");
		myMap.put("OrderAmt", "1");
		myMap.put("TranType", "0006");
		myMap.put("BusiType", "0001");
		//myMap.put("CurryNo", "CNY");
		myMap.put("MerBgUrl", "http://www.baidu.com");
		myMap.put("TranReserved", "{\"SubTransType\":\"0001\"}");
		myMap.put("CardTranData", encryptData);
		myMap.put("RemoteAddr", ip);
		
		SecssUtil secssUtil = new SecssUtil();
		// 从默认配置文件初始化安全控件
		secssUtil.init();

		System.out.println("测试初始化-->" + secssUtil.getErrMsg());
		secssUtil.sign(myMap);
		if (!"00".equals(secssUtil.getErrCode())) {
			System.out.println("签名过程发生错误，错误信息为-->" + secssUtil.getErrMsg());
			return null;
		}
		String sign = secssUtil.getSign();
		System.out.println("sign-->" + sign);

		return sign;
	}
	
	public String getSignature4Sms() {
		Map<String, Object> myMap = new HashMap<String, Object>();
		// 参与签名的字段和值
		String encryptData = getCardTranData();
		myMap.put("Version", "20150922");
		myMap.put("MerId", "000001707191527");
		myMap.put("MerOrderNo", "12345678");
		myMap.put("TranDate", "20170802");
		myMap.put("TranTime", "114901");
		myMap.put("OrderAmt", "1");
		myMap.put("TranType", "0607");
		myMap.put("BusiType", "0001");
		//myMap.put("CurryNo", "CNY");
		myMap.put("TranReserved", "{\"TerminalType\":\"05\"}");
		myMap.put("CardTranData", encryptData);
		
		SecssUtil secssUtil = new SecssUtil();
		// 从默认配置文件初始化安全控件
		secssUtil.init();

		System.out.println("测试初始化-->" + secssUtil.getErrMsg());
		secssUtil.sign(myMap);
		if (!"00".equals(secssUtil.getErrCode())) {
			System.out.println("签名过程发生错误，错误信息为-->" + secssUtil.getErrMsg());
			return null;
		}
		String sign = secssUtil.getSign();
		System.out.println("sign-->" + sign);

		return sign;
	}
	
	public static void main(String[] args) {
		/**
		Properties properties = new Properties();
		InputStream in = ChinaPayUtil.class.getClassLoader().getResourceAsStream("security.properties");
		try {
			properties.load(in);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("测试从类路径读取数值-->" + properties.getProperty("sign.file.password"));
		
		Map<String,String> myMap = new HashMap<String,String>();
		//参与签名的字段和值
		ChinaPayUtil cpu = new ChinaPayUtil();
		String encryptData = cpu.getCardTranData();
		myMap.put("Version", "20150922");
		myMap.put("MerId", "000001707191527");
		myMap.put("TranType", "0504");
		myMap.put("OriTranType", "9901");
		myMap.put("BusiType", "0001");
		myMap.put("CardTranData", encryptData);
		
		SecssUtil secssUtil = new SecssUtil();
		//从默认配置文件初始化安全控件
		secssUtil.init();
		
		//签约查询接口
		//http://newpayment-test.chinapay.com/CTITS/service/rest/forward/syn/000000000017/0/0/0/0/0
		
		System.out.println("测试初始化-->"+secssUtil.getErrMsg());
		secssUtil.sign(myMap);
		if(!"00".equals(secssUtil.getErrCode())){
			System.out.println("签名过程发生错误，错误信息为-->"+secssUtil.getErrMsg());
			return;
		}
		String sign = secssUtil.getSign();
		System.out.println("sign-->"+sign);
		
		myMap.put("Signature", sign);
		
		String url = "http://newpayment-test.chinapay.com/CTITS/service/rest/forward/syn/000000000017/0/0/0/0/0";
		String CPResponse = cpu.doPost(url, myMap, "utf-8", false);
		System.out.println("测试查询返回值-->" + CPResponse);
		String CPResponseDecode = null;
		try {
			CPResponseDecode = URLDecoder.decode(CPResponse, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("测试url解码-->" + CPResponseDecode);
		Map<String, Object> CPRespMap = cpu.toMap(CPResponseDecode);
		
		
		String CPResponseDecode = "respMsg=成功&BankInstNo=700000000000003&SignState=00&TranType=0504&MerId=000001707191527&Version=20150922&Signature=QnUV6f3C4SU40ecWteYJYUXdPpnH0YEcldjGNP8wJNDMrXYrQ1VtaJqXEbXsJd40Ay2MhgI2LwkpbGSGeGNa7lUiDCmHr+iN3N6pMWS8AC9F950vejiOfmT9hOKdt+KcUUpjqfS0i6cBQQMt9zJIHx3fm4YhgUBZPenpXSFt7Iw=&AcqCode=000000000000014&respCode=0000";
		ChinaPayUtil cpu = new ChinaPayUtil();
		Map<String, Object> CPRespMap = cpu.toMap(CPResponseDecode);
		SecssUtil secssUtil = new SecssUtil();
		secssUtil.init();
		secssUtil.verify(CPRespMap);
		if(!"00".equals(secssUtil.getErrCode())){
			System.out.println("验签过程发生错误，错误信息为-->"+secssUtil.getErrMsg());
			return;
	    }
		System.out.println("验签通过。");
		*/
		/**
		//send sms
		Map<String,String> myMap = new HashMap<String,String>();
		//参与签名的字段和值
		ChinaPayUtil cpu = new ChinaPayUtil();
		String encryptData = cpu.getCardTranData();
		myMap.put("Version", "20150922");
		myMap.put("MerId", "000001707191527");
		myMap.put("MerOrderNo", "12345678");
		myMap.put("TranDate", "20170809");
		myMap.put("TranTime", "113900");
		myMap.put("OrderAmt", "1");
		myMap.put("TranType", "0607");
		myMap.put("BusiType", "0001");
		myMap.put("CardTranData", encryptData);
		
		SecssUtil secssUtil = new SecssUtil();
		//从默认配置文件初始化安全控件
		secssUtil.init();
		
		//签约查询接口
		//http://newpayment-test.chinapay.com/CTITS/service/rest/forward/syn/000000000017/0/0/0/0/0
		
		System.out.println("测试初始化-->"+secssUtil.getErrMsg());
		secssUtil.sign(myMap);
		if(!"00".equals(secssUtil.getErrCode())){
			System.out.println("签名过程发生错误，错误信息为-->"+secssUtil.getErrMsg());
			return;
		}
		String sign = secssUtil.getSign();
		System.out.println("sign-->"+sign);
		
		myMap.put("Signature", sign);
		
		String url = "http://newpayment-test.chinapay.com/CTITS/service/rest/forward/syn/000000000017/0/0/0/0/0";
		String CPResponse = cpu.doPost(url, myMap, "utf-8", false);
		System.out.println("测试查询返回值-->" + CPResponse);
		String CPResponseDecode = null;
		try {
			CPResponseDecode = URLDecoder.decode(CPResponse, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("测试url解码-->" + CPResponseDecode);
		*/
		/**
		Map<String,String> myMap = new HashMap<String,String>();
		//参与签名的字段和值
		ChinaPayUtil cpu = new ChinaPayUtil();
		String encryptData = cpu.getCardTranData();
		myMap.put("Version", "20150922");
		myMap.put("MerId", "531111702270002");
		//myMap.put("MerId", "000001707191527");
		myMap.put("TranType", "0504");
		myMap.put("OriTranType", "9901");
		myMap.put("BusiType", "0001");
		myMap.put("CardTranData", encryptData);
		
		SecssUtil secssUtil = new SecssUtil();
		//从默认配置文件初始化安全控件
		secssUtil.init();
		
		//签约查询接口
		//http://newpayment-test.chinapay.com/CTITS/service/rest/forward/syn/000000000017/0/0/0/0/0
		
		System.out.println("测试初始化-->"+secssUtil.getErrMsg());
		secssUtil.sign(myMap);
		if(!"00".equals(secssUtil.getErrCode())){
			System.out.println("签名过程发生错误，错误信息为-->"+secssUtil.getErrMsg());
			return;
		}
		String sign = secssUtil.getSign();
		System.out.println("sign-->"+sign);
		
		myMap.put("Signature", sign);
		
		String url = "https://payment.chinapay.com/CTITS/service/rest/forward/syn/000000000017/0/0/0/0/0";
		//String url = "http://newpayment-test.chinapay.com/CTITS/service/rest/forward/syn/000000000017/0/0/0/0/0";
		String CPResponse = cpu.doPost(url, myMap, "utf-8", false);
		System.out.println("测试查询返回值-->" + CPResponse);
		String CPResponseDecode = null;
		try {
			CPResponseDecode = URLDecoder.decode(CPResponse, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("测试url解码-->" + CPResponseDecode);
		Map<String, Object> CPRespMap = cpu.toMap(CPResponseDecode);
		
		**/
		String CPResponseDecode = "AcqDate=20170831&AcqSeqId=0000000026813170&BankInstNo=700000000000002&CardTranData=MRbq0Lc3R8gBt4XLfDb2wN/TETnJy1UZM94cQTtXM5QfFDdGEIsuyrfawK2eqcWqH/ztISGzAC/XM/gaX6IyZddOkLaQxurbQgiGD+MR5N3PEkQTL/aDh3pEleGYMIa0lJjN+YaqrDJ7M0+67SueobDMm5JOchqi+cBOoH9EEUa4DOHp7jI72flGlNrkzhB688SPS0pgS09VKd90YELaQH4EzfAhZXMdwrQwWpGWP0OUcWf98tYwGtdAZzgwXy3tQLYUoaeX5tX4QFC5G7dA5k9r5E2TLt6lpoQ/k6erJ1OflU4ZZQc9g5oCu51hW/s/gGYa9tn3PQwbcSfbV/p9gg==&MerId=000001707191527&MerOrderNo=20170831112146&SignState=01&TranType=9901&respCode=0000&respMsg=绑定成功&Signature=mPc2gskYKUitSiS4TDR8m2t5UcdXYUCXzkL4IeBz4WSE6HRZAPnE2ylKFtqP89qmACchN4ZW8XM5WST8Q9XqZ8RzXJ0TZ9Eg0C8UdPS6+anqaOvK8chbA10rcRJJIij3qyich9WwfcNjKBVmCEyFsjyM3z1Ik3bP2R9iYHRuo5o=";
		ChinaPayUtil cpu = new ChinaPayUtil();
		Map<String, Object> CPRespMap = cpu.toMap(CPResponseDecode);
		//SecssUtil secssUtil = new SecssUtil();
		//secssUtil.init();
		SecssUtil secssUtil = new SecssUtil();
		//从默认配置文件初始化安全控件
		secssUtil.init();
		secssUtil.verify(CPRespMap);
		if(!"00".equals(secssUtil.getErrCode())){
			System.out.println("验签过程发生错误，错误信息为-->"+secssUtil.getErrMsg());
			return;
	    }
		System.out.println("验签通过。");
	}

}
