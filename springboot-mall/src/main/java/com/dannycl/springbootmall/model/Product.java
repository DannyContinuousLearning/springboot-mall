package com.dannycl.springbootmall.model;

import com.dannycl.springbootmall.constant.ProductCategory;

import java.util.Date;

public class Product {

    private Integer productId;
    private String productName;
    private ProductCategory category;
    private String imageUrl;
    private Integer price;
    private Integer stock;
    private String description;
    private Date createDate;
    private Date lastModfiedDate;

    public Integer getProduct_id() {
        return productId;
    }

    public void setProduct_id(Integer product_id) {
        this.productId = product_id;
    }

    public String getProduct_name() {
        return productName;
    }

    public void setProduct_name(String product_name) {
        this.productName = product_name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastModfiedDate() {
        return lastModfiedDate;
    }

    public void setLastModfiedDate(Date lastModfiedDate) {
        this.lastModfiedDate = lastModfiedDate;
    }
}
