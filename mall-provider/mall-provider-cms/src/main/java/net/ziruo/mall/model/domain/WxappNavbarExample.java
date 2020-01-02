package net.ziruo.mall.model.domain;

import java.util.ArrayList;
import java.util.List;

public class WxappNavbarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxappNavbarExample() {
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

        public Criteria andWxappTitleIsNull() {
            addCriterion("wxapp_title is null");
            return (Criteria) this;
        }

        public Criteria andWxappTitleIsNotNull() {
            addCriterion("wxapp_title is not null");
            return (Criteria) this;
        }

        public Criteria andWxappTitleEqualTo(String value) {
            addCriterion("wxapp_title =", value, "wxappTitle");
            return (Criteria) this;
        }

        public Criteria andWxappTitleNotEqualTo(String value) {
            addCriterion("wxapp_title <>", value, "wxappTitle");
            return (Criteria) this;
        }

        public Criteria andWxappTitleGreaterThan(String value) {
            addCriterion("wxapp_title >", value, "wxappTitle");
            return (Criteria) this;
        }

        public Criteria andWxappTitleGreaterThanOrEqualTo(String value) {
            addCriterion("wxapp_title >=", value, "wxappTitle");
            return (Criteria) this;
        }

        public Criteria andWxappTitleLessThan(String value) {
            addCriterion("wxapp_title <", value, "wxappTitle");
            return (Criteria) this;
        }

        public Criteria andWxappTitleLessThanOrEqualTo(String value) {
            addCriterion("wxapp_title <=", value, "wxappTitle");
            return (Criteria) this;
        }

        public Criteria andWxappTitleLike(String value) {
            addCriterion("wxapp_title like", value, "wxappTitle");
            return (Criteria) this;
        }

        public Criteria andWxappTitleNotLike(String value) {
            addCriterion("wxapp_title not like", value, "wxappTitle");
            return (Criteria) this;
        }

        public Criteria andWxappTitleIn(List<String> values) {
            addCriterion("wxapp_title in", values, "wxappTitle");
            return (Criteria) this;
        }

        public Criteria andWxappTitleNotIn(List<String> values) {
            addCriterion("wxapp_title not in", values, "wxappTitle");
            return (Criteria) this;
        }

        public Criteria andWxappTitleBetween(String value1, String value2) {
            addCriterion("wxapp_title between", value1, value2, "wxappTitle");
            return (Criteria) this;
        }

        public Criteria andWxappTitleNotBetween(String value1, String value2) {
            addCriterion("wxapp_title not between", value1, value2, "wxappTitle");
            return (Criteria) this;
        }

        public Criteria andTopTextColorIsNull() {
            addCriterion("top_text_color is null");
            return (Criteria) this;
        }

        public Criteria andTopTextColorIsNotNull() {
            addCriterion("top_text_color is not null");
            return (Criteria) this;
        }

        public Criteria andTopTextColorEqualTo(Byte value) {
            addCriterion("top_text_color =", value, "topTextColor");
            return (Criteria) this;
        }

        public Criteria andTopTextColorNotEqualTo(Byte value) {
            addCriterion("top_text_color <>", value, "topTextColor");
            return (Criteria) this;
        }

        public Criteria andTopTextColorGreaterThan(Byte value) {
            addCriterion("top_text_color >", value, "topTextColor");
            return (Criteria) this;
        }

        public Criteria andTopTextColorGreaterThanOrEqualTo(Byte value) {
            addCriterion("top_text_color >=", value, "topTextColor");
            return (Criteria) this;
        }

        public Criteria andTopTextColorLessThan(Byte value) {
            addCriterion("top_text_color <", value, "topTextColor");
            return (Criteria) this;
        }

        public Criteria andTopTextColorLessThanOrEqualTo(Byte value) {
            addCriterion("top_text_color <=", value, "topTextColor");
            return (Criteria) this;
        }

        public Criteria andTopTextColorIn(List<Byte> values) {
            addCriterion("top_text_color in", values, "topTextColor");
            return (Criteria) this;
        }

        public Criteria andTopTextColorNotIn(List<Byte> values) {
            addCriterion("top_text_color not in", values, "topTextColor");
            return (Criteria) this;
        }

        public Criteria andTopTextColorBetween(Byte value1, Byte value2) {
            addCriterion("top_text_color between", value1, value2, "topTextColor");
            return (Criteria) this;
        }

        public Criteria andTopTextColorNotBetween(Byte value1, Byte value2) {
            addCriterion("top_text_color not between", value1, value2, "topTextColor");
            return (Criteria) this;
        }

        public Criteria andTopBackgroundColorIsNull() {
            addCriterion("top_background_color is null");
            return (Criteria) this;
        }

        public Criteria andTopBackgroundColorIsNotNull() {
            addCriterion("top_background_color is not null");
            return (Criteria) this;
        }

        public Criteria andTopBackgroundColorEqualTo(String value) {
            addCriterion("top_background_color =", value, "topBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopBackgroundColorNotEqualTo(String value) {
            addCriterion("top_background_color <>", value, "topBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopBackgroundColorGreaterThan(String value) {
            addCriterion("top_background_color >", value, "topBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopBackgroundColorGreaterThanOrEqualTo(String value) {
            addCriterion("top_background_color >=", value, "topBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopBackgroundColorLessThan(String value) {
            addCriterion("top_background_color <", value, "topBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopBackgroundColorLessThanOrEqualTo(String value) {
            addCriterion("top_background_color <=", value, "topBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopBackgroundColorLike(String value) {
            addCriterion("top_background_color like", value, "topBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopBackgroundColorNotLike(String value) {
            addCriterion("top_background_color not like", value, "topBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopBackgroundColorIn(List<String> values) {
            addCriterion("top_background_color in", values, "topBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopBackgroundColorNotIn(List<String> values) {
            addCriterion("top_background_color not in", values, "topBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopBackgroundColorBetween(String value1, String value2) {
            addCriterion("top_background_color between", value1, value2, "topBackgroundColor");
            return (Criteria) this;
        }

        public Criteria andTopBackgroundColorNotBetween(String value1, String value2) {
            addCriterion("top_background_color not between", value1, value2, "topBackgroundColor");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Integer value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Integer value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Integer value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Integer value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Integer> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Integer> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Integer value1, Integer value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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