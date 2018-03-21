package com.ariix.myTest;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

import org.apache.commons.codec.binary.Base64;


public class Des {

	
		public static String strDefaultKey = "BOC_PLFP"; 
	  
	    private static final byte[] iv = {0x12, 0x34, 0x56, 0x78, (byte) 0x90, (byte) 0xab, (byte) 0xcd, (byte) 0xef};  
	   
	    public static byte[] encrypt(byte[] arrB, String key) throws Exception {  
	        DESKeySpec desKeySpec = new DESKeySpec(key.getBytes("UTF-8"));  
	  
	        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");  
	        SecretKey secretKey = keyFactory.generateSecret(desKeySpec);  
	        IvParameterSpec ivp = new IvParameterSpec(Des.iv);  
	  
	        Cipher encryptCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");  
	        encryptCipher.init(Cipher.ENCRYPT_MODE, secretKey, ivp);  
	  
	        return encryptCipher.doFinal(arrB);  
	    }  
	  
	    
	    public static String encrypt(String xml, String key) throws Exception {  
	        //return DESPlus.enc.encode(encrypt(xml.getBytes(), key));  
	    	return new String(encrypt(xml.getBytes("UTF-8"), key));   
	    }  
	  
	     
	    public static String encrypt(String xml) throws Exception {  
	        return encrypt(xml, strDefaultKey);  
	    }  
	  

	    public static byte[] decrypt(byte[] arrB, String key) throws Exception {  
	        DESKeySpec desKeySpec = new DESKeySpec(key.getBytes());  
	  
	        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");  
	        SecretKey secretKey = keyFactory.generateSecret(desKeySpec);  
	        IvParameterSpec ivp = new IvParameterSpec(Des.iv);  
	  
	        Cipher decryptCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");  
	        decryptCipher.init(Cipher.DECRYPT_MODE, secretKey, ivp);  
	  
	        return decryptCipher.doFinal(arrB);  
	    }  
	  
 
	    public static String decrypt(String xml, String key) throws Exception {  
	    	byte[] ret = decrypt(Base64.decodeBase64(xml.getBytes("UTF-8")),key);  
	        return new String(ret,"UTF-8"); 
	    }  
	  
 
	    public static String decrypt(String xml) throws Exception {  
	        return decrypt(xml, strDefaultKey);  
	    }  
	  
 
	    private Key getKey(byte[] arrBTmp) throws Exception {  
	        
	        byte[] arrB = new byte[8];  
	  

	        for (int i = 0; i < arrBTmp.length && i < arrB.length; i++) {  
	            arrB[i] = arrBTmp[i];  
	        }  
	  

	        Key key = new javax.crypto.spec.SecretKeySpec(arrB, "DES");  
	  
	        return key;  
	    }  
	  

	    public static String getDesKey() {  
	        return Des.strDefaultKey;  
	    }  
}
