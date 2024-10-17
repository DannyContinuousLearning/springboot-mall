package com.dannycl.springbootmall.rowmapper;

import com.dannycl.springbootmall.constant.ProductCategory;
import com.dannycl.springbootmall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            Product product = new Product();

            product.setProduct_id(rs.getInt("product_id"));
            product.setProduct_name(rs.getString("product_name"));

            String categoryStr = rs.getString("category");
            ProductCategory category = ProductCategory.valueOf(categoryStr);
            product.setCategory(category);

            //String categoryStr advantage method
            //product.setCategory(ProductCategory.valueOf(rs.getString("category")));

            product.setImageUrl(rs.getString("image_url"));
            product.setPrice(rs.getInt("price"));
            product.setStock(rs.getInt("stock"));
            product.setDescription(rs.getString("description"));
            product.setCreateDate(rs.getTimestamp("created_date"));
            product.setLastModfiedDate(rs.getTimestamp("last_modified_date"));

            return product;
    }
}
