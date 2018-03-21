package com.ariix.myTest;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.codec.binary.Base64;

public class EncryptAndDecryptBankNumber {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(decryptBankAccountNumber("c0u9Vyx9D6g=6933"));

	}
	
	public static String encryptBankAccountNumber(String cardNumber) throws Exception {
		if(StringUtils.isBlank(cardNumber)){
			return cardNumber;
		}
		int cardNumberLength = cardNumber.length();
		String notNeedEncryptedPart = cardNumber.substring(cardNumberLength-4);
		String needEncryptedPart = cardNumber.substring(0, cardNumberLength-4);
		byte[] afterDes = Des.encrypt(needEncryptedPart.getBytes(), Des.strDefaultKey);
		byte[] secretArrBase64 = Base64.encodeBase64(afterDes);
		return new String(secretArrBase64) + notNeedEncryptedPart;		
	}
	
	public static String decryptBankAccountNumber(String encryptedCardNumber) throws Exception {
		if(StringUtils.isBlank(encryptedCardNumber)){
			return encryptedCardNumber;
		}
		String last4Digits = encryptedCardNumber.substring(encryptedCardNumber.length() - 4);
		byte[] base64Bytes = Base64.decodeBase64(encryptedCardNumber.substring(0, encryptedCardNumber.length() - 4));
		byte[] decodeBytes = Des.decrypt(base64Bytes, Des.strDefaultKey);
		return new String(decodeBytes) + last4Digits;
	}

}
