package com.ariix.twInvoice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInvoiceDiscExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInvoiceDiscExample() {
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

        public Criteria andDiscIdIsNull() {
            addCriterion("DISC_ID is null");
            return (Criteria) this;
        }

        public Criteria andDiscIdIsNotNull() {
            addCriterion("DISC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDiscIdEqualTo(String value) {
            addCriterion("DISC_ID =", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdNotEqualTo(String value) {
            addCriterion("DISC_ID <>", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdGreaterThan(String value) {
            addCriterion("DISC_ID >", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdGreaterThanOrEqualTo(String value) {
            addCriterion("DISC_ID >=", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdLessThan(String value) {
            addCriterion("DISC_ID <", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdLessThanOrEqualTo(String value) {
            addCriterion("DISC_ID <=", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdLike(String value) {
            addCriterion("DISC_ID like", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdNotLike(String value) {
            addCriterion("DISC_ID not like", value, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdIn(List<String> values) {
            addCriterion("DISC_ID in", values, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdNotIn(List<String> values) {
            addCriterion("DISC_ID not in", values, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdBetween(String value1, String value2) {
            addCriterion("DISC_ID between", value1, value2, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscIdNotBetween(String value1, String value2) {
            addCriterion("DISC_ID not between", value1, value2, "discId");
            return (Criteria) this;
        }

        public Criteria andDiscAmountIsNull() {
            addCriterion("DISC_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDiscAmountIsNotNull() {
            addCriterion("DISC_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscAmountEqualTo(BigDecimal value) {
            addCriterion("DISC_AMOUNT =", value, "discAmount");
            return (Criteria) this;
        }

        public Criteria andDiscAmountNotEqualTo(BigDecimal value) {
            addCriterion("DISC_AMOUNT <>", value, "discAmount");
            return (Criteria) this;
        }

        public Criteria andDiscAmountGreaterThan(BigDecimal value) {
            addCriterion("DISC_AMOUNT >", value, "discAmount");
            return (Criteria) this;
        }

        public Criteria andDiscAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISC_AMOUNT >=", value, "discAmount");
            return (Criteria) this;
        }

        public Criteria andDiscAmountLessThan(BigDecimal value) {
            addCriterion("DISC_AMOUNT <", value, "discAmount");
            return (Criteria) this;
        }

        public Criteria andDiscAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISC_AMOUNT <=", value, "discAmount");
            return (Criteria) this;
        }

        public Criteria andDiscAmountIn(List<BigDecimal> values) {
            addCriterion("DISC_AMOUNT in", values, "discAmount");
            return (Criteria) this;
        }

        public Criteria andDiscAmountNotIn(List<BigDecimal> values) {
            addCriterion("DISC_AMOUNT not in", values, "discAmount");
            return (Criteria) this;
        }

        public Criteria andDiscAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISC_AMOUNT between", value1, value2, "discAmount");
            return (Criteria) this;
        }

        public Criteria andDiscAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISC_AMOUNT not between", value1, value2, "discAmount");
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