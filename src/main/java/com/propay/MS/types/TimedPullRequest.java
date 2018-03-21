/**
 * TimedPullRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.propay.MS.types;

public class TimedPullRequest  implements java.io.Serializable {
    private long accountNum;

    private long amount;

    private java.lang.String comment1;

    private java.lang.String comment2;

    private java.lang.String invNum;

    private long recAccntNum;

    private long transNum;

    public TimedPullRequest() {
    }

    public TimedPullRequest(
           long accountNum,
           long amount,
           java.lang.String comment1,
           java.lang.String comment2,
           java.lang.String invNum,
           long recAccntNum,
           long transNum) {
           this.accountNum = accountNum;
           this.amount = amount;
           this.comment1 = comment1;
           this.comment2 = comment2;
           this.invNum = invNum;
           this.recAccntNum = recAccntNum;
           this.transNum = transNum;
    }


    /**
     * Gets the accountNum value for this TimedPullRequest.
     * 
     * @return accountNum
     */
    public long getAccountNum() {
        return accountNum;
    }


    /**
     * Sets the accountNum value for this TimedPullRequest.
     * 
     * @param accountNum
     */
    public void setAccountNum(long accountNum) {
        this.accountNum = accountNum;
    }


    /**
     * Gets the amount value for this TimedPullRequest.
     * 
     * @return amount
     */
    public long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TimedPullRequest.
     * 
     * @param amount
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }


    /**
     * Gets the comment1 value for this TimedPullRequest.
     * 
     * @return comment1
     */
    public java.lang.String getComment1() {
        return comment1;
    }


    /**
     * Sets the comment1 value for this TimedPullRequest.
     * 
     * @param comment1
     */
    public void setComment1(java.lang.String comment1) {
        this.comment1 = comment1;
    }


    /**
     * Gets the comment2 value for this TimedPullRequest.
     * 
     * @return comment2
     */
    public java.lang.String getComment2() {
        return comment2;
    }


    /**
     * Sets the comment2 value for this TimedPullRequest.
     * 
     * @param comment2
     */
    public void setComment2(java.lang.String comment2) {
        this.comment2 = comment2;
    }


    /**
     * Gets the invNum value for this TimedPullRequest.
     * 
     * @return invNum
     */
    public java.lang.String getInvNum() {
        return invNum;
    }


    /**
     * Sets the invNum value for this TimedPullRequest.
     * 
     * @param invNum
     */
    public void setInvNum(java.lang.String invNum) {
        this.invNum = invNum;
    }


    /**
     * Gets the recAccntNum value for this TimedPullRequest.
     * 
     * @return recAccntNum
     */
    public long getRecAccntNum() {
        return recAccntNum;
    }


    /**
     * Sets the recAccntNum value for this TimedPullRequest.
     * 
     * @param recAccntNum
     */
    public void setRecAccntNum(long recAccntNum) {
        this.recAccntNum = recAccntNum;
    }


    /**
     * Gets the transNum value for this TimedPullRequest.
     * 
     * @return transNum
     */
    public long getTransNum() {
        return transNum;
    }


    /**
     * Sets the transNum value for this TimedPullRequest.
     * 
     * @param transNum
     */
    public void setTransNum(long transNum) {
        this.transNum = transNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimedPullRequest)) return false;
        TimedPullRequest other = (TimedPullRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountNum == other.getAccountNum() &&
            this.amount == other.getAmount() &&
            ((this.comment1==null && other.getComment1()==null) || 
             (this.comment1!=null &&
              this.comment1.equals(other.getComment1()))) &&
            ((this.comment2==null && other.getComment2()==null) || 
             (this.comment2!=null &&
              this.comment2.equals(other.getComment2()))) &&
            ((this.invNum==null && other.getInvNum()==null) || 
             (this.invNum!=null &&
              this.invNum.equals(other.getInvNum()))) &&
            this.recAccntNum == other.getRecAccntNum() &&
            this.transNum == other.getTransNum();
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
        _hashCode += new Long(getAccountNum()).hashCode();
        _hashCode += new Long(getAmount()).hashCode();
        if (getComment1() != null) {
            _hashCode += getComment1().hashCode();
        }
        if (getComment2() != null) {
            _hashCode += getComment2().hashCode();
        }
        if (getInvNum() != null) {
            _hashCode += getInvNum().hashCode();
        }
        _hashCode += new Long(getRecAccntNum()).hashCode();
        _hashCode += new Long(getTransNum()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimedPullRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://propay.com/MS/types", "TimedPullRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "accountNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "comment1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "comment2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "invNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recAccntNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "recAccntNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "transNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
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
