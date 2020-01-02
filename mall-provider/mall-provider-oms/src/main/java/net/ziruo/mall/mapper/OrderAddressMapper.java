package net.ziruo.mall.mapper;

import java.util.List;
import net.ziruo.mall.model.domain.OrderAddress;
import net.ziruo.mall.model.domain.OrderAddressExample;
import org.apache.ibatis.annotations.Param;

public interface OrderAddressMapper {
    long countByExample(OrderAddressExample example);

    int deleteByExample(OrderAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderAddress record);

    int insertSelective(OrderAddress record);

    List<OrderAddress> selectByExample(OrderAddressExample example);

    OrderAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderAddress record, @Param("example") OrderAddressExample example);

    int updateByExample(@Param("record") OrderAddress record, @Param("example") OrderAddressExample example);

    int updateByPrimaryKeySelective(OrderAddress record);

    int updateByPrimaryKey(OrderAddress record);
}