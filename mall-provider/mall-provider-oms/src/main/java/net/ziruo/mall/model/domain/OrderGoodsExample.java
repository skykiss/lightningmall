package net.ziruo.mall.model.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderGoodsExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
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

        public Criteria andImageIdIsNull() {
            addCriterion("image_id is null");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNotNull() {
            addCriterion("image_id is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdEqualTo(Integer value) {
            addCriterion("image_id =", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotEqualTo(Integer value) {
            addCriterion("image_id <>", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThan(Integer value) {
            addCriterion("image_id >", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("image_id >=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThan(Integer value) {
            addCriterion("image_id <", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThanOrEqualTo(Integer value) {
            addCriterion("image_id <=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdIn(List<Integer> values) {
            addCriterion("image_id in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotIn(List<Integer> values) {
            addCriterion("image_id not in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdBetween(Integer value1, Integer value2) {
            addCriterion("image_id between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("image_id not between", value1, value2, "imageId");
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

        public Criteria andSpecSkuIdIsNull() {
            addCriterion("spec_sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecSkuIdIsNotNull() {
            addCriterion("spec_sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecSkuIdEqualTo(String value) {
            addCriterion("spec_sku_id =", value, "specSkuId");
            return (Criteria) this;
        }

        public Criteria andSpecSkuIdNotEqualTo(String value) {
            addCriterion("spec_sku_id <>", value, "specSkuId");
            return (Criteria) this;
        }

        public Criteria andSpecSkuIdGreaterThan(String value) {
            addCriterion("spec_sku_id >", value, "specSkuId");
            return (Criteria) this;
        }

        public Criteria andSpecSkuIdGreaterThanOrEqualTo(String value) {
            addCriterion("spec_sku_id >=", value, "specSkuId");
            return (Criteria) this;
        }

        public Criteria andSpecSkuIdLessThan(String value) {
            addCriterion("spec_sku_id <", value, "specSkuId");
            return (Criteria) this;
        }

        public Criteria andSpecSkuIdLessThanOrEqualTo(String value) {
            addCriterion("spec_sku_id <=", value, "specSkuId");
            return (Criteria) this;
        }

        public Criteria andSpecSkuIdLike(String value) {
            addCriterion("spec_sku_id like", value, "specSkuId");
            return (Criteria) this;
        }

        public Criteria andSpecSkuIdNotLike(String value) {
            addCriterion("spec_sku_id not like", value, "specSkuId");
            return (Criteria) this;
        }

        public Criteria andSpecSkuIdIn(List<String> values) {
            addCriterion("spec_sku_id in", values, "specSkuId");
            return (Criteria) this;
        }

        public Criteria andSpecSkuIdNotIn(List<String> values) {
            addCriterion("spec_sku_id not in", values, "specSkuId");
            return (Criteria) this;
        }

        public Criteria andSpecSkuIdBetween(String value1, String value2) {
            addCriterion("spec_sku_id between", value1, value2, "specSkuId");
            return (Criteria) this;
        }

        public Criteria andSpecSkuIdNotBetween(String value1, String value2) {
            addCriterion("spec_sku_id not between", value1, value2, "specSkuId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdIsNull() {
            addCriterion("goods_spec_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdIsNotNull() {
            addCriterion("goods_spec_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdEqualTo(Integer value) {
            addCriterion("goods_spec_id =", value, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdNotEqualTo(Integer value) {
            addCriterion("goods_spec_id <>", value, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdGreaterThan(Integer value) {
            addCriterion("goods_spec_id >", value, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_spec_id >=", value, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdLessThan(Integer value) {
            addCriterion("goods_spec_id <", value, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_spec_id <=", value, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdIn(List<Integer> values) {
            addCriterion("goods_spec_id in", values, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdNotIn(List<Integer> values) {
            addCriterion("goods_spec_id not in", values, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_spec_id between", value1, value2, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_spec_id not between", value1, value2, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIsNull() {
            addCriterion("goods_attr is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIsNotNull() {
            addCriterion("goods_attr is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrEqualTo(String value) {
            addCriterion("goods_attr =", value, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNotEqualTo(String value) {
            addCriterion("goods_attr <>", value, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrGreaterThan(String value) {
            addCriterion("goods_attr >", value, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrGreaterThanOrEqualTo(String value) {
            addCriterion("goods_attr >=", value, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrLessThan(String value) {
            addCriterion("goods_attr <", value, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrLessThanOrEqualTo(String value) {
            addCriterion("goods_attr <=", value, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrLike(String value) {
            addCriterion("goods_attr like", value, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNotLike(String value) {
            addCriterion("goods_attr not like", value, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrIn(List<String> values) {
            addCriterion("goods_attr in", values, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNotIn(List<String> values) {
            addCriterion("goods_attr not in", values, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrBetween(String value1, String value2) {
            addCriterion("goods_attr between", value1, value2, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsAttrNotBetween(String value1, String value2) {
            addCriterion("goods_attr not between", value1, value2, "goodsAttr");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIsNull() {
            addCriterion("goods_no is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIsNotNull() {
            addCriterion("goods_no is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoEqualTo(String value) {
            addCriterion("goods_no =", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotEqualTo(String value) {
            addCriterion("goods_no <>", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoGreaterThan(String value) {
            addCriterion("goods_no >", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_no >=", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLessThan(String value) {
            addCriterion("goods_no <", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLessThanOrEqualTo(String value) {
            addCriterion("goods_no <=", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLike(String value) {
            addCriterion("goods_no like", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotLike(String value) {
            addCriterion("goods_no not like", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIn(List<String> values) {
            addCriterion("goods_no in", values, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotIn(List<String> values) {
            addCriterion("goods_no not in", values, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoBetween(String value1, String value2) {
            addCriterion("goods_no between", value1, value2, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotBetween(String value1, String value2) {
            addCriterion("goods_no not between", value1, value2, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceIsNull() {
            addCriterion("line_price is null");
            return (Criteria) this;
        }

        public Criteria andLinePriceIsNotNull() {
            addCriterion("line_price is not null");
            return (Criteria) this;
        }

        public Criteria andLinePriceEqualTo(BigDecimal value) {
            addCriterion("line_price =", value, "linePrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceNotEqualTo(BigDecimal value) {
            addCriterion("line_price <>", value, "linePrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceGreaterThan(BigDecimal value) {
            addCriterion("line_price >", value, "linePrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("line_price >=", value, "linePrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceLessThan(BigDecimal value) {
            addCriterion("line_price <", value, "linePrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("line_price <=", value, "linePrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceIn(List<BigDecimal> values) {
            addCriterion("line_price in", values, "linePrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceNotIn(List<BigDecimal> values) {
            addCriterion("line_price not in", values, "linePrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("line_price between", value1, value2, "linePrice");
            return (Criteria) this;
        }

        public Criteria andLinePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("line_price not between", value1, value2, "linePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIsNull() {
            addCriterion("goods_weight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIsNotNull() {
            addCriterion("goods_weight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightEqualTo(Double value) {
            addCriterion("goods_weight =", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotEqualTo(Double value) {
            addCriterion("goods_weight <>", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThan(Double value) {
            addCriterion("goods_weight >", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_weight >=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThan(Double value) {
            addCriterion("goods_weight <", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightLessThanOrEqualTo(Double value) {
            addCriterion("goods_weight <=", value, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightIn(List<Double> values) {
            addCriterion("goods_weight in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotIn(List<Double> values) {
            addCriterion("goods_weight not in", values, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightBetween(Double value1, Double value2) {
            addCriterion("goods_weight between", value1, value2, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andGoodsWeightNotBetween(Double value1, Double value2) {
            addCriterion("goods_weight not between", value1, value2, "goodsWeight");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("total_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("total_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Integer value) {
            addCriterion("total_num =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Integer value) {
            addCriterion("total_num <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Integer value) {
            addCriterion("total_num >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_num >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Integer value) {
            addCriterion("total_num <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_num <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Integer> values) {
            addCriterion("total_num in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Integer> values) {
            addCriterion("total_num not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("total_num between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_num not between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(BigDecimal value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(BigDecimal value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<BigDecimal> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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