package net.ziruo.mall.mapper;

import java.util.List;
import net.ziruo.mall.model.domain.WxappNavbar;
import net.ziruo.mall.model.domain.WxappNavbarExample;
import org.apache.ibatis.annotations.Param;

public interface WxappNavbarMapper {
    long countByExample(WxappNavbarExample example);

    int deleteByExample(WxappNavbarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxappNavbar record);

    int insertSelective(WxappNavbar record);

    List<WxappNavbar> selectByExample(WxappNavbarExample example);

    WxappNavbar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxappNavbar record, @Param("example") WxappNavbarExample example);

    int updateByExample(@Param("record") WxappNavbar record, @Param("example") WxappNavbarExample example);

    int updateByPrimaryKeySelective(WxappNavbar record);

    int updateByPrimaryKey(WxappNavbar record);
}