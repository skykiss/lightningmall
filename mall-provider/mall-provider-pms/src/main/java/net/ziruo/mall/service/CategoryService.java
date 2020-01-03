package net.ziruo.mall.service;

import net.ziruo.mall.model.domain.Category;
import net.ziruo.mall.model.dto.AddCategoryDTO;
import net.ziruo.mall.model.dto.UpdateCategoryDTO;
import net.ziruo.mall.model.vo.CategoryVO;

import java.util.List;

/**
 * @Author: october
 * @Date: 2020/1/2 17:42
 * @Description:
 */

public interface CategoryService {

    List<CategoryVO> list();

    List<CategoryVO> listByParentId(Integer parentId);

    int delete(Integer id);

    int add(AddCategoryDTO addCategoryDTO);

    int update(UpdateCategoryDTO updateCategoryDTO);

    CategoryVO get(Integer id);

}
