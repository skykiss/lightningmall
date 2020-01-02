package net.ziruo.mall.model.domain;

public class WxappNavbar {
    private Integer id;

    private String wxappTitle;

    private Byte topTextColor;

    private String topBackgroundColor;

    private Integer createTime;

    private Integer updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWxappTitle() {
        return wxappTitle;
    }

    public void setWxappTitle(String wxappTitle) {
        this.wxappTitle = wxappTitle == null ? null : wxappTitle.trim();
    }

    public Byte getTopTextColor() {
        return topTextColor;
    }

    public void setTopTextColor(Byte topTextColor) {
        this.topTextColor = topTextColor;
    }

    public String getTopBackgroundColor() {
        return topBackgroundColor;
    }

    public void setTopBackgroundColor(String topBackgroundColor) {
        this.topBackgroundColor = topBackgroundColor == null ? null : topBackgroundColor.trim();
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
}