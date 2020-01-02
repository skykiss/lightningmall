package net.ziruo.mall.mapper;

import java.util.List;
import net.ziruo.mall.model.domain.GoodsSpecRel;
import net.ziruo.mall.model.domain.GoodsSpecRelExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsSpecRelMapper {
    long countByExample(GoodsSpecRelExample example);

    int deleteByExample(GoodsSpecRelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsSpecRel record);

    int insertSelective(GoodsSpecRel record);

    List<GoodsSpecRel> selectByExample(GoodsSpecRelExample example);

    GoodsSpecRel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsSpecRel record, @Param("example") GoodsSpecRelExample example);

    int updateByExample(@Param("record") GoodsSpecRel record, @Param("example") GoodsSpecRelExample example);

    int updateByPrimaryKeySelective(GoodsSpecRel record);

    int updateByPrimaryKey(GoodsSpecRel record);
}