package net.ziruo.mall.service.impl;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import net.ziruo.mall.mapper.UploadFileMapper;
import net.ziruo.mall.model.domain.UploadFile;
import net.ziruo.mall.model.dto.AddUploadFileDTO;
import net.ziruo.mall.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: october
 * @Date: 2020/1/4 23:24
 * @Description:
 */

@Service
public class UploadFileServiceImpl implements UploadFileService {

    @Autowired
    private UploadFileMapper uploadFileMapper;

    @Override
    public int addUploadFile(AddUploadFileDTO addUploadFileDTO) {
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        UploadFile uploadFile = mapper.map(addUploadFileDTO, UploadFile.class);
        uploadFileMapper.insertSelective(uploadFile);
        return uploadFile.getId();
    }
}
