package com.mmall.vo;

import java.math.BigDecimal;

public class ProductListVo {

    private Integer id;
    private Integer categoryId;

    private String name;
    private String subtitile;
    private String mainImages;
    private BigDecimal price;

    private Integer status;

    private String imageHost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitile() {
        return subtitile;
    }

    public void setSubtitile(String subtitile) {
        this.subtitile = subtitile;
    }

    public String getMainImages() {
        return mainImages;
    }

    public void setMainImages(String mainImages) {
        this.mainImages = mainImages;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }
}
