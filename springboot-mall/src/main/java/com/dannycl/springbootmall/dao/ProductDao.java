package com.dannycl.springbootmall.dao;

import com.dannycl.springbootmall.dto.ProductRequest;
import com.dannycl.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
