package net.ziruo.mall.model.dto;

/**
 * @Author: october
 * @Date: 2020/1/3 00:07
 * @Description:
 */
public class AddCategoryDTO {

    private String name;

    private Integer parentId;

    private Integer imageId;

    private Integer sort;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
