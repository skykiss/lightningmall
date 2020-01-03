package net.ziruo.mall.service.impl;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import net.ziruo.mall.mapper.GoodsMapper;
import net.ziruo.mall.mapper.GoodsSpecMapper;
import net.ziruo.mall.model.domain.Goods;
import net.ziruo.mall.model.domain.GoodsSpec;
import net.ziruo.mall.model.dto.AddGoodsDTO;
import net.ziruo.mall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: october
 * @Date: 2020/1/4 02:27
 * @Description:
 */

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private GoodsSpecMapper goodsSpecMapper;

    @Override
    public int addSingleSpecGoods(AddGoodsDTO addGoodsDTO) {
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        Goods goods = mapper.map(addGoodsDTO, Goods.class);
        goodsMapper.insertSelective(goods);
        GoodsSpec goodsSpec = mapper.map(addGoodsDTO, GoodsSpec.class);
        goodsSpec.setGoodsId(goods.getId());
        goodsSpecMapper.insertSelective(goodsSpec);
        return goods.getId();
    }
}
