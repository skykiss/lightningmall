package net.ziruo.mall.mapper;

import java.util.List;
import net.ziruo.mall.model.domain.StoreUser;
import net.ziruo.mall.model.domain.StoreUserExample;
import org.apache.ibatis.annotations.Param;

public interface StoreUserMapper {
    long countByExample(StoreUserExample example);

    int deleteByExample(StoreUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StoreUser record);

    int insertSelective(StoreUser record);

    List<StoreUser> selectByExample(StoreUserExample example);

    StoreUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StoreUser record, @Param("example") StoreUserExample example);

    int updateByExample(@Param("record") StoreUser record, @Param("example") StoreUserExample example);

    int updateByPrimaryKeySelective(StoreUser record);

    int updateByPrimaryKey(StoreUser record);
}