package net.ziruo.mall.model.dto;

/**
 * @Author: october
 * @Date: 2020/1/4 18:50
 * @Description:
 */
public class OssPolicyDTO {

    // 访问身份验证中的身份标识
    private String accessKeyId;

    // 用户表单上传的策略 经过base64编码后
    private String policy;

    // 对policy签名后的字符串
    private String signature;

    // 上传文件夹路径前缀
    private String dir;

    //oss对外访问域名
    private String host;

    // 上传后回调设置
    private String callback;

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }
}
