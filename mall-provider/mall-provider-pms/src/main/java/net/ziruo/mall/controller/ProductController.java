package net.ziruo.mall.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.ziruo.mall.model.domain.Goods;
import net.ziruo.mall.model.dto.AddGoodsDTO;
import net.ziruo.mall.service.GoodsService;
import net.ziruo.mall.wrapper.WrapMapper;
import net.ziruo.mall.wrapper.Wrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: october
 * @Date: 2020/1/4 02:29
 * @Description:
 */

@ApiOperation("商品操作")
@RestController
public class ProductController {

    @Autowired
    private GoodsService goodsService;

    @ApiOperation("添加单规格商品")
    @PostMapping("/product/single")
    public Wrapper<Integer> addSingleProduct(@ApiParam(name = "addGoodsDTO", value = "单规格DTO")
                                                 @RequestBody AddGoodsDTO addGoodsDTO){
        int result = goodsService.addSingleSpecGoods(addGoodsDTO);
        return WrapMapper.ok(result);
    }

}
