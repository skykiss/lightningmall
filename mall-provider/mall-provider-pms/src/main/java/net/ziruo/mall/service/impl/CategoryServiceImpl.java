package net.ziruo.mall.service.impl;

import net.ziruo.mall.mapper.CategoryMapper;
import net.ziruo.mall.model.domain.Category;
import net.ziruo.mall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public List<Category> list() {
        return categoryMapper.selectByExample(null);
    }
}
