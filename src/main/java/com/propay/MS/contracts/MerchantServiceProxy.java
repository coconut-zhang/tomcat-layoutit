package com.propay.MS.contracts;

public class MerchantServiceProxy implements com.propay.MS.contracts.MerchantService {
  private String _endpoint = null;
  private com.propay.MS.contracts.MerchantService merchantService = null;
  
  public MerchantServiceProxy() {
    _initMerchantServiceProxy();
  }
  
  public MerchantServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initMerchantServiceProxy();
  }
  
  private void _initMerchantServiceProxy() {
    try {
      merchantService = (new org.tempuri.PropayMerchantServiceLocator()).getBasicHttpBinding_MerchantService();
      if (merchantService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)merchantService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)merchantService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (merchantService != null)
      ((javax.xml.rpc.Stub)merchantService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.propay.MS.contracts.MerchantService getMerchantService() {
    if (merchantService == null)
      _initMerchantServiceProxy();
    return merchantService;
  }
  
  public com.propay.MS.types.SignupResponse signup(com.propay.MS.types.ID identification, com.propay.MS.types.SignupRequest signupRequest) throws java.rmi.RemoteException{
    if (merchantService == null)
      _initMerchantServiceProxy();
    return merchantService.signup(identification, signupRequest);
  }
  
  public com.propay.MS.types.TransferResult timedPull(com.propay.MS.types.ID identification, com.propay.MS.types.TimedPullRequest timedPullRequest) throws java.rmi.RemoteException{
    if (merchantService == null)
      _initMerchantServiceProxy();
    return merchantService.timedPull(identification, timedPullRequest);
  }
  
  public com.propay.MS.types.TransferResult propayToPropay(com.propay.MS.types.ID identification, com.propay.MS.types.PropayToPropay request) throws java.rmi.RemoteException{
    if (merchantService == null)
      _initMerchantServiceProxy();
    return merchantService.propayToPropay(identification, request);
  }
  
  
}