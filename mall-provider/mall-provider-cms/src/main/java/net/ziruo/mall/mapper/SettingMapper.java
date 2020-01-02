package net.ziruo.mall.mapper;

import java.util.List;
import net.ziruo.mall.model.domain.Setting;
import net.ziruo.mall.model.domain.SettingExample;
import org.apache.ibatis.annotations.Param;

public interface SettingMapper {
    long countByExample(SettingExample example);

    int deleteByExample(SettingExample example);

    int insert(Setting record);

    int insertSelective(Setting record);

    List<Setting> selectByExampleWithBLOBs(SettingExample example);

    List<Setting> selectByExample(SettingExample example);

    int updateByExampleSelective(@Param("record") Setting record, @Param("example") SettingExample example);

    int updateByExampleWithBLOBs(@Param("record") Setting record, @Param("example") SettingExample example);

    int updateByExample(@Param("record") Setting record, @Param("example") SettingExample example);
}