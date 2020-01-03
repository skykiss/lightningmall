package net.ziruo.mall.service.impl;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import net.ziruo.mall.mapper.CategoryMapper;
import net.ziruo.mall.model.domain.Category;
import net.ziruo.mall.model.domain.CategoryExample;
import net.ziruo.mall.model.dto.AddCategoryDTO;
import net.ziruo.mall.model.dto.UpdateCategoryDTO;
import net.ziruo.mall.model.vo.CategoryVO;
import net.ziruo.mall.service.CategoryService;
import net.ziruo.mall.util.TimeTransUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: october
 * @Date: 2020/1/2 17:43
 * @Description:
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    // 通过parentId查询所有的分类
    @Override
    public List<CategoryVO> listByParentId(Integer parentId){
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        CategoryExample example = new CategoryExample();
        example.createCriteria().andParentIdEqualTo(parentId);
        example.setOrderByClause("sort asc");   // 根据sort排序
        List<Category> categories = categoryMapper.selectByExample(example);
        List<CategoryVO> categoryVOList = new ArrayList<>();
        for(Category category: categories){
            categoryVOList.add(mapper.map(category, CategoryVO.class));
        }
        return categoryVOList;
    }

    @Override
    public List<CategoryVO> list() {
        List<CategoryVO> categoryVOList = listByParentId(0); // 先查询顶级分类
        for (CategoryVO categoryVO : categoryVOList) {
            categoryVO.setNext(listByParentId(categoryVO.getId()));
        }
        return categoryVOList;
    }

    @Override
    public int delete(Integer id) {
        CategoryExample example = new CategoryExample();
        example.createCriteria().andParentIdEqualTo(id);
        categoryMapper.deleteByExample(example); // 先删除子分类
        return categoryMapper.deleteByPrimaryKey(id); // 删除当前分类
    }

    @Override
    public int add(AddCategoryDTO addCategoryDTO) {
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        Category category = mapper.map(addCategoryDTO, Category.class);
        category.setCreateTime(TimeTransUtil.currentTimeToInt());
        category.setUpdateTime(TimeTransUtil.currentTimeToInt());
        return categoryMapper.insertSelective(category);
    }

    @Override
    public int update(UpdateCategoryDTO updateCategoryDTO) {
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        Category category = mapper.map(updateCategoryDTO, Category.class);
        category.setUpdateTime(TimeTransUtil.currentTimeToInt());
        return categoryMapper.updateByPrimaryKeySelective(category);
    }

    @Override
    public CategoryVO get(Integer id) {
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        Category category = categoryMapper.selectByPrimaryKey(id);
        CategoryVO categoryVO = mapper.map(category, CategoryVO.class);
        return categoryVO;
    }


}
