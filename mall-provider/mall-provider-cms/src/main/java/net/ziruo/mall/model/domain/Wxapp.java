package net.ziruo.mall.model.domain;

public class Wxapp {
    private Integer id;

    private String appName;

    private String appId;

    private String appSecret;

    private Byte isService;

    private Integer serviceImageId;

    private Byte isPhone;

    private String phoneNo;

    private Integer phoneImageId;

    private String mchid;

    private String apikey;

    private Integer createTime;

    private Integer updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret == null ? null : appSecret.trim();
    }

    public Byte getIsService() {
        return isService;
    }

    public void setIsService(Byte isService) {
        this.isService = isService;
    }

    public Integer getServiceImageId() {
        return serviceImageId;
    }

    public void setServiceImageId(Integer serviceImageId) {
        this.serviceImageId = serviceImageId;
    }

    public Byte getIsPhone() {
        return isPhone;
    }

    public void setIsPhone(Byte isPhone) {
        this.isPhone = isPhone;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo == null ? null : phoneNo.trim();
    }

    public Integer getPhoneImageId() {
        return phoneImageId;
    }

    public void setPhoneImageId(Integer phoneImageId) {
        this.phoneImageId = phoneImageId;
    }

    public String getMchid() {
        return mchid;
    }

    public void setMchid(String mchid) {
        this.mchid = mchid == null ? null : mchid.trim();
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey == null ? null : apikey.trim();
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