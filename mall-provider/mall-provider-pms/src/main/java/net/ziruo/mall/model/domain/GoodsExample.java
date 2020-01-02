package net.ziruo.mall.model.domain;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIsNull() {
            addCriterion("spec_type is null");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIsNotNull() {
            addCriterion("spec_type is not null");
            return (Criteria) this;
        }

        public Criteria andSpecTypeEqualTo(Byte value) {
            addCriterion("spec_type =", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeNotEqualTo(Byte value) {
            addCriterion("spec_type <>", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeGreaterThan(Byte value) {
            addCriterion("spec_type >", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("spec_type >=", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeLessThan(Byte value) {
            addCriterion("spec_type <", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeLessThanOrEqualTo(Byte value) {
            addCriterion("spec_type <=", value, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeIn(List<Byte> values) {
            addCriterion("spec_type in", values, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeNotIn(List<Byte> values) {
            addCriterion("spec_type not in", values, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeBetween(Byte value1, Byte value2) {
            addCriterion("spec_type between", value1, value2, "specType");
            return (Criteria) this;
        }

        public Criteria andSpecTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("spec_type not between", value1, value2, "specType");
            return (Criteria) this;
        }

        public Criteria andDeductStockTypeIsNull() {
            addCriterion("deduct_stock_type is null");
            return (Criteria) this;
        }

        public Criteria andDeductStockTypeIsNotNull() {
            addCriterion("deduct_stock_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeductStockTypeEqualTo(Byte value) {
            addCriterion("deduct_stock_type =", value, "deductStockType");
            return (Criteria) this;
        }

        public Criteria andDeductStockTypeNotEqualTo(Byte value) {
            addCriterion("deduct_stock_type <>", value, "deductStockType");
            return (Criteria) this;
        }

        public Criteria andDeductStockTypeGreaterThan(Byte value) {
            addCriterion("deduct_stock_type >", value, "deductStockType");
            return (Criteria) this;
        }

        public Criteria andDeductStockTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("deduct_stock_type >=", value, "deductStockType");
            return (Criteria) this;
        }

        public Criteria andDeductStockTypeLessThan(Byte value) {
            addCriterion("deduct_stock_type <", value, "deductStockType");
            return (Criteria) this;
        }

        public Criteria andDeductStockTypeLessThanOrEqualTo(Byte value) {
            addCriterion("deduct_stock_type <=", value, "deductStockType");
            return (Criteria) this;
        }

        public Criteria andDeductStockTypeIn(List<Byte> values) {
            addCriterion("deduct_stock_type in", values, "deductStockType");
            return (Criteria) this;
        }

        public Criteria andDeductStockTypeNotIn(List<Byte> values) {
            addCriterion("deduct_stock_type not in", values, "deductStockType");
            return (Criteria) this;
        }

        public Criteria andDeductStockTypeBetween(Byte value1, Byte value2) {
            addCriterion("deduct_stock_type between", value1, value2, "deductStockType");
            return (Criteria) this;
        }

        public Criteria andDeductStockTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("deduct_stock_type not between", value1, value2, "deductStockType");
            return (Criteria) this;
        }

        public Criteria andSalesInitialIsNull() {
            addCriterion("sales_initial is null");
            return (Criteria) this;
        }

        public Criteria andSalesInitialIsNotNull() {
            addCriterion("sales_initial is not null");
            return (Criteria) this;
        }

        public Criteria andSalesInitialEqualTo(Integer value) {
            addCriterion("sales_initial =", value, "salesInitial");
            return (Criteria) this;
        }

        public Criteria andSalesInitialNotEqualTo(Integer value) {
            addCriterion("sales_initial <>", value, "salesInitial");
            return (Criteria) this;
        }

        public Criteria andSalesInitialGreaterThan(Integer value) {
            addCriterion("sales_initial >", value, "salesInitial");
            return (Criteria) this;
        }

        public Criteria andSalesInitialGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_initial >=", value, "salesInitial");
            return (Criteria) this;
        }

        public Criteria andSalesInitialLessThan(Integer value) {
            addCriterion("sales_initial <", value, "salesInitial");
            return (Criteria) this;
        }

        public Criteria andSalesInitialLessThanOrEqualTo(Integer value) {
            addCriterion("sales_initial <=", value, "salesInitial");
            return (Criteria) this;
        }

        public Criteria andSalesInitialIn(List<Integer> values) {
            addCriterion("sales_initial in", values, "salesInitial");
            return (Criteria) this;
        }

        public Criteria andSalesInitialNotIn(List<Integer> values) {
            addCriterion("sales_initial not in", values, "salesInitial");
            return (Criteria) this;
        }

        public Criteria andSalesInitialBetween(Integer value1, Integer value2) {
            addCriterion("sales_initial between", value1, value2, "salesInitial");
            return (Criteria) this;
        }

        public Criteria andSalesInitialNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_initial not between", value1, value2, "salesInitial");
            return (Criteria) this;
        }

        public Criteria andSalesActualIsNull() {
            addCriterion("sales_actual is null");
            return (Criteria) this;
        }

        public Criteria andSalesActualIsNotNull() {
            addCriterion("sales_actual is not null");
            return (Criteria) this;
        }

        public Criteria andSalesActualEqualTo(Integer value) {
            addCriterion("sales_actual =", value, "salesActual");
            return (Criteria) this;
        }

        public Criteria andSalesActualNotEqualTo(Integer value) {
            addCriterion("sales_actual <>", value, "salesActual");
            return (Criteria) this;
        }

        public Criteria andSalesActualGreaterThan(Integer value) {
            addCriterion("sales_actual >", value, "salesActual");
            return (Criteria) this;
        }

        public Criteria andSalesActualGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_actual >=", value, "salesActual");
            return (Criteria) this;
        }

        public Criteria andSalesActualLessThan(Integer value) {
            addCriterion("sales_actual <", value, "salesActual");
            return (Criteria) this;
        }

        public Criteria andSalesActualLessThanOrEqualTo(Integer value) {
            addCriterion("sales_actual <=", value, "salesActual");
            return (Criteria) this;
        }

        public Criteria andSalesActualIn(List<Integer> values) {
            addCriterion("sales_actual in", values, "salesActual");
            return (Criteria) this;
        }

        public Criteria andSalesActualNotIn(List<Integer> values) {
            addCriterion("sales_actual not in", values, "salesActual");
            return (Criteria) this;
        }

        public Criteria andSalesActualBetween(Integer value1, Integer value2) {
            addCriterion("sales_actual between", value1, value2, "salesActual");
            return (Criteria) this;
        }

        public Criteria andSalesActualNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_actual not between", value1, value2, "salesActual");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIsNull() {
            addCriterion("goods_sort is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIsNotNull() {
            addCriterion("goods_sort is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSortEqualTo(Integer value) {
            addCriterion("goods_sort =", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortNotEqualTo(Integer value) {
            addCriterion("goods_sort <>", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortGreaterThan(Integer value) {
            addCriterion("goods_sort >", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_sort >=", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortLessThan(Integer value) {
            addCriterion("goods_sort <", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortLessThanOrEqualTo(Integer value) {
            addCriterion("goods_sort <=", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIn(List<Integer> values) {
            addCriterion("goods_sort in", values, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortNotIn(List<Integer> values) {
            addCriterion("goods_sort not in", values, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortBetween(Integer value1, Integer value2) {
            addCriterion("goods_sort between", value1, value2, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_sort not between", value1, value2, "goodsSort");
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

        public Criteria andGoodsStatusIsNull() {
            addCriterion("goods_status is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNotNull() {
            addCriterion("goods_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusEqualTo(Byte value) {
            addCriterion("goods_status =", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotEqualTo(Byte value) {
            addCriterion("goods_status <>", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThan(Byte value) {
            addCriterion("goods_status >", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_status >=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThan(Byte value) {
            addCriterion("goods_status <", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThanOrEqualTo(Byte value) {
            addCriterion("goods_status <=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIn(List<Byte> values) {
            addCriterion("goods_status in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotIn(List<Byte> values) {
            addCriterion("goods_status not in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusBetween(Byte value1, Byte value2) {
            addCriterion("goods_status between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_status not between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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