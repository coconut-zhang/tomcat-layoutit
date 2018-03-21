package com.ariix.twInvoice;

import java.math.BigDecimal;
import java.util.Date;

public class TravelDiscountCredit {
    private BigDecimal id;

    private BigDecimal custId;

    private Date createDate;

    private String trxType;

    private String trxSource;

    private String trxCurr;

    private BigDecimal trxAmount;

    private BigDecimal exchRate;

    private String defCurr;

    private BigDecimal defAmount;

    private BigDecimal usdAmount;

    private BigDecimal refNumber;

    private Date lastModifiedDate;

    private String lastModifiedBy;

    private String comments;

    private BigDecimal status;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getCustId() {
        return custId;
    }

    public void setCustId(BigDecimal custId) {
        this.custId = custId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getTrxType() {
        return trxType;
    }

    public void setTrxType(String trxType) {
        this.trxType = trxType == null ? null : trxType.trim();
    }

    public String getTrxSource() {
        return trxSource;
    }

    public void setTrxSource(String trxSource) {
        this.trxSource = trxSource == null ? null : trxSource.trim();
    }

    public String getTrxCurr() {
        return trxCurr;
    }

    public void setTrxCurr(String trxCurr) {
        this.trxCurr = trxCurr == null ? null : trxCurr.trim();
    }

    public BigDecimal getTrxAmount() {
        return trxAmount;
    }

    public void setTrxAmount(BigDecimal trxAmount) {
        this.trxAmount = trxAmount;
    }

    public BigDecimal getExchRate() {
        return exchRate;
    }

    public void setExchRate(BigDecimal exchRate) {
        this.exchRate = exchRate;
    }

    public String getDefCurr() {
        return defCurr;
    }

    public void setDefCurr(String defCurr) {
        this.defCurr = defCurr == null ? null : defCurr.trim();
    }

    public BigDecimal getDefAmount() {
        return defAmount;
    }

    public void setDefAmount(BigDecimal defAmount) {
        this.defAmount = defAmount;
    }

    public BigDecimal getUsdAmount() {
        return usdAmount;
    }

    public void setUsdAmount(BigDecimal usdAmount) {
        this.usdAmount = usdAmount;
    }

    public BigDecimal getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(BigDecimal refNumber) {
        this.refNumber = refNumber;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy == null ? null : lastModifiedBy.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }
}