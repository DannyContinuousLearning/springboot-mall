package com.dannycl.springbootmall.dao;

import com.dannycl.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
