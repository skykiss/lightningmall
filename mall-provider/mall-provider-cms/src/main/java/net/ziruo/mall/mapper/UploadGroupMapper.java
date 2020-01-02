package net.ziruo.mall.mapper;

import java.util.List;
import net.ziruo.mall.model.domain.UploadGroup;
import net.ziruo.mall.model.domain.UploadGroupExample;
import org.apache.ibatis.annotations.Param;

public interface UploadGroupMapper {
    long countByExample(UploadGroupExample example);

    int deleteByExample(UploadGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UploadGroup record);

    int insertSelective(UploadGroup record);

    List<UploadGroup> selectByExample(UploadGroupExample example);

    UploadGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UploadGroup record, @Param("example") UploadGroupExample example);

    int updateByExample(@Param("record") UploadGroup record, @Param("example") UploadGroupExample example);

    int updateByPrimaryKeySelective(UploadGroup record);

    int updateByPrimaryKey(UploadGroup record);
}