package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;
import java.util.List;

import static org.mockito.Mockito.when;

@DataJpaTest
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureDataJpa
public class ProductControllerTest {

    @Autowired
    ProductRepository productRepository;

   @Autowired
   private TestEntityManager testEntityManager;

   /* @Test
    public void getAllProductsTest(){
        Product product = Product.builder().productName("Beer").productPrice(10).productID(1).build();
        try {
            testEntityManager.persist(product);
        }
        catch (Exception e ){
            e.printStackTrace();
        }

        Iterator iterator = (Iterator) productRepository.findAll();
    }*/
}
