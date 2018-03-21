package com.ariix.twInvoice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TravelDiscountCreditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TravelDiscountCreditExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(BigDecimal value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(BigDecimal value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(BigDecimal value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(BigDecimal value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<BigDecimal> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<BigDecimal> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andTrxTypeIsNull() {
            addCriterion("TRX_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTrxTypeIsNotNull() {
            addCriterion("TRX_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTrxTypeEqualTo(String value) {
            addCriterion("TRX_TYPE =", value, "trxType");
            return (Criteria) this;
        }

        public Criteria andTrxTypeNotEqualTo(String value) {
            addCriterion("TRX_TYPE <>", value, "trxType");
            return (Criteria) this;
        }

        public Criteria andTrxTypeGreaterThan(String value) {
            addCriterion("TRX_TYPE >", value, "trxType");
            return (Criteria) this;
        }

        public Criteria andTrxTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRX_TYPE >=", value, "trxType");
            return (Criteria) this;
        }

        public Criteria andTrxTypeLessThan(String value) {
            addCriterion("TRX_TYPE <", value, "trxType");
            return (Criteria) this;
        }

        public Criteria andTrxTypeLessThanOrEqualTo(String value) {
            addCriterion("TRX_TYPE <=", value, "trxType");
            return (Criteria) this;
        }

        public Criteria andTrxTypeLike(String value) {
            addCriterion("TRX_TYPE like", value, "trxType");
            return (Criteria) this;
        }

        public Criteria andTrxTypeNotLike(String value) {
            addCriterion("TRX_TYPE not like", value, "trxType");
            return (Criteria) this;
        }

        public Criteria andTrxTypeIn(List<String> values) {
            addCriterion("TRX_TYPE in", values, "trxType");
            return (Criteria) this;
        }

        public Criteria andTrxTypeNotIn(List<String> values) {
            addCriterion("TRX_TYPE not in", values, "trxType");
            return (Criteria) this;
        }

        public Criteria andTrxTypeBetween(String value1, String value2) {
            addCriterion("TRX_TYPE between", value1, value2, "trxType");
            return (Criteria) this;
        }

        public Criteria andTrxTypeNotBetween(String value1, String value2) {
            addCriterion("TRX_TYPE not between", value1, value2, "trxType");
            return (Criteria) this;
        }

        public Criteria andTrxSourceIsNull() {
            addCriterion("TRX_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andTrxSourceIsNotNull() {
            addCriterion("TRX_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andTrxSourceEqualTo(String value) {
            addCriterion("TRX_SOURCE =", value, "trxSource");
            return (Criteria) this;
        }

        public Criteria andTrxSourceNotEqualTo(String value) {
            addCriterion("TRX_SOURCE <>", value, "trxSource");
            return (Criteria) this;
        }

        public Criteria andTrxSourceGreaterThan(String value) {
            addCriterion("TRX_SOURCE >", value, "trxSource");
            return (Criteria) this;
        }

        public Criteria andTrxSourceGreaterThanOrEqualTo(String value) {
            addCriterion("TRX_SOURCE >=", value, "trxSource");
            return (Criteria) this;
        }

        public Criteria andTrxSourceLessThan(String value) {
            addCriterion("TRX_SOURCE <", value, "trxSource");
            return (Criteria) this;
        }

        public Criteria andTrxSourceLessThanOrEqualTo(String value) {
            addCriterion("TRX_SOURCE <=", value, "trxSource");
            return (Criteria) this;
        }

        public Criteria andTrxSourceLike(String value) {
            addCriterion("TRX_SOURCE like", value, "trxSource");
            return (Criteria) this;
        }

        public Criteria andTrxSourceNotLike(String value) {
            addCriterion("TRX_SOURCE not like", value, "trxSource");
            return (Criteria) this;
        }

        public Criteria andTrxSourceIn(List<String> values) {
            addCriterion("TRX_SOURCE in", values, "trxSource");
            return (Criteria) this;
        }

        public Criteria andTrxSourceNotIn(List<String> values) {
            addCriterion("TRX_SOURCE not in", values, "trxSource");
            return (Criteria) this;
        }

        public Criteria andTrxSourceBetween(String value1, String value2) {
            addCriterion("TRX_SOURCE between", value1, value2, "trxSource");
            return (Criteria) this;
        }

        public Criteria andTrxSourceNotBetween(String value1, String value2) {
            addCriterion("TRX_SOURCE not between", value1, value2, "trxSource");
            return (Criteria) this;
        }

        public Criteria andTrxCurrIsNull() {
            addCriterion("TRX_CURR is null");
            return (Criteria) this;
        }

        public Criteria andTrxCurrIsNotNull() {
            addCriterion("TRX_CURR is not null");
            return (Criteria) this;
        }

        public Criteria andTrxCurrEqualTo(String value) {
            addCriterion("TRX_CURR =", value, "trxCurr");
            return (Criteria) this;
        }

        public Criteria andTrxCurrNotEqualTo(String value) {
            addCriterion("TRX_CURR <>", value, "trxCurr");
            return (Criteria) this;
        }

        public Criteria andTrxCurrGreaterThan(String value) {
            addCriterion("TRX_CURR >", value, "trxCurr");
            return (Criteria) this;
        }

        public Criteria andTrxCurrGreaterThanOrEqualTo(String value) {
            addCriterion("TRX_CURR >=", value, "trxCurr");
            return (Criteria) this;
        }

        public Criteria andTrxCurrLessThan(String value) {
            addCriterion("TRX_CURR <", value, "trxCurr");
            return (Criteria) this;
        }

        public Criteria andTrxCurrLessThanOrEqualTo(String value) {
            addCriterion("TRX_CURR <=", value, "trxCurr");
            return (Criteria) this;
        }

        public Criteria andTrxCurrLike(String value) {
            addCriterion("TRX_CURR like", value, "trxCurr");
            return (Criteria) this;
        }

        public Criteria andTrxCurrNotLike(String value) {
            addCriterion("TRX_CURR not like", value, "trxCurr");
            return (Criteria) this;
        }

        public Criteria andTrxCurrIn(List<String> values) {
            addCriterion("TRX_CURR in", values, "trxCurr");
            return (Criteria) this;
        }

        public Criteria andTrxCurrNotIn(List<String> values) {
            addCriterion("TRX_CURR not in", values, "trxCurr");
            return (Criteria) this;
        }

        public Criteria andTrxCurrBetween(String value1, String value2) {
            addCriterion("TRX_CURR between", value1, value2, "trxCurr");
            return (Criteria) this;
        }

        public Criteria andTrxCurrNotBetween(String value1, String value2) {
            addCriterion("TRX_CURR not between", value1, value2, "trxCurr");
            return (Criteria) this;
        }

        public Criteria andTrxAmountIsNull() {
            addCriterion("TRX_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTrxAmountIsNotNull() {
            addCriterion("TRX_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTrxAmountEqualTo(BigDecimal value) {
            addCriterion("TRX_AMOUNT =", value, "trxAmount");
            return (Criteria) this;
        }

        public Criteria andTrxAmountNotEqualTo(BigDecimal value) {
            addCriterion("TRX_AMOUNT <>", value, "trxAmount");
            return (Criteria) this;
        }

        public Criteria andTrxAmountGreaterThan(BigDecimal value) {
            addCriterion("TRX_AMOUNT >", value, "trxAmount");
            return (Criteria) this;
        }

        public Criteria andTrxAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRX_AMOUNT >=", value, "trxAmount");
            return (Criteria) this;
        }

        public Criteria andTrxAmountLessThan(BigDecimal value) {
            addCriterion("TRX_AMOUNT <", value, "trxAmount");
            return (Criteria) this;
        }

        public Criteria andTrxAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRX_AMOUNT <=", value, "trxAmount");
            return (Criteria) this;
        }

        public Criteria andTrxAmountIn(List<BigDecimal> values) {
            addCriterion("TRX_AMOUNT in", values, "trxAmount");
            return (Criteria) this;
        }

        public Criteria andTrxAmountNotIn(List<BigDecimal> values) {
            addCriterion("TRX_AMOUNT not in", values, "trxAmount");
            return (Criteria) this;
        }

        public Criteria andTrxAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRX_AMOUNT between", value1, value2, "trxAmount");
            return (Criteria) this;
        }

        public Criteria andTrxAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRX_AMOUNT not between", value1, value2, "trxAmount");
            return (Criteria) this;
        }

        public Criteria andExchRateIsNull() {
            addCriterion("EXCH_RATE is null");
            return (Criteria) this;
        }

        public Criteria andExchRateIsNotNull() {
            addCriterion("EXCH_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andExchRateEqualTo(BigDecimal value) {
            addCriterion("EXCH_RATE =", value, "exchRate");
            return (Criteria) this;
        }

        public Criteria andExchRateNotEqualTo(BigDecimal value) {
            addCriterion("EXCH_RATE <>", value, "exchRate");
            return (Criteria) this;
        }

        public Criteria andExchRateGreaterThan(BigDecimal value) {
            addCriterion("EXCH_RATE >", value, "exchRate");
            return (Criteria) this;
        }

        public Criteria andExchRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCH_RATE >=", value, "exchRate");
            return (Criteria) this;
        }

        public Criteria andExchRateLessThan(BigDecimal value) {
            addCriterion("EXCH_RATE <", value, "exchRate");
            return (Criteria) this;
        }

        public Criteria andExchRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCH_RATE <=", value, "exchRate");
            return (Criteria) this;
        }

        public Criteria andExchRateIn(List<BigDecimal> values) {
            addCriterion("EXCH_RATE in", values, "exchRate");
            return (Criteria) this;
        }

        public Criteria andExchRateNotIn(List<BigDecimal> values) {
            addCriterion("EXCH_RATE not in", values, "exchRate");
            return (Criteria) this;
        }

        public Criteria andExchRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCH_RATE between", value1, value2, "exchRate");
            return (Criteria) this;
        }

        public Criteria andExchRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCH_RATE not between", value1, value2, "exchRate");
            return (Criteria) this;
        }

        public Criteria andDefCurrIsNull() {
            addCriterion("DEF_CURR is null");
            return (Criteria) this;
        }

        public Criteria andDefCurrIsNotNull() {
            addCriterion("DEF_CURR is not null");
            return (Criteria) this;
        }

        public Criteria andDefCurrEqualTo(String value) {
            addCriterion("DEF_CURR =", value, "defCurr");
            return (Criteria) this;
        }

        public Criteria andDefCurrNotEqualTo(String value) {
            addCriterion("DEF_CURR <>", value, "defCurr");
            return (Criteria) this;
        }

        public Criteria andDefCurrGreaterThan(String value) {
            addCriterion("DEF_CURR >", value, "defCurr");
            return (Criteria) this;
        }

        public Criteria andDefCurrGreaterThanOrEqualTo(String value) {
            addCriterion("DEF_CURR >=", value, "defCurr");
            return (Criteria) this;
        }

        public Criteria andDefCurrLessThan(String value) {
            addCriterion("DEF_CURR <", value, "defCurr");
            return (Criteria) this;
        }

        public Criteria andDefCurrLessThanOrEqualTo(String value) {
            addCriterion("DEF_CURR <=", value, "defCurr");
            return (Criteria) this;
        }

        public Criteria andDefCurrLike(String value) {
            addCriterion("DEF_CURR like", value, "defCurr");
            return (Criteria) this;
        }

        public Criteria andDefCurrNotLike(String value) {
            addCriterion("DEF_CURR not like", value, "defCurr");
            return (Criteria) this;
        }

        public Criteria andDefCurrIn(List<String> values) {
            addCriterion("DEF_CURR in", values, "defCurr");
            return (Criteria) this;
        }

        public Criteria andDefCurrNotIn(List<String> values) {
            addCriterion("DEF_CURR not in", values, "defCurr");
            return (Criteria) this;
        }

        public Criteria andDefCurrBetween(String value1, String value2) {
            addCriterion("DEF_CURR between", value1, value2, "defCurr");
            return (Criteria) this;
        }

        public Criteria andDefCurrNotBetween(String value1, String value2) {
            addCriterion("DEF_CURR not between", value1, value2, "defCurr");
            return (Criteria) this;
        }

        public Criteria andDefAmountIsNull() {
            addCriterion("DEF_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDefAmountIsNotNull() {
            addCriterion("DEF_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDefAmountEqualTo(BigDecimal value) {
            addCriterion("DEF_AMOUNT =", value, "defAmount");
            return (Criteria) this;
        }

        public Criteria andDefAmountNotEqualTo(BigDecimal value) {
            addCriterion("DEF_AMOUNT <>", value, "defAmount");
            return (Criteria) this;
        }

        public Criteria andDefAmountGreaterThan(BigDecimal value) {
            addCriterion("DEF_AMOUNT >", value, "defAmount");
            return (Criteria) this;
        }

        public Criteria andDefAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEF_AMOUNT >=", value, "defAmount");
            return (Criteria) this;
        }

        public Criteria andDefAmountLessThan(BigDecimal value) {
            addCriterion("DEF_AMOUNT <", value, "defAmount");
            return (Criteria) this;
        }

        public Criteria andDefAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEF_AMOUNT <=", value, "defAmount");
            return (Criteria) this;
        }

        public Criteria andDefAmountIn(List<BigDecimal> values) {
            addCriterion("DEF_AMOUNT in", values, "defAmount");
            return (Criteria) this;
        }

        public Criteria andDefAmountNotIn(List<BigDecimal> values) {
            addCriterion("DEF_AMOUNT not in", values, "defAmount");
            return (Criteria) this;
        }

        public Criteria andDefAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEF_AMOUNT between", value1, value2, "defAmount");
            return (Criteria) this;
        }

        public Criteria andDefAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEF_AMOUNT not between", value1, value2, "defAmount");
            return (Criteria) this;
        }

        public Criteria andUsdAmountIsNull() {
            addCriterion("USD_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andUsdAmountIsNotNull() {
            addCriterion("USD_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUsdAmountEqualTo(BigDecimal value) {
            addCriterion("USD_AMOUNT =", value, "usdAmount");
            return (Criteria) this;
        }

        public Criteria andUsdAmountNotEqualTo(BigDecimal value) {
            addCriterion("USD_AMOUNT <>", value, "usdAmount");
            return (Criteria) this;
        }

        public Criteria andUsdAmountGreaterThan(BigDecimal value) {
            addCriterion("USD_AMOUNT >", value, "usdAmount");
            return (Criteria) this;
        }

        public Criteria andUsdAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USD_AMOUNT >=", value, "usdAmount");
            return (Criteria) this;
        }

        public Criteria andUsdAmountLessThan(BigDecimal value) {
            addCriterion("USD_AMOUNT <", value, "usdAmount");
            return (Criteria) this;
        }

        public Criteria andUsdAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USD_AMOUNT <=", value, "usdAmount");
            return (Criteria) this;
        }

        public Criteria andUsdAmountIn(List<BigDecimal> values) {
            addCriterion("USD_AMOUNT in", values, "usdAmount");
            return (Criteria) this;
        }

        public Criteria andUsdAmountNotIn(List<BigDecimal> values) {
            addCriterion("USD_AMOUNT not in", values, "usdAmount");
            return (Criteria) this;
        }

        public Criteria andUsdAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USD_AMOUNT between", value1, value2, "usdAmount");
            return (Criteria) this;
        }

        public Criteria andUsdAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USD_AMOUNT not between", value1, value2, "usdAmount");
            return (Criteria) this;
        }

        public Criteria andRefNumberIsNull() {
            addCriterion("REF_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andRefNumberIsNotNull() {
            addCriterion("REF_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andRefNumberEqualTo(BigDecimal value) {
            addCriterion("REF_NUMBER =", value, "refNumber");
            return (Criteria) this;
        }

        public Criteria andRefNumberNotEqualTo(BigDecimal value) {
            addCriterion("REF_NUMBER <>", value, "refNumber");
            return (Criteria) this;
        }

        public Criteria andRefNumberGreaterThan(BigDecimal value) {
            addCriterion("REF_NUMBER >", value, "refNumber");
            return (Criteria) this;
        }

        public Criteria andRefNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REF_NUMBER >=", value, "refNumber");
            return (Criteria) this;
        }

        public Criteria andRefNumberLessThan(BigDecimal value) {
            addCriterion("REF_NUMBER <", value, "refNumber");
            return (Criteria) this;
        }

        public Criteria andRefNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REF_NUMBER <=", value, "refNumber");
            return (Criteria) this;
        }

        public Criteria andRefNumberIn(List<BigDecimal> values) {
            addCriterion("REF_NUMBER in", values, "refNumber");
            return (Criteria) this;
        }

        public Criteria andRefNumberNotIn(List<BigDecimal> values) {
            addCriterion("REF_NUMBER not in", values, "refNumber");
            return (Criteria) this;
        }

        public Criteria andRefNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REF_NUMBER between", value1, value2, "refNumber");
            return (Criteria) this;
        }

        public Criteria andRefNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REF_NUMBER not between", value1, value2, "refNumber");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIsNull() {
            addCriterion("LAST_MODIFIED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIsNotNull() {
            addCriterion("LAST_MODIFIED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE =", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE <>", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateGreaterThan(Date value) {
            addCriterion("LAST_MODIFIED_DATE >", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE >=", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateLessThan(Date value) {
            addCriterion("LAST_MODIFIED_DATE <", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFIED_DATE <=", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_DATE in", values, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotIn(List<Date> values) {
            addCriterion("LAST_MODIFIED_DATE not in", values, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_DATE between", value1, value2, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFIED_DATE not between", value1, value2, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIsNull() {
            addCriterion("LAST_MODIFIED_BY is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIsNotNull() {
            addCriterion("LAST_MODIFIED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByEqualTo(String value) {
            addCriterion("LAST_MODIFIED_BY =", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotEqualTo(String value) {
            addCriterion("LAST_MODIFIED_BY <>", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByGreaterThan(String value) {
            addCriterion("LAST_MODIFIED_BY >", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFIED_BY >=", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByLessThan(String value) {
            addCriterion("LAST_MODIFIED_BY <", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByLessThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFIED_BY <=", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByLike(String value) {
            addCriterion("LAST_MODIFIED_BY like", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotLike(String value) {
            addCriterion("LAST_MODIFIED_BY not like", value, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByIn(List<String> values) {
            addCriterion("LAST_MODIFIED_BY in", values, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotIn(List<String> values) {
            addCriterion("LAST_MODIFIED_BY not in", values, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByBetween(String value1, String value2) {
            addCriterion("LAST_MODIFIED_BY between", value1, value2, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andLastModifiedByNotBetween(String value1, String value2) {
            addCriterion("LAST_MODIFIED_BY not between", value1, value2, "lastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(BigDecimal value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(BigDecimal value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(BigDecimal value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(BigDecimal value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<BigDecimal> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<BigDecimal> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}