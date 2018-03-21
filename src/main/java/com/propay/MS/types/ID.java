/**
 * ID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.propay.MS.types;

public class ID  implements java.io.Serializable {
    private java.lang.String certString;

    private java.lang.String termId;

    public ID() {
    }

    public ID(
           java.lang.String certString,
           java.lang.String termId) {
           this.certString = certString;
           this.termId = termId;
    }


    /**
     * Gets the certString value for this ID.
     * 
     * @return certString
     */
    public java.lang.String getCertString() {
        return certString;
    }


    /**
     * Sets the certString value for this ID.
     * 
     * @param certString
     */
    public void setCertString(java.lang.String certString) {
        this.certString = certString;
    }


    /**
     * Gets the termId value for this ID.
     * 
     * @return termId
     */
    public java.lang.String getTermId() {
        return termId;
    }


    /**
     * Sets the termId value for this ID.
     * 
     * @param termId
     */
    public void setTermId(java.lang.String termId) {
        this.termId = termId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID)) return false;
        ID other = (ID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certString==null && other.getCertString()==null) || 
             (this.certString!=null &&
              this.certString.equals(other.getCertString()))) &&
            ((this.termId==null && other.getTermId()==null) || 
             (this.termId!=null &&
              this.termId.equals(other.getTermId())));
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
        if (getCertString() != null) {
            _hashCode += getCertString().hashCode();
        }
        if (getTermId() != null) {
            _hashCode += getTermId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://propay.com/MS/types", "ID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "CertString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "TermId"));
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
