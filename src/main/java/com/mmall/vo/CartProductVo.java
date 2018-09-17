package com.mmall.vo;

import java.math.BigDecimal;

public class CartProductVo {
    //结合了产品和购物车的一个抽象对象

    private Integer id;
    private Integer userid;
    private Integer productId;
    private Integer quantity;//购物车中此商品的数量
    private String productName;
    private String productSubtitile;
    private String productMainImage;
    private BigDecimal productPrice;
    private Integer productStatus;
    private BigDecimal productTotalprice;
    private Integer productStock;
    private Integer productChecked;//此商品是否勾选

    private String limitQuantity;//限制数量的一个返回结果

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSubtitile() {
        return productSubtitile;
    }

    public void setProductSubtitile(String productSubtitile) {
        this.productSubtitile = productSubtitile;
    }

    public String getProductMainImage() {
        return productMainImage;
    }

    public void setProductMainImage(String productMainImage) {
        this.productMainImage = productMainImage;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public BigDecimal getProductTotalprice() {
        return productTotalprice;
    }

    public void setProductTotalprice(BigDecimal productTotalprice) {
        this.productTotalprice = productTotalprice;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public Integer getProductChecked() {
        return productChecked;
    }

    public void setProductChecked(Integer productChecked) {
        this.productChecked = productChecked;
    }

    public String getLimitQuantity() {
        return limitQuantity;
    }

    public void setLimitQuantity(String limitQuantity) {
        this.limitQuantity = limitQuantity;
    }
}
