package net.ziruo.mall.model.dto;

/**
 * @Author: october
 * @Date: 2020/1/4 19:01
 * @Description:
 */
public class OssCallbackParamDTO {

    //请求的回调地址
    private String callbackUrl;

    //回调是传入request中的参数
    private String callbackBody;

    //回调时传入参数的格式，比如表单提交形式
    private String callbackBodyType;

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getCallbackBody() {
        return callbackBody;
    }

    public void setCallbackBody(String callbackBody) {
        this.callbackBody = callbackBody;
    }

    public String getCallbackBodyType() {
        return callbackBodyType;
    }

    public void setCallbackBodyType(String callbackBodyType) {
        this.callbackBodyType = callbackBodyType;
    }
}
