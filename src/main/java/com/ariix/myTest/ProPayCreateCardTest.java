package com.ariix.myTest;

import java.rmi.RemoteException;

import org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.Address;
import org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.BankAccount;

import com.propay.MS.contracts.MerchantService;
import com.propay.MS.contracts.MerchantServiceProxy;

public class ProPayCreateCardTest {

	public static void main(String[] args) throws RemoteException {
		com.propay.MS.types.ID id = new com.propay.MS.types.ID();
		com.propay.MS.types.SignupRequest req = new com.propay.MS.types.SignupRequest();
		
		id.setCertString("833ab6d57104b7fad640ec31ddca0e");
		id.setTermId("31ddca0e");
		
		Address addr = new Address();
		addr.setAddress1("Test Address");
		addr.setAddress2("");
		addr.setApartmentNumber("");
		addr.setCity("Rocky Hill");
		addr.setCountry("USA");
		addr.setState("CT");
		addr.setZip("06067");
		
		Address businessAddr = new Address();
		businessAddr.setAddress1("Test Address");
		businessAddr.setAddress2("");
		businessAddr.setApartmentNumber("");
		businessAddr.setCity("Rocky Hill");
		businessAddr.setCountry("USA");
		businessAddr.setState("CT");
		businessAddr.setZip("06067");
		
		Address mailAddr = new Address();
		mailAddr.setAddress1("Test Address");
		mailAddr.setAddress2("");
		mailAddr.setApartmentNumber("F");
		mailAddr.setCity("Planesville");
		mailAddr.setCountry("USA");
		mailAddr.setState("UT");
		mailAddr.setZip("84047");
		
		BankAccount bankAcc = new BankAccount();
		bankAcc.setAccountCountryCode("USA");
		bankAcc.setAccountOwnershipType("Personal");
		bankAcc.setAccountType("C");
		bankAcc.setBankAccountNumber("4111111111111111");  //
		bankAcc.setBankName("Wells Fargo");      //
		bankAcc.setRoutingNumber("102000076");   //
		
		req.setAddress(addr);
		//req.setBankAccount(bankAcc);
		//req.setBusinessAddress(businessAddr);
		req.setBusinessLegalName("ProPay Partner");
		req.setCurrencyCode("USD");
		req.setDateOfBirth("1981-01-01");
		req.setDayPhone("3934329876");
		//req.setDoingBusinessAs("PPA"); //
		req.setEveningPhone("8765463721");
		req.setExternalId("2212156565584");  //
		req.setFirstName("John");
		req.setLastName("Test");
		req.setMailAddress(mailAddr);
		req.setMiddleInitial("Q");
		//req.setPhonePIN("1234");
		req.setSocialSecurityNumber("333224445");//
		req.setSourceEmail("test1239856@propay.com");
		req.setTier("Merchant");
		
		com.propay.MS.types.SignupResponse resp = new com.propay.MS.types.SignupResponse();
		MerchantService mer = new MerchantServiceProxy();
		resp = mer.signup(id, req);
		
		System.out.println(resp.getAccountNumber());
		System.out.println(resp.getPassword());
		System.out.println(resp.getSourceEmail());
		System.out.println(resp.getStatus());
		System.out.println(resp.getTier());
	}

}
