package com.example.product.controller;

import com.example.product.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductControllerTest {

    @Autowired
    ProductController productController;


    @Test
    public void getAllProductsTest() {
        productController.getAllProducts();

    }
    @Test
    public void addProductTest(){
        Product product = new Product(2,"Pizza",15);
        productController.addProduct(product);
    }
}
