package com.ariix.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShippingCostExceptionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShippingCostExceptionsExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNull() {
            addCriterion("WAREHOUSE_ID is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("WAREHOUSE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(BigDecimal value) {
            addCriterion("WAREHOUSE_ID =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(BigDecimal value) {
            addCriterion("WAREHOUSE_ID <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(BigDecimal value) {
            addCriterion("WAREHOUSE_ID >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WAREHOUSE_ID >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(BigDecimal value) {
            addCriterion("WAREHOUSE_ID <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WAREHOUSE_ID <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<BigDecimal> values) {
            addCriterion("WAREHOUSE_ID in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<BigDecimal> values) {
            addCriterion("WAREHOUSE_ID not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAREHOUSE_ID between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAREHOUSE_ID not between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("COUNTRY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("COUNTRY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("COUNTRY_CODE =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("COUNTRY_CODE <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("COUNTRY_CODE >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY_CODE >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("COUNTRY_CODE <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY_CODE <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("COUNTRY_CODE like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("COUNTRY_CODE not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("COUNTRY_CODE in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("COUNTRY_CODE not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("COUNTRY_CODE between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("COUNTRY_CODE not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andFromDateIsNull() {
            addCriterion("FROM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFromDateIsNotNull() {
            addCriterion("FROM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFromDateEqualTo(Date value) {
            addCriterion("FROM_DATE =", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateNotEqualTo(Date value) {
            addCriterion("FROM_DATE <>", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateGreaterThan(Date value) {
            addCriterion("FROM_DATE >", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FROM_DATE >=", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateLessThan(Date value) {
            addCriterion("FROM_DATE <", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateLessThanOrEqualTo(Date value) {
            addCriterion("FROM_DATE <=", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateIn(List<Date> values) {
            addCriterion("FROM_DATE in", values, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateNotIn(List<Date> values) {
            addCriterion("FROM_DATE not in", values, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateBetween(Date value1, Date value2) {
            addCriterion("FROM_DATE between", value1, value2, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateNotBetween(Date value1, Date value2) {
            addCriterion("FROM_DATE not between", value1, value2, "fromDate");
            return (Criteria) this;
        }

        public Criteria andToDateIsNull() {
            addCriterion("TO_DATE is null");
            return (Criteria) this;
        }

        public Criteria andToDateIsNotNull() {
            addCriterion("TO_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andToDateEqualTo(Date value) {
            addCriterion("TO_DATE =", value, "toDate");
            return (Criteria) this;
        }

        public Criteria andToDateNotEqualTo(Date value) {
            addCriterion("TO_DATE <>", value, "toDate");
            return (Criteria) this;
        }

        public Criteria andToDateGreaterThan(Date value) {
            addCriterion("TO_DATE >", value, "toDate");
            return (Criteria) this;
        }

        public Criteria andToDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TO_DATE >=", value, "toDate");
            return (Criteria) this;
        }

        public Criteria andToDateLessThan(Date value) {
            addCriterion("TO_DATE <", value, "toDate");
            return (Criteria) this;
        }

        public Criteria andToDateLessThanOrEqualTo(Date value) {
            addCriterion("TO_DATE <=", value, "toDate");
            return (Criteria) this;
        }

        public Criteria andToDateIn(List<Date> values) {
            addCriterion("TO_DATE in", values, "toDate");
            return (Criteria) this;
        }

        public Criteria andToDateNotIn(List<Date> values) {
            addCriterion("TO_DATE not in", values, "toDate");
            return (Criteria) this;
        }

        public Criteria andToDateBetween(Date value1, Date value2) {
            addCriterion("TO_DATE between", value1, value2, "toDate");
            return (Criteria) this;
        }

        public Criteria andToDateNotBetween(Date value1, Date value2) {
            addCriterion("TO_DATE not between", value1, value2, "toDate");
            return (Criteria) this;
        }

        public Criteria andEnteredByIsNull() {
            addCriterion("ENTERED_BY is null");
            return (Criteria) this;
        }

        public Criteria andEnteredByIsNotNull() {
            addCriterion("ENTERED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andEnteredByEqualTo(String value) {
            addCriterion("ENTERED_BY =", value, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByNotEqualTo(String value) {
            addCriterion("ENTERED_BY <>", value, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByGreaterThan(String value) {
            addCriterion("ENTERED_BY >", value, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERED_BY >=", value, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByLessThan(String value) {
            addCriterion("ENTERED_BY <", value, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByLessThanOrEqualTo(String value) {
            addCriterion("ENTERED_BY <=", value, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByLike(String value) {
            addCriterion("ENTERED_BY like", value, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByNotLike(String value) {
            addCriterion("ENTERED_BY not like", value, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByIn(List<String> values) {
            addCriterion("ENTERED_BY in", values, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByNotIn(List<String> values) {
            addCriterion("ENTERED_BY not in", values, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByBetween(String value1, String value2) {
            addCriterion("ENTERED_BY between", value1, value2, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByNotBetween(String value1, String value2) {
            addCriterion("ENTERED_BY not between", value1, value2, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andInsertedDateIsNull() {
            addCriterion("INSERTED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInsertedDateIsNotNull() {
            addCriterion("INSERTED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInsertedDateEqualTo(Date value) {
            addCriterion("INSERTED_DATE =", value, "insertedDate");
            return (Criteria) this;
        }

        public Criteria andInsertedDateNotEqualTo(Date value) {
            addCriterion("INSERTED_DATE <>", value, "insertedDate");
            return (Criteria) this;
        }

        public Criteria andInsertedDateGreaterThan(Date value) {
            addCriterion("INSERTED_DATE >", value, "insertedDate");
            return (Criteria) this;
        }

        public Criteria andInsertedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("INSERTED_DATE >=", value, "insertedDate");
            return (Criteria) this;
        }

        public Criteria andInsertedDateLessThan(Date value) {
            addCriterion("INSERTED_DATE <", value, "insertedDate");
            return (Criteria) this;
        }

        public Criteria andInsertedDateLessThanOrEqualTo(Date value) {
            addCriterion("INSERTED_DATE <=", value, "insertedDate");
            return (Criteria) this;
        }

        public Criteria andInsertedDateIn(List<Date> values) {
            addCriterion("INSERTED_DATE in", values, "insertedDate");
            return (Criteria) this;
        }

        public Criteria andInsertedDateNotIn(List<Date> values) {
            addCriterion("INSERTED_DATE not in", values, "insertedDate");
            return (Criteria) this;
        }

        public Criteria andInsertedDateBetween(Date value1, Date value2) {
            addCriterion("INSERTED_DATE between", value1, value2, "insertedDate");
            return (Criteria) this;
        }

        public Criteria andInsertedDateNotBetween(Date value1, Date value2) {
            addCriterion("INSERTED_DATE not between", value1, value2, "insertedDate");
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