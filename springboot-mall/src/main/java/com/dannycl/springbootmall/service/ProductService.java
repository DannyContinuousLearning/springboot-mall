package com.dannycl.springbootmall.service;

import com.dannycl.springbootmall.dto.ProductRequest;
import com.dannycl.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
