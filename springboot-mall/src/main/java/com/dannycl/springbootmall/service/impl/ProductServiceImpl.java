package com.dannycl.springbootmall.service.impl;

import com.dannycl.springbootmall.dao.ProductDao;
import com.dannycl.springbootmall.dto.ProductRequest;
import com.dannycl.springbootmall.model.Product;
import com.dannycl.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}

