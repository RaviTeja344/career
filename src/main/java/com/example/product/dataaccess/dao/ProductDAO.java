package com.example.product.dataaccess.dao;

import com.example.product.dataaccess.dto.ProductDTO;
import com.example.product.model.Product;

public class ProductDAO {

    public ProductDTO pouplateProducts(ProductDTO dto){
        Product product = new Product();
        //product.setAddresses(List.of(new Address("123", "456", "789", "123", "123", 12)));
        return new ProductDTO();
    }
}
