/**
 * PropayToPropay.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.propay.MS.types;

public class PropayToPropay  implements java.io.Serializable {
    private long amount;

    private java.lang.String invNum;

    private long recAccntNum;

    public PropayToPropay() {
    }

    public PropayToPropay(
           long amount,
           java.lang.String invNum,
           long recAccntNum) {
           this.amount = amount;
           this.invNum = invNum;
           this.recAccntNum = recAccntNum;
    }


    /**
     * Gets the amount value for this PropayToPropay.
     * 
     * @return amount
     */
    public long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PropayToPropay.
     * 
     * @param amount
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }


    /**
     * Gets the invNum value for this PropayToPropay.
     * 
     * @return invNum
     */
    public java.lang.String getInvNum() {
        return invNum;
    }


    /**
     * Sets the invNum value for this PropayToPropay.
     * 
     * @param invNum
     */
    public void setInvNum(java.lang.String invNum) {
        this.invNum = invNum;
    }


    /**
     * Gets the recAccntNum value for this PropayToPropay.
     * 
     * @return recAccntNum
     */
    public long getRecAccntNum() {
        return recAccntNum;
    }


    /**
     * Sets the recAccntNum value for this PropayToPropay.
     * 
     * @param recAccntNum
     */
    public void setRecAccntNum(long recAccntNum) {
        this.recAccntNum = recAccntNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropayToPropay)) return false;
        PropayToPropay other = (PropayToPropay) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.amount == other.getAmount() &&
            ((this.invNum==null && other.getInvNum()==null) || 
             (this.invNum!=null &&
              this.invNum.equals(other.getInvNum()))) &&
            this.recAccntNum == other.getRecAccntNum();
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
        _hashCode += new Long(getAmount()).hashCode();
        if (getInvNum() != null) {
            _hashCode += getInvNum().hashCode();
        }
        _hashCode += new Long(getRecAccntNum()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PropayToPropay.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://propay.com/MS/types", "PropayToPropay"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
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
