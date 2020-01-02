package net.ziruo.mall.mapper;

import java.util.List;
import net.ziruo.mall.model.domain.OrderGoods;
import net.ziruo.mall.model.domain.OrderGoodsExample;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodsMapper {
    long countByExample(OrderGoodsExample example);

    int deleteByExample(OrderGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderGoods record);

    int insertSelective(OrderGoods record);

    List<OrderGoods> selectByExampleWithBLOBs(OrderGoodsExample example);

    List<OrderGoods> selectByExample(OrderGoodsExample example);

    OrderGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderGoods record, @Param("example") OrderGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderGoods record, @Param("example") OrderGoodsExample example);

    int updateByExample(@Param("record") OrderGoods record, @Param("example") OrderGoodsExample example);

    int updateByPrimaryKeySelective(OrderGoods record);

    int updateByPrimaryKeyWithBLOBs(OrderGoods record);

    int updateByPrimaryKey(OrderGoods record);
}