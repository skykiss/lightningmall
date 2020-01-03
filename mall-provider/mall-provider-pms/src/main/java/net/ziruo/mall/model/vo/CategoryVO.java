package net.ziruo.mall.model.vo;

import java.util.List;

/**
 * @Author: october
 * @Date: 2020/1/2 22:41
 * @Description:
 */
public class CategoryVO {

    private Integer id;

    private String name;

    private Integer parentId;

    private Integer sort;

    private List<CategoryVO> next;

    private Integer imageId;

    public CategoryVO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CategoryVO> getNext() {
        return next;
    }

    public void setNext(List<CategoryVO> next) {
        this.next = next;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
