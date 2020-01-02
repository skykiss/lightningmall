package net.ziruo.mall.mapper;

import java.util.List;
import net.ziruo.mall.model.domain.WxappHelp;
import net.ziruo.mall.model.domain.WxappHelpExample;
import org.apache.ibatis.annotations.Param;

public interface WxappHelpMapper {
    long countByExample(WxappHelpExample example);

    int deleteByExample(WxappHelpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxappHelp record);

    int insertSelective(WxappHelp record);

    List<WxappHelp> selectByExampleWithBLOBs(WxappHelpExample example);

    List<WxappHelp> selectByExample(WxappHelpExample example);

    WxappHelp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxappHelp record, @Param("example") WxappHelpExample example);

    int updateByExampleWithBLOBs(@Param("record") WxappHelp record, @Param("example") WxappHelpExample example);

    int updateByExample(@Param("record") WxappHelp record, @Param("example") WxappHelpExample example);

    int updateByPrimaryKeySelective(WxappHelp record);

    int updateByPrimaryKeyWithBLOBs(WxappHelp record);

    int updateByPrimaryKey(WxappHelp record);
}