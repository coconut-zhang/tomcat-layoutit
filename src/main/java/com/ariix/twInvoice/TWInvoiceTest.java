package com.ariix.twInvoice;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.tempuri.ServiceSoapStub;

public class TWInvoiceTest {

	public static void main(String[] args){
		try {
			java.net.URL endpointURL = new java.net.URL("http://172.31.34.45/INVWS/service.asmx?WSDL");
			//java.net.URL endpointURL = new java.net.URL("http://invoice.cetustek.com.tw:83/INVWS/service.asmx?WSDL");
			ServiceSoapStub serviceSoapStub = new ServiceSoapStub(endpointURL,null);
			
			String data0 = "CIA|arlo101|2017/11/20|da002541|53118823|爱睿希公司|arlo.zhang@ariix.com|空港经济区|1|0|3J0002|/K.1TI+P|/K.1TI+P|||001,進口鑽石,1,克拉,9522.8571;002,進口黃 金,1,兩,28570.4762";
			String data01 = "CIA|35231456|2017/11/23|6000001|53118823|ariix|arlo.zhang@ariix.com|空港经济区|1|0|3J0002|/K.1TI+P|/K.1TI+P|||100.020101,高效抗氧化剂 ,1,,55.58";
			String data1 = "YG11140500|3699|退貨";
			String data2 = "CIA|YB07200302|5441";
			String posid = "Ariix002";
			
			String data3 = "arlo03";
			
			//String result0 = serviceSoapStub.API_CreateInvoice(data01, posid);
			//System.out.println(result0);
			
			String result1 = serviceSoapStub.API_CancelInvoice(data1, posid);
			System.out.println(result1);
			
			//String result2 = serviceSoapStub.API_PrintInvoice(data2, posid);
			//System.out.println(result2);
			
			//String result3 = serviceSoapStub.API_QueryInvoiceByOrderid(data3);
			//System.out.println(result3);
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
