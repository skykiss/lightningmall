package net.ziruo.mall.model.dto;

/**
 * @Author: october
 * @Date: 2020/1/4 18:48
 * @Description:
 */
public class OssCallbackDTO {

    private String filename;

    private String size;

    // 文件的mimeType
    private String mimeType;

    private String width;

    private String height;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
