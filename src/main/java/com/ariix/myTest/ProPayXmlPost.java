package com.ariix.myTest;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;

public class ProPayXmlPost {

	public final static String Url = "https://xmltest.propay.com/API/PropayAPI.aspx";
	public final static String Rest = "https://xmltest.propay.com/API/PropayAPI.aspx";
	
	public static void main(String[] args) {

		String reponse = sendPost(Url, getCreateXmlStr());
		//String reponse = sendPost(Url, getDetailXmlStrByAccountNum());
		//String reponse = sendPost(Url, getDetailXmlStrByEmail());
		//String reponse = sendPost(Url, payment());
		
		System.out.println("----------------------------------");
		System.out.println(reponse);
		System.out.println("----------------------------------");

		Document document = null;
		try {
			document = DocumentHelper.parseText(reponse);
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		//获取文档根节点
        Element root = document.getRootElement();
        //输出根标签的名字
        //System.out.println(root.getName());
        
        
        //获取根节点下面的所有子节点（不包过子节点的子节点）
        //List<Element> list = root.elements() ;
        //遍历List的方法
        //for (Element e:list){
        //    System.out.println(e.getName());
        //}
        
        
        //获得指定节点下面的子节点
        //Element xmlTransElem = root.element("XMLTrans");//首先要知道自己要操作的节点。 
        //List<Element> xmlTransList = xmlTransElem.elements();
        //for (Element e:xmlTransList){
        //    System.out.println(e.getName());
        //    String s = e.getText();
        //    System.out.println(s);
        //}    
        
        
        //调用下面获取子节点的递归函数。
        //getChildNodes(root);
        
        
        //获得当前标签下指定名称的第一个子标签
        //Element conElem = root.element("XMLTrans");
        //System.out.println(conElem.getName());
        
        
        //获得更深层次的标签（一层一层的获取）
        Element nameElem = root.element("XMLTrans").element("status");
        System.out.println(nameElem.getName() + ": " + nameElem.getText());
        Element emailElem = root.element("XMLTrans").element("sourceEmail");
        System.out.println(emailElem.getName() + ": " + emailElem.getText());
        Element passElem = root.element("XMLTrans").element("password");
        System.out.println(passElem.getName() + ": " + passElem.getText());
	}
	
	/**
	 * 
	 * @param url
	 * @param xmlString
	 * @return
	 */
	public static String sendPost(String url, String xmlString) {
		// 创建httpclient工具对象   
		HttpClient client = new HttpClient();
		// 创建post请求方法
		PostMethod myPost = new PostMethod(url);
		// 设置请求超时时间
		client.setConnectionTimeout(3000 * 1000);
		String responseString = null;
		try {
			// 设置请求头部类型
			myPost.setRequestHeader("Content-Type", "text/xml");
			myPost.setRequestHeader("charset", "utf-8");
			// 设置请求体，即xml文本内容，一种是直接获取xml内容字符串，一种是读取xml文件以流的形式
			myPost.setRequestBody(xmlString);
			int statusCode = client.executeMethod(myPost);
			// 只有请求成功200了，才做处理
			if (statusCode == HttpStatus.SC_OK) {
				InputStream inputStream = myPost.getResponseBodyAsStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(
						inputStream, "utf-8"));
				StringBuffer stringBuffer = new StringBuffer();
				String str = "";
				while ((str = br.readLine()) != null) {
					stringBuffer.append(str);
				}
				responseString = stringBuffer.toString();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			myPost.releaseConnection();
		}
		return responseString;
	}
	
	/**
	 * transType String Required Set value to 01 for ‘Create ProPay Account’
	 * 
	 * AccountOwnershipType String 15 Required Valid values are:  Personal 
	 * Business If accountType is G, then this value is always overwritten as
	 * ‘Business’
	 * 
	 * AccountType String Valid values are:  C – Checking  S – Savings  G –
	 * General Ledger
	 * 
	 * DoingBusinessAs String 40 Required This field is used to provide DBA
	 * information on an account. ProPay accounts can be configured to display
	 * DBA on Credit Card statements
	 * 
	 * ExternalId String This is a client’s own unique identifier. Typically
	 * used as the distributor or consultant ID.
	 * 
	 * MCCCode String 4 Optional Merchant Category Code. Omit unless
	 * specifically instructed by ProPay. Legacy XML Only
	 * 
	 * phonePin String 4 Optional Numeric value which will give a user access to
	 * ProPay’s IVR system. Also used to reset password.
	 * 
	 * RoutingNumber String 9 Required Financial institution routing number.
	 * Must be a valid ACH routing number
	 * 
	 * ssn String Required Merchant/Individual social security number. Must be 9
	 * characters without dashes. Required for USA.
	 * 
	 * MerchantSourceIp String 64 Required SourceIp of Mechant, see Appendix C
	 * for additional information Legacy XML Only
	 * 
	 * ThreatMetrixPolicy String 32 Required Threat Metrix Policy, see Appendix
	 * C for additional information Threat Metrix Only Legacy XML Only
	 * 
	 * ThreatMetrixSessionId String 128 Required SessionId for Threat Metrix,
	 * see Appendix C for additional information Threat Metrix Only Legacy XML
	 * Only
	 * 
	 * tier String 40 Required One of the previously assigned business tier
	 * types
	 * 
	 * @return
	 */
	public static String getCreateXmlStr(){
		StringBuffer sb = new StringBuffer();
		sb.append("<XMLRequest>");
		sb.append("<certStr>833ab6d57104b7fad640ec31ddca0e</certStr><class>partner</class>");
		sb.append("<XMLTrans>");
		sb.append("<transType>01</transType>");
		/**
		sb.append("<BankName>Wells Fargo</BankName>");
		sb.append("<AccountCountryCode>USA</AccountCountryCode>");
		sb.append("<accountName>MyBankAccount</accountName>");
		sb.append("<AccountOwnershipType>Personal</AccountOwnershipType>");
		sb.append("<accountType>C</accountType>");
		sb.append("<AccountNumber>4111111111111111</AccountNumber>");
		sb.append("<RoutingNumber>102000076</RoutingNumber>");
		*/


		sb.append("<addr>200 West Main Street</addr>");
		
		/**
		sb.append("<BusinessAddress>123 ABC St.</BusinessAddress>");
		sb.append("<BusinessAddress2>Ste 200</BusinessAddress2>");
		sb.append("<BusinessCountry>USA</BusinessCountry>");
		sb.append("<BusinessState>AK</BusinessState>");
		sb.append("<BusinessZip>81425</BusinessZip>");
		*/
		sb.append("<city>Anytown</city>");
		sb.append("<country>USA</country>");
		sb.append("<dayPhone>4464464464</dayPhone>");
		sb.append("<Description>My Checking</Description>");
		sb.append("<dob>01-01-1981</dob>");
		/**
		sb.append("<DoingBusinessAs>PPA</DoingBusinessAs>");
		*/
		sb.append("<evenPhone>4464464464</evenPhone>");
		/**
		sb.append("<externalId>");
		sb.append(generateShortUuid());
		sb.append("</externalId>");
		
		*/
		sb.append("<firstName>John</firstName>");
		sb.append("<lastName>Doe</lastName>");
		/**
		sb.append("<MCCCode>5399</MCCCode>");
		sb.append("<phonePin>1234</phonePin>");
		*/

		
		sb.append("<sourceEmail>arlo.zhang26@ariix.com</sourceEmail>");
		sb.append("<ssn>000000000</ssn>");
		sb.append("<state>UT</state>");
		sb.append("<tier>Card-Only</tier>");
		sb.append("<zip>84057</zip>");
		/**
		sb.append("<MerchantSourceip></MerchantSourceip>");
		sb.append("<ThreatMetrixPolicy></ThreatMetrixPolicy>");
		sb.append("<ThreatMetrixSessionid></ThreatMetrixSessionid>");
		*/
		sb.append("</XMLTrans>");
		sb.append("</XMLRequest>");
		return sb.toString();
	}
	
	/**
	 * Commission disbursement account: login = commissions@ariix.com password =
	 * !D5kgLyazL (must be reset upon first login) <accntNum>30828334</accntNum>
	 * 
	 * Test Distributor Account login = testuser@ariix.com password = c!5auh9Zr!
	 * (must be reset upon first login) <accntNum>30828335</accntNum>
	 * 
	 * @return
	 */
	public static String getDetailXmlStrByAccountNum(){
		StringBuffer sb = new StringBuffer();
		sb.append("<XMLRequest>");
		sb.append("<certStr>833ab6d57104b7fad640ec31ddca0e</certStr>");
		sb.append("<class>partner</class>");
		sb.append("<XMLTrans>");
		sb.append("<transType>13</transType>");
		sb.append("<accountNum>32287636</accountNum>");
		sb.append("</XMLTrans>");
		sb.append("</XMLRequest>");
		return sb.toString();
	}

	public static String getDetailXmlStrByEmail(){
		StringBuffer sb = new StringBuffer();
		sb.append("<XMLRequest>");
		sb.append("<certStr>833ab6d57104b7fad640ec31ddca0e</certStr>");
		sb.append("<class>partner</class>");
		sb.append("<XMLTrans>");
		sb.append("<transType>13</transType>");
		sb.append("<sourceEmail>arlo.zhang26@ariix.com</sourceEmail>");
		sb.append("</XMLTrans>");
		sb.append("</XMLRequest>");
		return sb.toString();
	}
	
	public static String payment(){
		StringBuffer sb = new StringBuffer();
		sb.append("<XMLRequest>");
		sb.append("<certStr>833ab6d57104b7fad640ec31ddca0e</certStr>");
		sb.append("<class>partner</class>");
		sb.append("<XMLTrans>");
		sb.append("<transType>02</transType>");
		sb.append("<amount>100</amount>");
		sb.append("<recAccntNum>32287636</recAccntNum>");
		sb.append("<invNum>>My Invoice</invNum>");
		sb.append("</XMLTrans>");
		sb.append("</XMLRequest>");
		return sb.toString();
	}
	
	private static void getChildNodes(Element elem) {
		System.out.println(elem.getName());
		Iterator<Node> it = elem.nodeIterator();
		while (it.hasNext()) {
			Node node = it.next();
			if (node instanceof Element) {
				Element e1 = (Element) node;
				getChildNodes(e1);
			}

		}
	}
	
	public static String[] chars = new String[] { "a", "b", "c", "d", "e", "f",
			"g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
			"t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
			"W", "X", "Y", "Z" };

	public static String generateShortUuid() {
		StringBuffer shortBuffer = new StringBuffer();
		String uuid = UUID.randomUUID().toString().replace("-", "");
		for (int i = 0; i < 8; i++) {
			String str = uuid.substring(i * 4, i * 4 + 4);
			int x = Integer.parseInt(str, 16);
			shortBuffer.append(chars[x % 0x3E]);
		}
		return shortBuffer.toString();
	}
	
	public static String getStringDate() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		String dateString = formatter.format(currentTime);
		System.out.println("TIME:::" + dateString);
		return dateString;
	}

	public static String Getnum() {
		String t = getStringDate();
		int x = (int) (Math.random() * 900) + 100;
		String serial = t + x;
		return serial;
	}
}
