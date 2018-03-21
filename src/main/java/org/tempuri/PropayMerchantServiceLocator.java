/**
 * PropayMerchantServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class PropayMerchantServiceLocator extends org.apache.axis.client.Service implements org.tempuri.PropayMerchantService {

    public PropayMerchantServiceLocator() {
    }


    public PropayMerchantServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PropayMerchantServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_MerchantService
    private java.lang.String BasicHttpBinding_MerchantService_address = "https://xmltestapi.propay.com/propayapi/propaymerchantservice.svc/soap";

    public java.lang.String getBasicHttpBinding_MerchantServiceAddress() {
        return BasicHttpBinding_MerchantService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_MerchantServiceWSDDServiceName = "BasicHttpBinding_MerchantService";

    public java.lang.String getBasicHttpBinding_MerchantServiceWSDDServiceName() {
        return BasicHttpBinding_MerchantServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_MerchantServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_MerchantServiceWSDDServiceName = name;
    }

    public com.propay.MS.contracts.MerchantService getBasicHttpBinding_MerchantService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_MerchantService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_MerchantService(endpoint);
    }

    public com.propay.MS.contracts.MerchantService getBasicHttpBinding_MerchantService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpBinding_MerchantServiceStub _stub = new org.tempuri.BasicHttpBinding_MerchantServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_MerchantServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_MerchantServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_MerchantService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.propay.MS.contracts.MerchantService.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpBinding_MerchantServiceStub _stub = new org.tempuri.BasicHttpBinding_MerchantServiceStub(new java.net.URL(BasicHttpBinding_MerchantService_address), this);
                _stub.setPortName(getBasicHttpBinding_MerchantServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_MerchantService".equals(inputPortName)) {
            return getBasicHttpBinding_MerchantService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "PropayMerchantService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_MerchantService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_MerchantService".equals(portName)) {
            setBasicHttpBinding_MerchantServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
