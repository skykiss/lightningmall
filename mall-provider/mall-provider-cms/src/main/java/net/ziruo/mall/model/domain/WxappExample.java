package net.ziruo.mall.model.domain;

import java.util.ArrayList;
import java.util.List;

public class WxappExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxappExample() {
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

        public Criteria andAppNameIsNull() {
            addCriterion("app_name is null");
            return (Criteria) this;
        }

        public Criteria andAppNameIsNotNull() {
            addCriterion("app_name is not null");
            return (Criteria) this;
        }

        public Criteria andAppNameEqualTo(String value) {
            addCriterion("app_name =", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotEqualTo(String value) {
            addCriterion("app_name <>", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThan(String value) {
            addCriterion("app_name >", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameGreaterThanOrEqualTo(String value) {
            addCriterion("app_name >=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThan(String value) {
            addCriterion("app_name <", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLessThanOrEqualTo(String value) {
            addCriterion("app_name <=", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameLike(String value) {
            addCriterion("app_name like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotLike(String value) {
            addCriterion("app_name not like", value, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameIn(List<String> values) {
            addCriterion("app_name in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotIn(List<String> values) {
            addCriterion("app_name not in", values, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameBetween(String value1, String value2) {
            addCriterion("app_name between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppNameNotBetween(String value1, String value2) {
            addCriterion("app_name not between", value1, value2, "appName");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppSecretIsNull() {
            addCriterion("app_secret is null");
            return (Criteria) this;
        }

        public Criteria andAppSecretIsNotNull() {
            addCriterion("app_secret is not null");
            return (Criteria) this;
        }

        public Criteria andAppSecretEqualTo(String value) {
            addCriterion("app_secret =", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotEqualTo(String value) {
            addCriterion("app_secret <>", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretGreaterThan(String value) {
            addCriterion("app_secret >", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretGreaterThanOrEqualTo(String value) {
            addCriterion("app_secret >=", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLessThan(String value) {
            addCriterion("app_secret <", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLessThanOrEqualTo(String value) {
            addCriterion("app_secret <=", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLike(String value) {
            addCriterion("app_secret like", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotLike(String value) {
            addCriterion("app_secret not like", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretIn(List<String> values) {
            addCriterion("app_secret in", values, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotIn(List<String> values) {
            addCriterion("app_secret not in", values, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretBetween(String value1, String value2) {
            addCriterion("app_secret between", value1, value2, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotBetween(String value1, String value2) {
            addCriterion("app_secret not between", value1, value2, "appSecret");
            return (Criteria) this;
        }

        public Criteria andIsServiceIsNull() {
            addCriterion("is_service is null");
            return (Criteria) this;
        }

        public Criteria andIsServiceIsNotNull() {
            addCriterion("is_service is not null");
            return (Criteria) this;
        }

        public Criteria andIsServiceEqualTo(Byte value) {
            addCriterion("is_service =", value, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceNotEqualTo(Byte value) {
            addCriterion("is_service <>", value, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceGreaterThan(Byte value) {
            addCriterion("is_service >", value, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_service >=", value, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceLessThan(Byte value) {
            addCriterion("is_service <", value, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceLessThanOrEqualTo(Byte value) {
            addCriterion("is_service <=", value, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceIn(List<Byte> values) {
            addCriterion("is_service in", values, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceNotIn(List<Byte> values) {
            addCriterion("is_service not in", values, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceBetween(Byte value1, Byte value2) {
            addCriterion("is_service between", value1, value2, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceNotBetween(Byte value1, Byte value2) {
            addCriterion("is_service not between", value1, value2, "isService");
            return (Criteria) this;
        }

        public Criteria andServiceImageIdIsNull() {
            addCriterion("service_image_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceImageIdIsNotNull() {
            addCriterion("service_image_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceImageIdEqualTo(Integer value) {
            addCriterion("service_image_id =", value, "serviceImageId");
            return (Criteria) this;
        }

        public Criteria andServiceImageIdNotEqualTo(Integer value) {
            addCriterion("service_image_id <>", value, "serviceImageId");
            return (Criteria) this;
        }

        public Criteria andServiceImageIdGreaterThan(Integer value) {
            addCriterion("service_image_id >", value, "serviceImageId");
            return (Criteria) this;
        }

        public Criteria andServiceImageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_image_id >=", value, "serviceImageId");
            return (Criteria) this;
        }

        public Criteria andServiceImageIdLessThan(Integer value) {
            addCriterion("service_image_id <", value, "serviceImageId");
            return (Criteria) this;
        }

        public Criteria andServiceImageIdLessThanOrEqualTo(Integer value) {
            addCriterion("service_image_id <=", value, "serviceImageId");
            return (Criteria) this;
        }

        public Criteria andServiceImageIdIn(List<Integer> values) {
            addCriterion("service_image_id in", values, "serviceImageId");
            return (Criteria) this;
        }

        public Criteria andServiceImageIdNotIn(List<Integer> values) {
            addCriterion("service_image_id not in", values, "serviceImageId");
            return (Criteria) this;
        }

        public Criteria andServiceImageIdBetween(Integer value1, Integer value2) {
            addCriterion("service_image_id between", value1, value2, "serviceImageId");
            return (Criteria) this;
        }

        public Criteria andServiceImageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("service_image_id not between", value1, value2, "serviceImageId");
            return (Criteria) this;
        }

        public Criteria andIsPhoneIsNull() {
            addCriterion("is_phone is null");
            return (Criteria) this;
        }

        public Criteria andIsPhoneIsNotNull() {
            addCriterion("is_phone is not null");
            return (Criteria) this;
        }

        public Criteria andIsPhoneEqualTo(Byte value) {
            addCriterion("is_phone =", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneNotEqualTo(Byte value) {
            addCriterion("is_phone <>", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneGreaterThan(Byte value) {
            addCriterion("is_phone >", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_phone >=", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneLessThan(Byte value) {
            addCriterion("is_phone <", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneLessThanOrEqualTo(Byte value) {
            addCriterion("is_phone <=", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneIn(List<Byte> values) {
            addCriterion("is_phone in", values, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneNotIn(List<Byte> values) {
            addCriterion("is_phone not in", values, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneBetween(Byte value1, Byte value2) {
            addCriterion("is_phone between", value1, value2, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneNotBetween(Byte value1, Byte value2) {
            addCriterion("is_phone not between", value1, value2, "isPhone");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNull() {
            addCriterion("phone_no is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNotNull() {
            addCriterion("phone_no is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoEqualTo(String value) {
            addCriterion("phone_no =", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotEqualTo(String value) {
            addCriterion("phone_no <>", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThan(String value) {
            addCriterion("phone_no >", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThanOrEqualTo(String value) {
            addCriterion("phone_no >=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThan(String value) {
            addCriterion("phone_no <", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThanOrEqualTo(String value) {
            addCriterion("phone_no <=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLike(String value) {
            addCriterion("phone_no like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotLike(String value) {
            addCriterion("phone_no not like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIn(List<String> values) {
            addCriterion("phone_no in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotIn(List<String> values) {
            addCriterion("phone_no not in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoBetween(String value1, String value2) {
            addCriterion("phone_no between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotBetween(String value1, String value2) {
            addCriterion("phone_no not between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneImageIdIsNull() {
            addCriterion("phone_image_id is null");
            return (Criteria) this;
        }

        public Criteria andPhoneImageIdIsNotNull() {
            addCriterion("phone_image_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneImageIdEqualTo(Integer value) {
            addCriterion("phone_image_id =", value, "phoneImageId");
            return (Criteria) this;
        }

        public Criteria andPhoneImageIdNotEqualTo(Integer value) {
            addCriterion("phone_image_id <>", value, "phoneImageId");
            return (Criteria) this;
        }

        public Criteria andPhoneImageIdGreaterThan(Integer value) {
            addCriterion("phone_image_id >", value, "phoneImageId");
            return (Criteria) this;
        }

        public Criteria andPhoneImageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("phone_image_id >=", value, "phoneImageId");
            return (Criteria) this;
        }

        public Criteria andPhoneImageIdLessThan(Integer value) {
            addCriterion("phone_image_id <", value, "phoneImageId");
            return (Criteria) this;
        }

        public Criteria andPhoneImageIdLessThanOrEqualTo(Integer value) {
            addCriterion("phone_image_id <=", value, "phoneImageId");
            return (Criteria) this;
        }

        public Criteria andPhoneImageIdIn(List<Integer> values) {
            addCriterion("phone_image_id in", values, "phoneImageId");
            return (Criteria) this;
        }

        public Criteria andPhoneImageIdNotIn(List<Integer> values) {
            addCriterion("phone_image_id not in", values, "phoneImageId");
            return (Criteria) this;
        }

        public Criteria andPhoneImageIdBetween(Integer value1, Integer value2) {
            addCriterion("phone_image_id between", value1, value2, "phoneImageId");
            return (Criteria) this;
        }

        public Criteria andPhoneImageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("phone_image_id not between", value1, value2, "phoneImageId");
            return (Criteria) this;
        }

        public Criteria andMchidIsNull() {
            addCriterion("mchid is null");
            return (Criteria) this;
        }

        public Criteria andMchidIsNotNull() {
            addCriterion("mchid is not null");
            return (Criteria) this;
        }

        public Criteria andMchidEqualTo(String value) {
            addCriterion("mchid =", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidNotEqualTo(String value) {
            addCriterion("mchid <>", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidGreaterThan(String value) {
            addCriterion("mchid >", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidGreaterThanOrEqualTo(String value) {
            addCriterion("mchid >=", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidLessThan(String value) {
            addCriterion("mchid <", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidLessThanOrEqualTo(String value) {
            addCriterion("mchid <=", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidLike(String value) {
            addCriterion("mchid like", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidNotLike(String value) {
            addCriterion("mchid not like", value, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidIn(List<String> values) {
            addCriterion("mchid in", values, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidNotIn(List<String> values) {
            addCriterion("mchid not in", values, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidBetween(String value1, String value2) {
            addCriterion("mchid between", value1, value2, "mchid");
            return (Criteria) this;
        }

        public Criteria andMchidNotBetween(String value1, String value2) {
            addCriterion("mchid not between", value1, value2, "mchid");
            return (Criteria) this;
        }

        public Criteria andApikeyIsNull() {
            addCriterion("apikey is null");
            return (Criteria) this;
        }

        public Criteria andApikeyIsNotNull() {
            addCriterion("apikey is not null");
            return (Criteria) this;
        }

        public Criteria andApikeyEqualTo(String value) {
            addCriterion("apikey =", value, "apikey");
            return (Criteria) this;
        }

        public Criteria andApikeyNotEqualTo(String value) {
            addCriterion("apikey <>", value, "apikey");
            return (Criteria) this;
        }

        public Criteria andApikeyGreaterThan(String value) {
            addCriterion("apikey >", value, "apikey");
            return (Criteria) this;
        }

        public Criteria andApikeyGreaterThanOrEqualTo(String value) {
            addCriterion("apikey >=", value, "apikey");
            return (Criteria) this;
        }

        public Criteria andApikeyLessThan(String value) {
            addCriterion("apikey <", value, "apikey");
            return (Criteria) this;
        }

        public Criteria andApikeyLessThanOrEqualTo(String value) {
            addCriterion("apikey <=", value, "apikey");
            return (Criteria) this;
        }

        public Criteria andApikeyLike(String value) {
            addCriterion("apikey like", value, "apikey");
            return (Criteria) this;
        }

        public Criteria andApikeyNotLike(String value) {
            addCriterion("apikey not like", value, "apikey");
            return (Criteria) this;
        }

        public Criteria andApikeyIn(List<String> values) {
            addCriterion("apikey in", values, "apikey");
            return (Criteria) this;
        }

        public Criteria andApikeyNotIn(List<String> values) {
            addCriterion("apikey not in", values, "apikey");
            return (Criteria) this;
        }

        public Criteria andApikeyBetween(String value1, String value2) {
            addCriterion("apikey between", value1, value2, "apikey");
            return (Criteria) this;
        }

        public Criteria andApikeyNotBetween(String value1, String value2) {
            addCriterion("apikey not between", value1, value2, "apikey");
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