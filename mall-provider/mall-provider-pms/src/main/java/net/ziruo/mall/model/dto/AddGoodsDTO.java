package net.ziruo.mall.model.dto;

import java.math.BigDecimal;

/**
 * @Author: october
 * @Date: 2020/1/4 01:56
 * @Description:
 */
public class AddGoodsDTO {

    private String goodsName;

    private Integer categoryId;

    // 商品规格
    private Byte specType;

    // 库存计算方式
    private Byte deductStockType;

    // 初始销量
    private Integer salesInitial;

    // 实际销量
    private Integer salesActual;

    // 商品排序
    private Integer goodsSort;

    // 配送模板id
    private Integer deliveryId;

    // 商品状态
    private Byte goodsStatus;

    //商品详情
    private String content;

    private String goodsNo;

    private BigDecimal goodsPrice;

    private BigDecimal linePrice;

    private Integer stockNum;

    private Integer goodsSales;

    private Double goodsWeight;

    private String specSkuId;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Byte getSpecType() {
        return specType;
    }

    public void setSpecType(Byte specType) {
        this.specType = specType;
    }

    public Byte getDeductStockType() {
        return deductStockType;
    }

    public void setDeductStockType(Byte deductStockType) {
        this.deductStockType = deductStockType;
    }

    public Integer getSalesInitial() {
        return salesInitial;
    }

    public void setSalesInitial(Integer salesInitial) {
        this.salesInitial = salesInitial;
    }

    public Integer getSalesActual() {
        return salesActual;
    }

    public void setSalesActual(Integer salesActual) {
        this.salesActual = salesActual;
    }

    public Integer getGoodsSort() {
        return goodsSort;
    }

    public void setGoodsSort(Integer goodsSort) {
        this.goodsSort = goodsSort;
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Byte getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Byte goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getLinePrice() {
        return linePrice;
    }

    public void setLinePrice(BigDecimal linePrice) {
        this.linePrice = linePrice;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public Integer getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(Integer goodsSales) {
        this.goodsSales = goodsSales;
    }

    public Double getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(Double goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public String getSpecSkuId() {
        return specSkuId;
    }

    public void setSpecSkuId(String specSkuId) {
        this.specSkuId = specSkuId;
    }
}
