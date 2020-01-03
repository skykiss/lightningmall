package net.ziruo.mall.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.ziruo.mall.model.dto.AddCategoryDTO;
import net.ziruo.mall.model.dto.UpdateCategoryDTO;
import net.ziruo.mall.model.vo.CategoryVO;
import net.ziruo.mall.service.CategoryService;
import net.ziruo.mall.wrapper.WrapMapper;
import net.ziruo.mall.wrapper.Wrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: october
 * @Date: 2020/1/2 17:45
 * @Description:
 */

@RestController
@ApiOperation("分类控制")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @ApiOperation("获取分类列表")
    @GetMapping("/category/list")
    public Wrapper<List<CategoryVO>> list(){
        return WrapMapper.ok(categoryService.list());
    }

    @ApiOperation("通过parentId查询分类列表")
    @GetMapping("/category/next/{parentId}")
    public Wrapper<List<CategoryVO>> listByParentId(@ApiParam(name = "parentId", value = "父分类id")
                                                           @PathVariable Integer parentId){
        return WrapMapper.ok(categoryService.listByParentId(parentId));
    }

    @ApiOperation("通过id查询分类")
    @GetMapping("/category/{id}")
    public Wrapper<CategoryVO> get(@ApiParam(name = "id", value = "分类id")
                                                    @PathVariable Integer id){
        return WrapMapper.ok(categoryService.get(id));
    }


    @ApiOperation("删除分类")
    @DeleteMapping("/category/{id}")
    public Wrapper<Integer> delete(@ApiParam(name = "id", value = "商品分类id") @PathVariable Integer id){
        int result = categoryService.delete(id);
        return WrapMapper.ok(result);
    }

    @ApiOperation("添加分类")
    @PostMapping("/category")
    public Wrapper<Integer> add(@ApiParam(name = "addCategoryDTO", value = "商品dto") @RequestBody AddCategoryDTO addCategoryDTO){
        int result = categoryService.add(addCategoryDTO);
        return WrapMapper.ok(result);
    }

    @ApiOperation("修改分类")
    @PutMapping("/category")
    public Wrapper<Integer> update(@ApiParam(name = "updateCategoryDTO", value = "商品dto") @RequestBody UpdateCategoryDTO updateCategoryDTO){
        int result = categoryService.update(updateCategoryDTO);
        return WrapMapper.ok(result);
    }

}
