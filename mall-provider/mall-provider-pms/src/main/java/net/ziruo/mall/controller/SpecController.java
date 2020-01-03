package net.ziruo.mall.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.ziruo.mall.model.dto.SpecAndSpecValueDTO;
import net.ziruo.mall.service.SpecService;
import net.ziruo.mall.wrapper.WrapMapper;
import net.ziruo.mall.wrapper.Wrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: october
 * @Date: 2020/1/3 11:27
 * @Description:
 */

@ApiOperation("商品属性操作")
@RestController
public class SpecController {

    @Autowired
    private SpecService specService;

    @ApiOperation("添加商品属性和值")
    @PostMapping("/spec")
    private Wrapper<Integer> addSpecKeyAndValue(@ApiParam(name = "specAndSpecValueDTO", value = "标签和属性")
                                                    @RequestBody SpecAndSpecValueDTO specAndSpecValueDTO){
        int specId = specService.addSpecKeyAndValue(specAndSpecValueDTO.getSpecName(),
                specAndSpecValueDTO.getSpecValue());
        return WrapMapper.ok(specId);
    }

}
