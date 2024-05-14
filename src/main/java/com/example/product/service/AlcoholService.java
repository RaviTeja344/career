package com.example.product.service;

import com.example.product.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AlcoholService {

    public Product alcoholProduct(Product product){
        if(product.getProductName().equals("beer")){
            product.setProductName(product.getProductName().toUpperCase());
            log.info("Set Product Name to Capital {}",product.getProductName().toUpperCase());
            return product;
        }
        return product;
    }


    public void lambda(){
    }
}
