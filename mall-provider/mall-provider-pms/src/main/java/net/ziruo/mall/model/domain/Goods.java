package net.ziruo.mall.model.domain;

public class Goods {
    private Integer id;

    private String goodsName;

    private Integer categoryId;

    private Byte specType;

    private Byte deductStockType;

    private Integer salesInitial;

    private Integer salesActual;

    private Integer goodsSort;

    private Integer deliveryId;

    private Byte goodsStatus;

    private Byte isDelete;

    private Integer createTime;

    private Integer updateTime;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
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

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}