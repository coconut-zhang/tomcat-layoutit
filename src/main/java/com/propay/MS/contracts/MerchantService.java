/**
 * MerchantService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.propay.MS.contracts;

public interface MerchantService extends java.rmi.Remote {
    public com.propay.MS.types.SignupResponse signup(com.propay.MS.types.ID identification, com.propay.MS.types.SignupRequest signupRequest) throws java.rmi.RemoteException;
    public com.propay.MS.types.TransferResult timedPull(com.propay.MS.types.ID identification, com.propay.MS.types.TimedPullRequest timedPullRequest) throws java.rmi.RemoteException;
    public com.propay.MS.types.TransferResult propayToPropay(com.propay.MS.types.ID identification, com.propay.MS.types.PropayToPropay request) throws java.rmi.RemoteException;
}
