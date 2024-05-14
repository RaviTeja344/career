package com.example.product.service;

import com.example.product.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceTest {

    @Autowired
    ProductService productService;

    @Test
    public void getAllProducts(){
        productService.getAllProducts();
    }

    @Test
    public void addProduct(){
        Product product = new Product(16,"beer",30);
        productService.addProduct(product);
    }
    @Test
    public void getProductById(){
        productService.getProductById(1);
    }

    @Test
    public void deleteProductByName(){
        productService.deleteProductByName("beer");
    }
}
