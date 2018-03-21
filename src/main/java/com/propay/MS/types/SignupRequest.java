/**
 * SignupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.propay.MS.types;

public class SignupRequest  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.Address address;

    private org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.BankAccount bankAccount;

    private org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.Address businessAddress;

    private java.lang.String businessLegalName;

    private java.lang.String creditCardNumber;

    private java.lang.String currencyCode;

    private java.lang.String dateOfBirth;

    private java.lang.String dayPhone;

    private java.lang.String doingBusinessAs;

    private java.lang.String EIN;

    private java.lang.String eveningPhone;

    private java.lang.String expirationDate;

    private java.lang.String externalId;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.Address mailAddress;

    private java.lang.String middleInitial;

    private java.lang.String paymentMethodId;

    private java.lang.String phonePIN;

    private org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.BankAccount secondaryBankAccount;

    private java.lang.String socialSecurityNumber;

    private java.lang.String sourceEmail;

    private java.lang.String tier;

    private java.lang.String userId;

    public SignupRequest() {
    }

    public SignupRequest(
           org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.Address address,
           org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.BankAccount bankAccount,
           org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.Address businessAddress,
           java.lang.String businessLegalName,
           java.lang.String creditCardNumber,
           java.lang.String currencyCode,
           java.lang.String dateOfBirth,
           java.lang.String dayPhone,
           java.lang.String doingBusinessAs,
           java.lang.String EIN,
           java.lang.String eveningPhone,
           java.lang.String expirationDate,
           java.lang.String externalId,
           java.lang.String firstName,
           java.lang.String lastName,
           org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.Address mailAddress,
           java.lang.String middleInitial,
           java.lang.String paymentMethodId,
           java.lang.String phonePIN,
           org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.BankAccount secondaryBankAccount,
           java.lang.String socialSecurityNumber,
           java.lang.String sourceEmail,
           java.lang.String tier,
           java.lang.String userId) {
           this.address = address;
           this.bankAccount = bankAccount;
           this.businessAddress = businessAddress;
           this.businessLegalName = businessLegalName;
           this.creditCardNumber = creditCardNumber;
           this.currencyCode = currencyCode;
           this.dateOfBirth = dateOfBirth;
           this.dayPhone = dayPhone;
           this.doingBusinessAs = doingBusinessAs;
           this.EIN = EIN;
           this.eveningPhone = eveningPhone;
           this.expirationDate = expirationDate;
           this.externalId = externalId;
           this.firstName = firstName;
           this.lastName = lastName;
           this.mailAddress = mailAddress;
           this.middleInitial = middleInitial;
           this.paymentMethodId = paymentMethodId;
           this.phonePIN = phonePIN;
           this.secondaryBankAccount = secondaryBankAccount;
           this.socialSecurityNumber = socialSecurityNumber;
           this.sourceEmail = sourceEmail;
           this.tier = tier;
           this.userId = userId;
    }


    /**
     * Gets the address value for this SignupRequest.
     * 
     * @return address
     */
    public org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this SignupRequest.
     * 
     * @param address
     */
    public void setAddress(org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.Address address) {
        this.address = address;
    }


    /**
     * Gets the bankAccount value for this SignupRequest.
     * 
     * @return bankAccount
     */
    public org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.BankAccount getBankAccount() {
        return bankAccount;
    }


    /**
     * Sets the bankAccount value for this SignupRequest.
     * 
     * @param bankAccount
     */
    public void setBankAccount(org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }


    /**
     * Gets the businessAddress value for this SignupRequest.
     * 
     * @return businessAddress
     */
    public org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.Address getBusinessAddress() {
        return businessAddress;
    }


    /**
     * Sets the businessAddress value for this SignupRequest.
     * 
     * @param businessAddress
     */
    public void setBusinessAddress(org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.Address businessAddress) {
        this.businessAddress = businessAddress;
    }


    /**
     * Gets the businessLegalName value for this SignupRequest.
     * 
     * @return businessLegalName
     */
    public java.lang.String getBusinessLegalName() {
        return businessLegalName;
    }


    /**
     * Sets the businessLegalName value for this SignupRequest.
     * 
     * @param businessLegalName
     */
    public void setBusinessLegalName(java.lang.String businessLegalName) {
        this.businessLegalName = businessLegalName;
    }


    /**
     * Gets the creditCardNumber value for this SignupRequest.
     * 
     * @return creditCardNumber
     */
    public java.lang.String getCreditCardNumber() {
        return creditCardNumber;
    }


    /**
     * Sets the creditCardNumber value for this SignupRequest.
     * 
     * @param creditCardNumber
     */
    public void setCreditCardNumber(java.lang.String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }


    /**
     * Gets the currencyCode value for this SignupRequest.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this SignupRequest.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the dateOfBirth value for this SignupRequest.
     * 
     * @return dateOfBirth
     */
    public java.lang.String getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this SignupRequest.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.lang.String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the dayPhone value for this SignupRequest.
     * 
     * @return dayPhone
     */
    public java.lang.String getDayPhone() {
        return dayPhone;
    }


    /**
     * Sets the dayPhone value for this SignupRequest.
     * 
     * @param dayPhone
     */
    public void setDayPhone(java.lang.String dayPhone) {
        this.dayPhone = dayPhone;
    }


    /**
     * Gets the doingBusinessAs value for this SignupRequest.
     * 
     * @return doingBusinessAs
     */
    public java.lang.String getDoingBusinessAs() {
        return doingBusinessAs;
    }


    /**
     * Sets the doingBusinessAs value for this SignupRequest.
     * 
     * @param doingBusinessAs
     */
    public void setDoingBusinessAs(java.lang.String doingBusinessAs) {
        this.doingBusinessAs = doingBusinessAs;
    }


    /**
     * Gets the EIN value for this SignupRequest.
     * 
     * @return EIN
     */
    public java.lang.String getEIN() {
        return EIN;
    }


    /**
     * Sets the EIN value for this SignupRequest.
     * 
     * @param EIN
     */
    public void setEIN(java.lang.String EIN) {
        this.EIN = EIN;
    }


    /**
     * Gets the eveningPhone value for this SignupRequest.
     * 
     * @return eveningPhone
     */
    public java.lang.String getEveningPhone() {
        return eveningPhone;
    }


    /**
     * Sets the eveningPhone value for this SignupRequest.
     * 
     * @param eveningPhone
     */
    public void setEveningPhone(java.lang.String eveningPhone) {
        this.eveningPhone = eveningPhone;
    }


    /**
     * Gets the expirationDate value for this SignupRequest.
     * 
     * @return expirationDate
     */
    public java.lang.String getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this SignupRequest.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.lang.String expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the externalId value for this SignupRequest.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this SignupRequest.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the firstName value for this SignupRequest.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this SignupRequest.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this SignupRequest.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this SignupRequest.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the mailAddress value for this SignupRequest.
     * 
     * @return mailAddress
     */
    public org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.Address getMailAddress() {
        return mailAddress;
    }


    /**
     * Sets the mailAddress value for this SignupRequest.
     * 
     * @param mailAddress
     */
    public void setMailAddress(org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.Address mailAddress) {
        this.mailAddress = mailAddress;
    }


    /**
     * Gets the middleInitial value for this SignupRequest.
     * 
     * @return middleInitial
     */
    public java.lang.String getMiddleInitial() {
        return middleInitial;
    }


    /**
     * Sets the middleInitial value for this SignupRequest.
     * 
     * @param middleInitial
     */
    public void setMiddleInitial(java.lang.String middleInitial) {
        this.middleInitial = middleInitial;
    }


    /**
     * Gets the paymentMethodId value for this SignupRequest.
     * 
     * @return paymentMethodId
     */
    public java.lang.String getPaymentMethodId() {
        return paymentMethodId;
    }


    /**
     * Sets the paymentMethodId value for this SignupRequest.
     * 
     * @param paymentMethodId
     */
    public void setPaymentMethodId(java.lang.String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }


    /**
     * Gets the phonePIN value for this SignupRequest.
     * 
     * @return phonePIN
     */
    public java.lang.String getPhonePIN() {
        return phonePIN;
    }


    /**
     * Sets the phonePIN value for this SignupRequest.
     * 
     * @param phonePIN
     */
    public void setPhonePIN(java.lang.String phonePIN) {
        this.phonePIN = phonePIN;
    }


    /**
     * Gets the secondaryBankAccount value for this SignupRequest.
     * 
     * @return secondaryBankAccount
     */
    public org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.BankAccount getSecondaryBankAccount() {
        return secondaryBankAccount;
    }


    /**
     * Sets the secondaryBankAccount value for this SignupRequest.
     * 
     * @param secondaryBankAccount
     */
    public void setSecondaryBankAccount(org.datacontract.schemas._2004._07.Propay_Contracts_MS_External.BankAccount secondaryBankAccount) {
        this.secondaryBankAccount = secondaryBankAccount;
    }


    /**
     * Gets the socialSecurityNumber value for this SignupRequest.
     * 
     * @return socialSecurityNumber
     */
    public java.lang.String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    /**
     * Sets the socialSecurityNumber value for this SignupRequest.
     * 
     * @param socialSecurityNumber
     */
    public void setSocialSecurityNumber(java.lang.String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    /**
     * Gets the sourceEmail value for this SignupRequest.
     * 
     * @return sourceEmail
     */
    public java.lang.String getSourceEmail() {
        return sourceEmail;
    }


    /**
     * Sets the sourceEmail value for this SignupRequest.
     * 
     * @param sourceEmail
     */
    public void setSourceEmail(java.lang.String sourceEmail) {
        this.sourceEmail = sourceEmail;
    }


    /**
     * Gets the tier value for this SignupRequest.
     * 
     * @return tier
     */
    public java.lang.String getTier() {
        return tier;
    }


    /**
     * Sets the tier value for this SignupRequest.
     * 
     * @param tier
     */
    public void setTier(java.lang.String tier) {
        this.tier = tier;
    }


    /**
     * Gets the userId value for this SignupRequest.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SignupRequest.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignupRequest)) return false;
        SignupRequest other = (SignupRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.bankAccount==null && other.getBankAccount()==null) || 
             (this.bankAccount!=null &&
              this.bankAccount.equals(other.getBankAccount()))) &&
            ((this.businessAddress==null && other.getBusinessAddress()==null) || 
             (this.businessAddress!=null &&
              this.businessAddress.equals(other.getBusinessAddress()))) &&
            ((this.businessLegalName==null && other.getBusinessLegalName()==null) || 
             (this.businessLegalName!=null &&
              this.businessLegalName.equals(other.getBusinessLegalName()))) &&
            ((this.creditCardNumber==null && other.getCreditCardNumber()==null) || 
             (this.creditCardNumber!=null &&
              this.creditCardNumber.equals(other.getCreditCardNumber()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.dayPhone==null && other.getDayPhone()==null) || 
             (this.dayPhone!=null &&
              this.dayPhone.equals(other.getDayPhone()))) &&
            ((this.doingBusinessAs==null && other.getDoingBusinessAs()==null) || 
             (this.doingBusinessAs!=null &&
              this.doingBusinessAs.equals(other.getDoingBusinessAs()))) &&
            ((this.EIN==null && other.getEIN()==null) || 
             (this.EIN!=null &&
              this.EIN.equals(other.getEIN()))) &&
            ((this.eveningPhone==null && other.getEveningPhone()==null) || 
             (this.eveningPhone!=null &&
              this.eveningPhone.equals(other.getEveningPhone()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.mailAddress==null && other.getMailAddress()==null) || 
             (this.mailAddress!=null &&
              this.mailAddress.equals(other.getMailAddress()))) &&
            ((this.middleInitial==null && other.getMiddleInitial()==null) || 
             (this.middleInitial!=null &&
              this.middleInitial.equals(other.getMiddleInitial()))) &&
            ((this.paymentMethodId==null && other.getPaymentMethodId()==null) || 
             (this.paymentMethodId!=null &&
              this.paymentMethodId.equals(other.getPaymentMethodId()))) &&
            ((this.phonePIN==null && other.getPhonePIN()==null) || 
             (this.phonePIN!=null &&
              this.phonePIN.equals(other.getPhonePIN()))) &&
            ((this.secondaryBankAccount==null && other.getSecondaryBankAccount()==null) || 
             (this.secondaryBankAccount!=null &&
              this.secondaryBankAccount.equals(other.getSecondaryBankAccount()))) &&
            ((this.socialSecurityNumber==null && other.getSocialSecurityNumber()==null) || 
             (this.socialSecurityNumber!=null &&
              this.socialSecurityNumber.equals(other.getSocialSecurityNumber()))) &&
            ((this.sourceEmail==null && other.getSourceEmail()==null) || 
             (this.sourceEmail!=null &&
              this.sourceEmail.equals(other.getSourceEmail()))) &&
            ((this.tier==null && other.getTier()==null) || 
             (this.tier!=null &&
              this.tier.equals(other.getTier()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getBankAccount() != null) {
            _hashCode += getBankAccount().hashCode();
        }
        if (getBusinessAddress() != null) {
            _hashCode += getBusinessAddress().hashCode();
        }
        if (getBusinessLegalName() != null) {
            _hashCode += getBusinessLegalName().hashCode();
        }
        if (getCreditCardNumber() != null) {
            _hashCode += getCreditCardNumber().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getDayPhone() != null) {
            _hashCode += getDayPhone().hashCode();
        }
        if (getDoingBusinessAs() != null) {
            _hashCode += getDoingBusinessAs().hashCode();
        }
        if (getEIN() != null) {
            _hashCode += getEIN().hashCode();
        }
        if (getEveningPhone() != null) {
            _hashCode += getEveningPhone().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getMailAddress() != null) {
            _hashCode += getMailAddress().hashCode();
        }
        if (getMiddleInitial() != null) {
            _hashCode += getMiddleInitial().hashCode();
        }
        if (getPaymentMethodId() != null) {
            _hashCode += getPaymentMethodId().hashCode();
        }
        if (getPhonePIN() != null) {
            _hashCode += getPhonePIN().hashCode();
        }
        if (getSecondaryBankAccount() != null) {
            _hashCode += getSecondaryBankAccount().hashCode();
        }
        if (getSocialSecurityNumber() != null) {
            _hashCode += getSocialSecurityNumber().hashCode();
        }
        if (getSourceEmail() != null) {
            _hashCode += getSourceEmail().hashCode();
        }
        if (getTier() != null) {
            _hashCode += getTier().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://propay.com/MS/types", "SignupRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Propay.Contracts.MS.External", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "BankAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Propay.Contracts.MS.External", "BankAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "BusinessAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Propay.Contracts.MS.External", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessLegalName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "BusinessLegalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "CreditCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "CurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "DateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "DayPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doingBusinessAs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "DoingBusinessAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "EIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eveningPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "EveningPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "ExternalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "MailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Propay.Contracts.MS.External", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleInitial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "MiddleInitial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethodId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "PaymentMethodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phonePIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "PhonePIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryBankAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "SecondaryBankAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Propay.Contracts.MS.External", "BankAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socialSecurityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "SocialSecurityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "SourceEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "Tier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://propay.com/MS/types", "UserId"));
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
