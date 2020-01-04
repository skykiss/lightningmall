package net.ziruo.mall.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.ziruo.mall.model.domain.UploadFile;
import net.ziruo.mall.model.dto.AddUploadFileDTO;
import net.ziruo.mall.service.UploadFileService;
import net.ziruo.mall.wrapper.WrapMapper;
import net.ziruo.mall.wrapper.Wrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: october
 * @Date: 2020/1/4 21:44
 * @Description:
 */

@ApiOperation("文件上传操作")
@RestController
public class FileController {

    @Autowired
    private UploadFileService uploadFileService;

    @ApiOperation("添加图片地址")
    @PostMapping("/file")
    public Wrapper<Integer> addFile(@ApiParam(value = "addUploadFileDTO", name = "图片的相关信息DTO")
                                        @RequestBody  AddUploadFileDTO addUploadFileDTO){
        int fid = uploadFileService.addUploadFile(addUploadFileDTO);
        return WrapMapper.ok(fid);
    }



}
