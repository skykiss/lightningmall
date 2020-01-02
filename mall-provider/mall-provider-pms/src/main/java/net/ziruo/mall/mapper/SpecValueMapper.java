package net.ziruo.mall.mapper;

import java.util.List;
import net.ziruo.mall.model.domain.SpecValue;
import net.ziruo.mall.model.domain.SpecValueExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecValueMapper {
    long countByExample(SpecValueExample example);

    int deleteByExample(SpecValueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SpecValue record);

    int insertSelective(SpecValue record);

    List<SpecValue> selectByExample(SpecValueExample example);

    SpecValue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SpecValue record, @Param("example") SpecValueExample example);

    int updateByExample(@Param("record") SpecValue record, @Param("example") SpecValueExample example);

    int updateByPrimaryKeySelective(SpecValue record);

    int updateByPrimaryKey(SpecValue record);
}