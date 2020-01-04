package net.ziruo.mall.controller;

import io.swagger.annotations.ApiOperation;
import net.ziruo.mall.model.dto.OssPolicyDTO;
import net.ziruo.mall.service.OssService;
import net.ziruo.mall.wrapper.WrapMapper;
import net.ziruo.mall.wrapper.Wrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: october
 * @Date: 2020/1/4 19:14
 * @Description:
 */

@ApiOperation("oss操作")
@RestController
public class OssController {

    @Autowired
    private OssService ossService;

    @ApiOperation("oss上传签名生成")
    @GetMapping("/oss/policy")
    public Wrapper<OssPolicyDTO> getPolicy(){
        OssPolicyDTO result = ossService.policy();
        return WrapMapper.ok(result);
    }

}
