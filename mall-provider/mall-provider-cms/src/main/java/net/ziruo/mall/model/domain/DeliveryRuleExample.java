package net.ziruo.mall.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DeliveryRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliveryRuleExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdIsNull() {
            addCriterion("delivery_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdIsNotNull() {
            addCriterion("delivery_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdEqualTo(Integer value) {
            addCriterion("delivery_id =", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotEqualTo(Integer value) {
            addCriterion("delivery_id <>", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdGreaterThan(Integer value) {
            addCriterion("delivery_id >", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_id >=", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdLessThan(Integer value) {
            addCriterion("delivery_id <", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_id <=", value, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdIn(List<Integer> values) {
            addCriterion("delivery_id in", values, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotIn(List<Integer> values) {
            addCriterion("delivery_id not in", values, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdBetween(Integer value1, Integer value2) {
            addCriterion("delivery_id between", value1, value2, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andDeliveryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_id not between", value1, value2, "deliveryId");
            return (Criteria) this;
        }

        public Criteria andFirstIsNull() {
            addCriterion("first is null");
            return (Criteria) this;
        }

        public Criteria andFirstIsNotNull() {
            addCriterion("first is not null");
            return (Criteria) this;
        }

        public Criteria andFirstEqualTo(Double value) {
            addCriterion("first =", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotEqualTo(Double value) {
            addCriterion("first <>", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstGreaterThan(Double value) {
            addCriterion("first >", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstGreaterThanOrEqualTo(Double value) {
            addCriterion("first >=", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstLessThan(Double value) {
            addCriterion("first <", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstLessThanOrEqualTo(Double value) {
            addCriterion("first <=", value, "first");
            return (Criteria) this;
        }

        public Criteria andFirstIn(List<Double> values) {
            addCriterion("first in", values, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotIn(List<Double> values) {
            addCriterion("first not in", values, "first");
            return (Criteria) this;
        }

        public Criteria andFirstBetween(Double value1, Double value2) {
            addCriterion("first between", value1, value2, "first");
            return (Criteria) this;
        }

        public Criteria andFirstNotBetween(Double value1, Double value2) {
            addCriterion("first not between", value1, value2, "first");
            return (Criteria) this;
        }

        public Criteria andFirstFeeIsNull() {
            addCriterion("first_fee is null");
            return (Criteria) this;
        }

        public Criteria andFirstFeeIsNotNull() {
            addCriterion("first_fee is not null");
            return (Criteria) this;
        }

        public Criteria andFirstFeeEqualTo(BigDecimal value) {
            addCriterion("first_fee =", value, "firstFee");
            return (Criteria) this;
        }

        public Criteria andFirstFeeNotEqualTo(BigDecimal value) {
            addCriterion("first_fee <>", value, "firstFee");
            return (Criteria) this;
        }

        public Criteria andFirstFeeGreaterThan(BigDecimal value) {
            addCriterion("first_fee >", value, "firstFee");
            return (Criteria) this;
        }

        public Criteria andFirstFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_fee >=", value, "firstFee");
            return (Criteria) this;
        }

        public Criteria andFirstFeeLessThan(BigDecimal value) {
            addCriterion("first_fee <", value, "firstFee");
            return (Criteria) this;
        }

        public Criteria andFirstFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_fee <=", value, "firstFee");
            return (Criteria) this;
        }

        public Criteria andFirstFeeIn(List<BigDecimal> values) {
            addCriterion("first_fee in", values, "firstFee");
            return (Criteria) this;
        }

        public Criteria andFirstFeeNotIn(List<BigDecimal> values) {
            addCriterion("first_fee not in", values, "firstFee");
            return (Criteria) this;
        }

        public Criteria andFirstFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_fee between", value1, value2, "firstFee");
            return (Criteria) this;
        }

        public Criteria andFirstFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_fee not between", value1, value2, "firstFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalIsNull() {
            addCriterion("additional is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalIsNotNull() {
            addCriterion("additional is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalEqualTo(Double value) {
            addCriterion("additional =", value, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalNotEqualTo(Double value) {
            addCriterion("additional <>", value, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalGreaterThan(Double value) {
            addCriterion("additional >", value, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalGreaterThanOrEqualTo(Double value) {
            addCriterion("additional >=", value, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalLessThan(Double value) {
            addCriterion("additional <", value, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalLessThanOrEqualTo(Double value) {
            addCriterion("additional <=", value, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalIn(List<Double> values) {
            addCriterion("additional in", values, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalNotIn(List<Double> values) {
            addCriterion("additional not in", values, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalBetween(Double value1, Double value2) {
            addCriterion("additional between", value1, value2, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalNotBetween(Double value1, Double value2) {
            addCriterion("additional not between", value1, value2, "additional");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeIsNull() {
            addCriterion("additional_fee is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeIsNotNull() {
            addCriterion("additional_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeEqualTo(BigDecimal value) {
            addCriterion("additional_fee =", value, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeNotEqualTo(BigDecimal value) {
            addCriterion("additional_fee <>", value, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeGreaterThan(BigDecimal value) {
            addCriterion("additional_fee >", value, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("additional_fee >=", value, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeLessThan(BigDecimal value) {
            addCriterion("additional_fee <", value, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("additional_fee <=", value, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeIn(List<BigDecimal> values) {
            addCriterion("additional_fee in", values, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeNotIn(List<BigDecimal> values) {
            addCriterion("additional_fee not in", values, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("additional_fee between", value1, value2, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("additional_fee not between", value1, value2, "additionalFee");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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