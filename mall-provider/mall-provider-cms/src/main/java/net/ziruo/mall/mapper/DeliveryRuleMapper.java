package net.ziruo.mall.mapper;

import java.util.List;
import net.ziruo.mall.model.domain.DeliveryRule;
import net.ziruo.mall.model.domain.DeliveryRuleExample;
import org.apache.ibatis.annotations.Param;

public interface DeliveryRuleMapper {
    long countByExample(DeliveryRuleExample example);

    int deleteByExample(DeliveryRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeliveryRule record);

    int insertSelective(DeliveryRule record);

    List<DeliveryRule> selectByExampleWithBLOBs(DeliveryRuleExample example);

    List<DeliveryRule> selectByExample(DeliveryRuleExample example);

    DeliveryRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeliveryRule record, @Param("example") DeliveryRuleExample example);

    int updateByExampleWithBLOBs(@Param("record") DeliveryRule record, @Param("example") DeliveryRuleExample example);

    int updateByExample(@Param("record") DeliveryRule record, @Param("example") DeliveryRuleExample example);

    int updateByPrimaryKeySelective(DeliveryRule record);

    int updateByPrimaryKeyWithBLOBs(DeliveryRule record);

    int updateByPrimaryKey(DeliveryRule record);
}