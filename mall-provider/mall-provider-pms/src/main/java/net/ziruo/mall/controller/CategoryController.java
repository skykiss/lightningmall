package net.ziruo.mall.controller;

import net.ziruo.mall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: october
 * @Date: 2020/1/2 17:45
 * @Description:
 */

@RestController
@RequestMapping(path = "/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(path = "/list")
    public Object categoryList(){
        return categoryService.list();
    }

}
