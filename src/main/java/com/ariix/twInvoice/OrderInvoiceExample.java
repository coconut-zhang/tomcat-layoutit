package com.ariix.twInvoice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInvoiceExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andApiIsNull() {
            addCriterion("API is null");
            return (Criteria) this;
        }

        public Criteria andApiIsNotNull() {
            addCriterion("API is not null");
            return (Criteria) this;
        }

        public Criteria andApiEqualTo(String value) {
            addCriterion("API =", value, "api");
            return (Criteria) this;
        }

        public Criteria andApiNotEqualTo(String value) {
            addCriterion("API <>", value, "api");
            return (Criteria) this;
        }

        public Criteria andApiGreaterThan(String value) {
            addCriterion("API >", value, "api");
            return (Criteria) this;
        }

        public Criteria andApiGreaterThanOrEqualTo(String value) {
            addCriterion("API >=", value, "api");
            return (Criteria) this;
        }

        public Criteria andApiLessThan(String value) {
            addCriterion("API <", value, "api");
            return (Criteria) this;
        }

        public Criteria andApiLessThanOrEqualTo(String value) {
            addCriterion("API <=", value, "api");
            return (Criteria) this;
        }

        public Criteria andApiLike(String value) {
            addCriterion("API like", value, "api");
            return (Criteria) this;
        }

        public Criteria andApiNotLike(String value) {
            addCriterion("API not like", value, "api");
            return (Criteria) this;
        }

        public Criteria andApiIn(List<String> values) {
            addCriterion("API in", values, "api");
            return (Criteria) this;
        }

        public Criteria andApiNotIn(List<String> values) {
            addCriterion("API not in", values, "api");
            return (Criteria) this;
        }

        public Criteria andApiBetween(String value1, String value2) {
            addCriterion("API between", value1, value2, "api");
            return (Criteria) this;
        }

        public Criteria andApiNotBetween(String value1, String value2) {
            addCriterion("API not between", value1, value2, "api");
            return (Criteria) this;
        }

        public Criteria andCmdIsNull() {
            addCriterion("CMD is null");
            return (Criteria) this;
        }

        public Criteria andCmdIsNotNull() {
            addCriterion("CMD is not null");
            return (Criteria) this;
        }

        public Criteria andCmdEqualTo(String value) {
            addCriterion("CMD =", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdNotEqualTo(String value) {
            addCriterion("CMD <>", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdGreaterThan(String value) {
            addCriterion("CMD >", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdGreaterThanOrEqualTo(String value) {
            addCriterion("CMD >=", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdLessThan(String value) {
            addCriterion("CMD <", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdLessThanOrEqualTo(String value) {
            addCriterion("CMD <=", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdLike(String value) {
            addCriterion("CMD like", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdNotLike(String value) {
            addCriterion("CMD not like", value, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdIn(List<String> values) {
            addCriterion("CMD in", values, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdNotIn(List<String> values) {
            addCriterion("CMD not in", values, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdBetween(String value1, String value2) {
            addCriterion("CMD between", value1, value2, "cmd");
            return (Criteria) this;
        }

        public Criteria andCmdNotBetween(String value1, String value2) {
            addCriterion("CMD not between", value1, value2, "cmd");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("ORDER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("ORDER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterion("ORDER_DATE =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterion("ORDER_DATE <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterion("ORDER_DATE >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_DATE >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterion("ORDER_DATE <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_DATE <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterion("ORDER_DATE in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterion("ORDER_DATE not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterion("ORDER_DATE between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_DATE not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("MEMBER_ID =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("MEMBER_ID <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("MEMBER_ID >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("MEMBER_ID >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("MEMBER_ID <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("MEMBER_ID <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("MEMBER_ID in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("MEMBER_ID not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("MEMBER_ID between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("BUYER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("BUYER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(String value) {
            addCriterion("BUYER_ID =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(String value) {
            addCriterion("BUYER_ID <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(String value) {
            addCriterion("BUYER_ID >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_ID >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(String value) {
            addCriterion("BUYER_ID <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(String value) {
            addCriterion("BUYER_ID <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLike(String value) {
            addCriterion("BUYER_ID like", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotLike(String value) {
            addCriterion("BUYER_ID not like", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<String> values) {
            addCriterion("BUYER_ID in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<String> values) {
            addCriterion("BUYER_ID not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(String value1, String value2) {
            addCriterion("BUYER_ID between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(String value1, String value2) {
            addCriterion("BUYER_ID not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNull() {
            addCriterion("BUYER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNotNull() {
            addCriterion("BUYER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameEqualTo(String value) {
            addCriterion("BUYER_NAME =", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotEqualTo(String value) {
            addCriterion("BUYER_NAME <>", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThan(String value) {
            addCriterion("BUYER_NAME >", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_NAME >=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThan(String value) {
            addCriterion("BUYER_NAME <", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThanOrEqualTo(String value) {
            addCriterion("BUYER_NAME <=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLike(String value) {
            addCriterion("BUYER_NAME like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotLike(String value) {
            addCriterion("BUYER_NAME not like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIn(List<String> values) {
            addCriterion("BUYER_NAME in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotIn(List<String> values) {
            addCriterion("BUYER_NAME not in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameBetween(String value1, String value2) {
            addCriterion("BUYER_NAME between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotBetween(String value1, String value2) {
            addCriterion("BUYER_NAME not between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailIsNull() {
            addCriterion("BUYER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailIsNotNull() {
            addCriterion("BUYER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailEqualTo(String value) {
            addCriterion("BUYER_EMAIL =", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailNotEqualTo(String value) {
            addCriterion("BUYER_EMAIL <>", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailGreaterThan(String value) {
            addCriterion("BUYER_EMAIL >", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_EMAIL >=", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailLessThan(String value) {
            addCriterion("BUYER_EMAIL <", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailLessThanOrEqualTo(String value) {
            addCriterion("BUYER_EMAIL <=", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailLike(String value) {
            addCriterion("BUYER_EMAIL like", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailNotLike(String value) {
            addCriterion("BUYER_EMAIL not like", value, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailIn(List<String> values) {
            addCriterion("BUYER_EMAIL in", values, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailNotIn(List<String> values) {
            addCriterion("BUYER_EMAIL not in", values, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailBetween(String value1, String value2) {
            addCriterion("BUYER_EMAIL between", value1, value2, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerEmailNotBetween(String value1, String value2) {
            addCriterion("BUYER_EMAIL not between", value1, value2, "buyerEmail");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNull() {
            addCriterion("BUYER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNotNull() {
            addCriterion("BUYER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressEqualTo(String value) {
            addCriterion("BUYER_ADDRESS =", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotEqualTo(String value) {
            addCriterion("BUYER_ADDRESS <>", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThan(String value) {
            addCriterion("BUYER_ADDRESS >", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_ADDRESS >=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThan(String value) {
            addCriterion("BUYER_ADDRESS <", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThanOrEqualTo(String value) {
            addCriterion("BUYER_ADDRESS <=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLike(String value) {
            addCriterion("BUYER_ADDRESS like", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotLike(String value) {
            addCriterion("BUYER_ADDRESS not like", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIn(List<String> values) {
            addCriterion("BUYER_ADDRESS in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotIn(List<String> values) {
            addCriterion("BUYER_ADDRESS not in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressBetween(String value1, String value2) {
            addCriterion("BUYER_ADDRESS between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotBetween(String value1, String value2) {
            addCriterion("BUYER_ADDRESS not between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andTaxTypeIsNull() {
            addCriterion("TAX_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaxTypeIsNotNull() {
            addCriterion("TAX_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTypeEqualTo(String value) {
            addCriterion("TAX_TYPE =", value, "taxType");
            return (Criteria) this;
        }

        public Criteria andTaxTypeNotEqualTo(String value) {
            addCriterion("TAX_TYPE <>", value, "taxType");
            return (Criteria) this;
        }

        public Criteria andTaxTypeGreaterThan(String value) {
            addCriterion("TAX_TYPE >", value, "taxType");
            return (Criteria) this;
        }

        public Criteria andTaxTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_TYPE >=", value, "taxType");
            return (Criteria) this;
        }

        public Criteria andTaxTypeLessThan(String value) {
            addCriterion("TAX_TYPE <", value, "taxType");
            return (Criteria) this;
        }

        public Criteria andTaxTypeLessThanOrEqualTo(String value) {
            addCriterion("TAX_TYPE <=", value, "taxType");
            return (Criteria) this;
        }

        public Criteria andTaxTypeLike(String value) {
            addCriterion("TAX_TYPE like", value, "taxType");
            return (Criteria) this;
        }

        public Criteria andTaxTypeNotLike(String value) {
            addCriterion("TAX_TYPE not like", value, "taxType");
            return (Criteria) this;
        }

        public Criteria andTaxTypeIn(List<String> values) {
            addCriterion("TAX_TYPE in", values, "taxType");
            return (Criteria) this;
        }

        public Criteria andTaxTypeNotIn(List<String> values) {
            addCriterion("TAX_TYPE not in", values, "taxType");
            return (Criteria) this;
        }

        public Criteria andTaxTypeBetween(String value1, String value2) {
            addCriterion("TAX_TYPE between", value1, value2, "taxType");
            return (Criteria) this;
        }

        public Criteria andTaxTypeNotBetween(String value1, String value2) {
            addCriterion("TAX_TYPE not between", value1, value2, "taxType");
            return (Criteria) this;
        }

        public Criteria andDonatemarkIsNull() {
            addCriterion("DONATEMARK is null");
            return (Criteria) this;
        }

        public Criteria andDonatemarkIsNotNull() {
            addCriterion("DONATEMARK is not null");
            return (Criteria) this;
        }

        public Criteria andDonatemarkEqualTo(String value) {
            addCriterion("DONATEMARK =", value, "donatemark");
            return (Criteria) this;
        }

        public Criteria andDonatemarkNotEqualTo(String value) {
            addCriterion("DONATEMARK <>", value, "donatemark");
            return (Criteria) this;
        }

        public Criteria andDonatemarkGreaterThan(String value) {
            addCriterion("DONATEMARK >", value, "donatemark");
            return (Criteria) this;
        }

        public Criteria andDonatemarkGreaterThanOrEqualTo(String value) {
            addCriterion("DONATEMARK >=", value, "donatemark");
            return (Criteria) this;
        }

        public Criteria andDonatemarkLessThan(String value) {
            addCriterion("DONATEMARK <", value, "donatemark");
            return (Criteria) this;
        }

        public Criteria andDonatemarkLessThanOrEqualTo(String value) {
            addCriterion("DONATEMARK <=", value, "donatemark");
            return (Criteria) this;
        }

        public Criteria andDonatemarkLike(String value) {
            addCriterion("DONATEMARK like", value, "donatemark");
            return (Criteria) this;
        }

        public Criteria andDonatemarkNotLike(String value) {
            addCriterion("DONATEMARK not like", value, "donatemark");
            return (Criteria) this;
        }

        public Criteria andDonatemarkIn(List<String> values) {
            addCriterion("DONATEMARK in", values, "donatemark");
            return (Criteria) this;
        }

        public Criteria andDonatemarkNotIn(List<String> values) {
            addCriterion("DONATEMARK not in", values, "donatemark");
            return (Criteria) this;
        }

        public Criteria andDonatemarkBetween(String value1, String value2) {
            addCriterion("DONATEMARK between", value1, value2, "donatemark");
            return (Criteria) this;
        }

        public Criteria andDonatemarkNotBetween(String value1, String value2) {
            addCriterion("DONATEMARK not between", value1, value2, "donatemark");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIsNull() {
            addCriterion("CARRIER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIsNotNull() {
            addCriterion("CARRIER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeEqualTo(String value) {
            addCriterion("CARRIER_TYPE =", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeNotEqualTo(String value) {
            addCriterion("CARRIER_TYPE <>", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeGreaterThan(String value) {
            addCriterion("CARRIER_TYPE >", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARRIER_TYPE >=", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeLessThan(String value) {
            addCriterion("CARRIER_TYPE <", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeLessThanOrEqualTo(String value) {
            addCriterion("CARRIER_TYPE <=", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeLike(String value) {
            addCriterion("CARRIER_TYPE like", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeNotLike(String value) {
            addCriterion("CARRIER_TYPE not like", value, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeIn(List<String> values) {
            addCriterion("CARRIER_TYPE in", values, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeNotIn(List<String> values) {
            addCriterion("CARRIER_TYPE not in", values, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeBetween(String value1, String value2) {
            addCriterion("CARRIER_TYPE between", value1, value2, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierTypeNotBetween(String value1, String value2) {
            addCriterion("CARRIER_TYPE not between", value1, value2, "carrierType");
            return (Criteria) this;
        }

        public Criteria andCarrierId1IsNull() {
            addCriterion("CARRIER_ID_1 is null");
            return (Criteria) this;
        }

        public Criteria andCarrierId1IsNotNull() {
            addCriterion("CARRIER_ID_1 is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierId1EqualTo(String value) {
            addCriterion("CARRIER_ID_1 =", value, "carrierId1");
            return (Criteria) this;
        }

        public Criteria andCarrierId1NotEqualTo(String value) {
            addCriterion("CARRIER_ID_1 <>", value, "carrierId1");
            return (Criteria) this;
        }

        public Criteria andCarrierId1GreaterThan(String value) {
            addCriterion("CARRIER_ID_1 >", value, "carrierId1");
            return (Criteria) this;
        }

        public Criteria andCarrierId1GreaterThanOrEqualTo(String value) {
            addCriterion("CARRIER_ID_1 >=", value, "carrierId1");
            return (Criteria) this;
        }

        public Criteria andCarrierId1LessThan(String value) {
            addCriterion("CARRIER_ID_1 <", value, "carrierId1");
            return (Criteria) this;
        }

        public Criteria andCarrierId1LessThanOrEqualTo(String value) {
            addCriterion("CARRIER_ID_1 <=", value, "carrierId1");
            return (Criteria) this;
        }

        public Criteria andCarrierId1Like(String value) {
            addCriterion("CARRIER_ID_1 like", value, "carrierId1");
            return (Criteria) this;
        }

        public Criteria andCarrierId1NotLike(String value) {
            addCriterion("CARRIER_ID_1 not like", value, "carrierId1");
            return (Criteria) this;
        }

        public Criteria andCarrierId1In(List<String> values) {
            addCriterion("CARRIER_ID_1 in", values, "carrierId1");
            return (Criteria) this;
        }

        public Criteria andCarrierId1NotIn(List<String> values) {
            addCriterion("CARRIER_ID_1 not in", values, "carrierId1");
            return (Criteria) this;
        }

        public Criteria andCarrierId1Between(String value1, String value2) {
            addCriterion("CARRIER_ID_1 between", value1, value2, "carrierId1");
            return (Criteria) this;
        }

        public Criteria andCarrierId1NotBetween(String value1, String value2) {
            addCriterion("CARRIER_ID_1 not between", value1, value2, "carrierId1");
            return (Criteria) this;
        }

        public Criteria andCarrierId2IsNull() {
            addCriterion("CARRIER_ID_2 is null");
            return (Criteria) this;
        }

        public Criteria andCarrierId2IsNotNull() {
            addCriterion("CARRIER_ID_2 is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierId2EqualTo(String value) {
            addCriterion("CARRIER_ID_2 =", value, "carrierId2");
            return (Criteria) this;
        }

        public Criteria andCarrierId2NotEqualTo(String value) {
            addCriterion("CARRIER_ID_2 <>", value, "carrierId2");
            return (Criteria) this;
        }

        public Criteria andCarrierId2GreaterThan(String value) {
            addCriterion("CARRIER_ID_2 >", value, "carrierId2");
            return (Criteria) this;
        }

        public Criteria andCarrierId2GreaterThanOrEqualTo(String value) {
            addCriterion("CARRIER_ID_2 >=", value, "carrierId2");
            return (Criteria) this;
        }

        public Criteria andCarrierId2LessThan(String value) {
            addCriterion("CARRIER_ID_2 <", value, "carrierId2");
            return (Criteria) this;
        }

        public Criteria andCarrierId2LessThanOrEqualTo(String value) {
            addCriterion("CARRIER_ID_2 <=", value, "carrierId2");
            return (Criteria) this;
        }

        public Criteria andCarrierId2Like(String value) {
            addCriterion("CARRIER_ID_2 like", value, "carrierId2");
            return (Criteria) this;
        }

        public Criteria andCarrierId2NotLike(String value) {
            addCriterion("CARRIER_ID_2 not like", value, "carrierId2");
            return (Criteria) this;
        }

        public Criteria andCarrierId2In(List<String> values) {
            addCriterion("CARRIER_ID_2 in", values, "carrierId2");
            return (Criteria) this;
        }

        public Criteria andCarrierId2NotIn(List<String> values) {
            addCriterion("CARRIER_ID_2 not in", values, "carrierId2");
            return (Criteria) this;
        }

        public Criteria andCarrierId2Between(String value1, String value2) {
            addCriterion("CARRIER_ID_2 between", value1, value2, "carrierId2");
            return (Criteria) this;
        }

        public Criteria andCarrierId2NotBetween(String value1, String value2) {
            addCriterion("CARRIER_ID_2 not between", value1, value2, "carrierId2");
            return (Criteria) this;
        }

        public Criteria andLoveCodeIsNull() {
            addCriterion("LOVE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLoveCodeIsNotNull() {
            addCriterion("LOVE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLoveCodeEqualTo(String value) {
            addCriterion("LOVE_CODE =", value, "loveCode");
            return (Criteria) this;
        }

        public Criteria andLoveCodeNotEqualTo(String value) {
            addCriterion("LOVE_CODE <>", value, "loveCode");
            return (Criteria) this;
        }

        public Criteria andLoveCodeGreaterThan(String value) {
            addCriterion("LOVE_CODE >", value, "loveCode");
            return (Criteria) this;
        }

        public Criteria andLoveCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LOVE_CODE >=", value, "loveCode");
            return (Criteria) this;
        }

        public Criteria andLoveCodeLessThan(String value) {
            addCriterion("LOVE_CODE <", value, "loveCode");
            return (Criteria) this;
        }

        public Criteria andLoveCodeLessThanOrEqualTo(String value) {
            addCriterion("LOVE_CODE <=", value, "loveCode");
            return (Criteria) this;
        }

        public Criteria andLoveCodeLike(String value) {
            addCriterion("LOVE_CODE like", value, "loveCode");
            return (Criteria) this;
        }

        public Criteria andLoveCodeNotLike(String value) {
            addCriterion("LOVE_CODE not like", value, "loveCode");
            return (Criteria) this;
        }

        public Criteria andLoveCodeIn(List<String> values) {
            addCriterion("LOVE_CODE in", values, "loveCode");
            return (Criteria) this;
        }

        public Criteria andLoveCodeNotIn(List<String> values) {
            addCriterion("LOVE_CODE not in", values, "loveCode");
            return (Criteria) this;
        }

        public Criteria andLoveCodeBetween(String value1, String value2) {
            addCriterion("LOVE_CODE between", value1, value2, "loveCode");
            return (Criteria) this;
        }

        public Criteria andLoveCodeNotBetween(String value1, String value2) {
            addCriterion("LOVE_CODE not between", value1, value2, "loveCode");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRequestDataIsNull() {
            addCriterion("REQUEST_DATA is null");
            return (Criteria) this;
        }

        public Criteria andRequestDataIsNotNull() {
            addCriterion("REQUEST_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andRequestDataEqualTo(String value) {
            addCriterion("REQUEST_DATA =", value, "requestData");
            return (Criteria) this;
        }

        public Criteria andRequestDataNotEqualTo(String value) {
            addCriterion("REQUEST_DATA <>", value, "requestData");
            return (Criteria) this;
        }

        public Criteria andRequestDataGreaterThan(String value) {
            addCriterion("REQUEST_DATA >", value, "requestData");
            return (Criteria) this;
        }

        public Criteria andRequestDataGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_DATA >=", value, "requestData");
            return (Criteria) this;
        }

        public Criteria andRequestDataLessThan(String value) {
            addCriterion("REQUEST_DATA <", value, "requestData");
            return (Criteria) this;
        }

        public Criteria andRequestDataLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_DATA <=", value, "requestData");
            return (Criteria) this;
        }

        public Criteria andRequestDataLike(String value) {
            addCriterion("REQUEST_DATA like", value, "requestData");
            return (Criteria) this;
        }

        public Criteria andRequestDataNotLike(String value) {
            addCriterion("REQUEST_DATA not like", value, "requestData");
            return (Criteria) this;
        }

        public Criteria andRequestDataIn(List<String> values) {
            addCriterion("REQUEST_DATA in", values, "requestData");
            return (Criteria) this;
        }

        public Criteria andRequestDataNotIn(List<String> values) {
            addCriterion("REQUEST_DATA not in", values, "requestData");
            return (Criteria) this;
        }

        public Criteria andRequestDataBetween(String value1, String value2) {
            addCriterion("REQUEST_DATA between", value1, value2, "requestData");
            return (Criteria) this;
        }

        public Criteria andRequestDataNotBetween(String value1, String value2) {
            addCriterion("REQUEST_DATA not between", value1, value2, "requestData");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNull() {
            addCriterion("POST_ID is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("POST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(String value) {
            addCriterion("POST_ID =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(String value) {
            addCriterion("POST_ID <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(String value) {
            addCriterion("POST_ID >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(String value) {
            addCriterion("POST_ID >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(String value) {
            addCriterion("POST_ID <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(String value) {
            addCriterion("POST_ID <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLike(String value) {
            addCriterion("POST_ID like", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotLike(String value) {
            addCriterion("POST_ID not like", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<String> values) {
            addCriterion("POST_ID in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<String> values) {
            addCriterion("POST_ID not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(String value1, String value2) {
            addCriterion("POST_ID between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(String value1, String value2) {
            addCriterion("POST_ID not between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andResponseMsgIsNull() {
            addCriterion("RESPONSE_MSG is null");
            return (Criteria) this;
        }

        public Criteria andResponseMsgIsNotNull() {
            addCriterion("RESPONSE_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andResponseMsgEqualTo(String value) {
            addCriterion("RESPONSE_MSG =", value, "responseMsg");
            return (Criteria) this;
        }

        public Criteria andResponseMsgNotEqualTo(String value) {
            addCriterion("RESPONSE_MSG <>", value, "responseMsg");
            return (Criteria) this;
        }

        public Criteria andResponseMsgGreaterThan(String value) {
            addCriterion("RESPONSE_MSG >", value, "responseMsg");
            return (Criteria) this;
        }

        public Criteria andResponseMsgGreaterThanOrEqualTo(String value) {
            addCriterion("RESPONSE_MSG >=", value, "responseMsg");
            return (Criteria) this;
        }

        public Criteria andResponseMsgLessThan(String value) {
            addCriterion("RESPONSE_MSG <", value, "responseMsg");
            return (Criteria) this;
        }

        public Criteria andResponseMsgLessThanOrEqualTo(String value) {
            addCriterion("RESPONSE_MSG <=", value, "responseMsg");
            return (Criteria) this;
        }

        public Criteria andResponseMsgLike(String value) {
            addCriterion("RESPONSE_MSG like", value, "responseMsg");
            return (Criteria) this;
        }

        public Criteria andResponseMsgNotLike(String value) {
            addCriterion("RESPONSE_MSG not like", value, "responseMsg");
            return (Criteria) this;
        }

        public Criteria andResponseMsgIn(List<String> values) {
            addCriterion("RESPONSE_MSG in", values, "responseMsg");
            return (Criteria) this;
        }

        public Criteria andResponseMsgNotIn(List<String> values) {
            addCriterion("RESPONSE_MSG not in", values, "responseMsg");
            return (Criteria) this;
        }

        public Criteria andResponseMsgBetween(String value1, String value2) {
            addCriterion("RESPONSE_MSG between", value1, value2, "responseMsg");
            return (Criteria) this;
        }

        public Criteria andResponseMsgNotBetween(String value1, String value2) {
            addCriterion("RESPONSE_MSG not between", value1, value2, "responseMsg");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNull() {
            addCriterion("INVOICE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNotNull() {
            addCriterion("INVOICE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberEqualTo(String value) {
            addCriterion("INVOICE_NUMBER =", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotEqualTo(String value) {
            addCriterion("INVOICE_NUMBER <>", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThan(String value) {
            addCriterion("INVOICE_NUMBER >", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_NUMBER >=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThan(String value) {
            addCriterion("INVOICE_NUMBER <", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_NUMBER <=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLike(String value) {
            addCriterion("INVOICE_NUMBER like", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotLike(String value) {
            addCriterion("INVOICE_NUMBER not like", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIn(List<String> values) {
            addCriterion("INVOICE_NUMBER in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotIn(List<String> values) {
            addCriterion("INVOICE_NUMBER not in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberBetween(String value1, String value2) {
            addCriterion("INVOICE_NUMBER between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotBetween(String value1, String value2) {
            addCriterion("INVOICE_NUMBER not between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andRandomNumberIsNull() {
            addCriterion("RANDOM_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andRandomNumberIsNotNull() {
            addCriterion("RANDOM_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andRandomNumberEqualTo(String value) {
            addCriterion("RANDOM_NUMBER =", value, "randomNumber");
            return (Criteria) this;
        }

        public Criteria andRandomNumberNotEqualTo(String value) {
            addCriterion("RANDOM_NUMBER <>", value, "randomNumber");
            return (Criteria) this;
        }

        public Criteria andRandomNumberGreaterThan(String value) {
            addCriterion("RANDOM_NUMBER >", value, "randomNumber");
            return (Criteria) this;
        }

        public Criteria andRandomNumberGreaterThanOrEqualTo(String value) {
            addCriterion("RANDOM_NUMBER >=", value, "randomNumber");
            return (Criteria) this;
        }

        public Criteria andRandomNumberLessThan(String value) {
            addCriterion("RANDOM_NUMBER <", value, "randomNumber");
            return (Criteria) this;
        }

        public Criteria andRandomNumberLessThanOrEqualTo(String value) {
            addCriterion("RANDOM_NUMBER <=", value, "randomNumber");
            return (Criteria) this;
        }

        public Criteria andRandomNumberLike(String value) {
            addCriterion("RANDOM_NUMBER like", value, "randomNumber");
            return (Criteria) this;
        }

        public Criteria andRandomNumberNotLike(String value) {
            addCriterion("RANDOM_NUMBER not like", value, "randomNumber");
            return (Criteria) this;
        }

        public Criteria andRandomNumberIn(List<String> values) {
            addCriterion("RANDOM_NUMBER in", values, "randomNumber");
            return (Criteria) this;
        }

        public Criteria andRandomNumberNotIn(List<String> values) {
            addCriterion("RANDOM_NUMBER not in", values, "randomNumber");
            return (Criteria) this;
        }

        public Criteria andRandomNumberBetween(String value1, String value2) {
            addCriterion("RANDOM_NUMBER between", value1, value2, "randomNumber");
            return (Criteria) this;
        }

        public Criteria andRandomNumberNotBetween(String value1, String value2) {
            addCriterion("RANDOM_NUMBER not between", value1, value2, "randomNumber");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNull() {
            addCriterion("CANCEL_REASON is null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNotNull() {
            addCriterion("CANCEL_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonEqualTo(String value) {
            addCriterion("CANCEL_REASON =", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotEqualTo(String value) {
            addCriterion("CANCEL_REASON <>", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThan(String value) {
            addCriterion("CANCEL_REASON >", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_REASON >=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThan(String value) {
            addCriterion("CANCEL_REASON <", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_REASON <=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLike(String value) {
            addCriterion("CANCEL_REASON like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotLike(String value) {
            addCriterion("CANCEL_REASON not like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIn(List<String> values) {
            addCriterion("CANCEL_REASON in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotIn(List<String> values) {
            addCriterion("CANCEL_REASON not in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonBetween(String value1, String value2) {
            addCriterion("CANCEL_REASON between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotBetween(String value1, String value2) {
            addCriterion("CANCEL_REASON not between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCanceledIsNull() {
            addCriterion("CANCELED is null");
            return (Criteria) this;
        }

        public Criteria andCanceledIsNotNull() {
            addCriterion("CANCELED is not null");
            return (Criteria) this;
        }

        public Criteria andCanceledEqualTo(Date value) {
            addCriterion("CANCELED =", value, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledNotEqualTo(Date value) {
            addCriterion("CANCELED <>", value, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledGreaterThan(Date value) {
            addCriterion("CANCELED >", value, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledGreaterThanOrEqualTo(Date value) {
            addCriterion("CANCELED >=", value, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledLessThan(Date value) {
            addCriterion("CANCELED <", value, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledLessThanOrEqualTo(Date value) {
            addCriterion("CANCELED <=", value, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledIn(List<Date> values) {
            addCriterion("CANCELED in", values, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledNotIn(List<Date> values) {
            addCriterion("CANCELED not in", values, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledBetween(Date value1, Date value2) {
            addCriterion("CANCELED between", value1, value2, "canceled");
            return (Criteria) this;
        }

        public Criteria andCanceledNotBetween(Date value1, Date value2) {
            addCriterion("CANCELED not between", value1, value2, "canceled");
            return (Criteria) this;
        }

        public Criteria andPrintedIsNull() {
            addCriterion("PRINTED is null");
            return (Criteria) this;
        }

        public Criteria andPrintedIsNotNull() {
            addCriterion("PRINTED is not null");
            return (Criteria) this;
        }

        public Criteria andPrintedEqualTo(String value) {
            addCriterion("PRINTED =", value, "printed");
            return (Criteria) this;
        }

        public Criteria andPrintedNotEqualTo(String value) {
            addCriterion("PRINTED <>", value, "printed");
            return (Criteria) this;
        }

        public Criteria andPrintedGreaterThan(String value) {
            addCriterion("PRINTED >", value, "printed");
            return (Criteria) this;
        }

        public Criteria andPrintedGreaterThanOrEqualTo(String value) {
            addCriterion("PRINTED >=", value, "printed");
            return (Criteria) this;
        }

        public Criteria andPrintedLessThan(String value) {
            addCriterion("PRINTED <", value, "printed");
            return (Criteria) this;
        }

        public Criteria andPrintedLessThanOrEqualTo(String value) {
            addCriterion("PRINTED <=", value, "printed");
            return (Criteria) this;
        }

        public Criteria andPrintedLike(String value) {
            addCriterion("PRINTED like", value, "printed");
            return (Criteria) this;
        }

        public Criteria andPrintedNotLike(String value) {
            addCriterion("PRINTED not like", value, "printed");
            return (Criteria) this;
        }

        public Criteria andPrintedIn(List<String> values) {
            addCriterion("PRINTED in", values, "printed");
            return (Criteria) this;
        }

        public Criteria andPrintedNotIn(List<String> values) {
            addCriterion("PRINTED not in", values, "printed");
            return (Criteria) this;
        }

        public Criteria andPrintedBetween(String value1, String value2) {
            addCriterion("PRINTED between", value1, value2, "printed");
            return (Criteria) this;
        }

        public Criteria andPrintedNotBetween(String value1, String value2) {
            addCriterion("PRINTED not between", value1, value2, "printed");
            return (Criteria) this;
        }

        public Criteria andPrintTimesIsNull() {
            addCriterion("PRINT_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andPrintTimesIsNotNull() {
            addCriterion("PRINT_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andPrintTimesEqualTo(Short value) {
            addCriterion("PRINT_TIMES =", value, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesNotEqualTo(Short value) {
            addCriterion("PRINT_TIMES <>", value, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesGreaterThan(Short value) {
            addCriterion("PRINT_TIMES >", value, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("PRINT_TIMES >=", value, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesLessThan(Short value) {
            addCriterion("PRINT_TIMES <", value, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesLessThanOrEqualTo(Short value) {
            addCriterion("PRINT_TIMES <=", value, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesIn(List<Short> values) {
            addCriterion("PRINT_TIMES in", values, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesNotIn(List<Short> values) {
            addCriterion("PRINT_TIMES not in", values, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesBetween(Short value1, Short value2) {
            addCriterion("PRINT_TIMES between", value1, value2, "printTimes");
            return (Criteria) this;
        }

        public Criteria andPrintTimesNotBetween(Short value1, Short value2) {
            addCriterion("PRINT_TIMES not between", value1, value2, "printTimes");
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

        public Criteria andCreateByIsNull() {
            addCriterion("CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("CREATE_BY =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("CREATE_BY like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("CREATE_BY not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("CREATE_BY in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("CREATE_BY not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("CREATE_BY between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("LAST_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("LAST_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNull() {
            addCriterion("LAST_UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNotNull() {
            addCriterion("LAST_UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY =", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(String value) {
            addCriterion("LAST_UPDATE_BY >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(String value) {
            addCriterion("LAST_UPDATE_BY <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLike(String value) {
            addCriterion("LAST_UPDATE_BY like", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotLike(String value) {
            addCriterion("LAST_UPDATE_BY not like", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIn(List<String> values) {
            addCriterion("LAST_UPDATE_BY in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotIn(List<String> values) {
            addCriterion("LAST_UPDATE_BY not in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_BY between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_BY not between", value1, value2, "lastUpdateBy");
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