package net.ziruo.mall.mapper;

import java.util.List;
import net.ziruo.mall.model.domain.Wxapp;
import net.ziruo.mall.model.domain.WxappExample;
import org.apache.ibatis.annotations.Param;

public interface WxappMapper {
    long countByExample(WxappExample example);

    int deleteByExample(WxappExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wxapp record);

    int insertSelective(Wxapp record);

    List<Wxapp> selectByExample(WxappExample example);

    Wxapp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wxapp record, @Param("example") WxappExample example);

    int updateByExample(@Param("record") Wxapp record, @Param("example") WxappExample example);

    int updateByPrimaryKeySelective(Wxapp record);

    int updateByPrimaryKey(Wxapp record);
}