/**
 * BankAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Propay_Contracts_MS_External;

public class BankAccount  implements java.io.Serializable {
    private java.lang.String accountCountryCode;

    private java.lang.String accountOwnershipType;

    private java.lang.String accountType;

    private java.lang.String bankAccountNumber;

    private java.lang.String bankName;

    private java.lang.String routingNumber;

    public BankAccount() {
    }

    public BankAccount(
           java.lang.String accountCountryCode,
           java.lang.String accountOwnershipType,
           java.lang.String accountType,
           java.lang.String bankAccountNumber,
           java.lang.String bankName,
           java.lang.String routingNumber) {
           this.accountCountryCode = accountCountryCode;
           this.accountOwnershipType = accountOwnershipType;
           this.accountType = accountType;
           this.bankAccountNumber = bankAccountNumber;
           this.bankName = bankName;
           this.routingNumber = routingNumber;
    }


    /**
     * Gets the accountCountryCode value for this BankAccount.
     * 
     * @return accountCountryCode
     */
    public java.lang.String getAccountCountryCode() {
        return accountCountryCode;
    }


    /**
     * Sets the accountCountryCode value for this BankAccount.
     * 
     * @param accountCountryCode
     */
    public void setAccountCountryCode(java.lang.String accountCountryCode) {
        this.accountCountryCode = accountCountryCode;
    }


    /**
     * Gets the accountOwnershipType value for this BankAccount.
     * 
     * @return accountOwnershipType
     */
    public java.lang.String getAccountOwnershipType() {
        return accountOwnershipType;
    }


    /**
     * Sets the accountOwnershipType value for this BankAccount.
     * 
     * @param accountOwnershipType
     */
    public void setAccountOwnershipType(java.lang.String accountOwnershipType) {
        this.accountOwnershipType = accountOwnershipType;
    }


    /**
     * Gets the accountType value for this BankAccount.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this BankAccount.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the bankAccountNumber value for this BankAccount.
     * 
     * @return bankAccountNumber
     */
    public java.lang.String getBankAccountNumber() {
        return bankAccountNumber;
    }


    /**
     * Sets the bankAccountNumber value for this BankAccount.
     * 
     * @param bankAccountNumber
     */
    public void setBankAccountNumber(java.lang.String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }


    /**
     * Gets the bankName value for this BankAccount.
     * 
     * @return bankName
     */
    public java.lang.String getBankName() {
        return bankName;
    }


    /**
     * Sets the bankName value for this BankAccount.
     * 
     * @param bankName
     */
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }


    /**
     * Gets the routingNumber value for this BankAccount.
     * 
     * @return routingNumber
     */
    public java.lang.String getRoutingNumber() {
        return routingNumber;
    }


    /**
     * Sets the routingNumber value for this BankAccount.
     * 
     * @param routingNumber
     */
    public void setRoutingNumber(java.lang.String routingNumber) {
        this.routingNumber = routingNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankAccount)) return false;
        BankAccount other = (BankAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountCountryCode==null && other.getAccountCountryCode()==null) || 
             (this.accountCountryCode!=null &&
              this.accountCountryCode.equals(other.getAccountCountryCode()))) &&
            ((this.accountOwnershipType==null && other.getAccountOwnershipType()==null) || 
             (this.accountOwnershipType!=null &&
              this.accountOwnershipType.equals(other.getAccountOwnershipType()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.bankAccountNumber==null && other.getBankAccountNumber()==null) || 
             (this.bankAccountNumber!=null &&
              this.bankAccountNumber.equals(other.getBankAccountNumber()))) &&
            ((this.bankName==null && other.getBankName()==null) || 
             (this.bankName!=null &&
              this.bankName.equals(other.getBankName()))) &&
            ((this.routingNumber==null && other.getRoutingNumber()==null) || 
             (this.routingNumber!=null &&
              this.routingNumber.equals(other.getRoutingNumber())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccountCountryCode() != null) {
            _hashCode += getAccountCountryCode().hashCode();
        }
        if (getAccountOwnershipType() != null) {
            _hashCode += getAccountOwnershipType().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getBankAccountNumber() != null) {
            _hashCode += getBankAccountNumber().hashCode();
        }
        if (getBankName() != null) {
            _hashCode += getBankName().hashCode();
        }
        if (getRoutingNumber() != null) {
            _hashCode += getRoutingNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Propay.Contracts.MS.External", "BankAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Propay.Contracts.MS.External", "AccountCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountOwnershipType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Propay.Contracts.MS.External", "AccountOwnershipType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Propay.Contracts.MS.External", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Propay.Contracts.MS.External", "BankAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Propay.Contracts.MS.External", "BankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Propay.Contracts.MS.External", "RoutingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
