package net.ziruo.mall.service;

import net.ziruo.mall.model.dto.OssCallbackDTO;
import net.ziruo.mall.model.dto.OssPolicyDTO;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: october
 * @Date: 2020/1/4 18:45
 * @Description:
 */
public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyDTO policy();
    /**
     * oss上传成功回调
     */
    OssCallbackDTO callback(HttpServletRequest request);

}
