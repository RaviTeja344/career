package com.example.product.service;

import com.example.product.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class ProductTypeService {


    private static List<Product> foodList = new ArrayList<>();
    private static List<Product> liquidList = new ArrayList<>();
    private static List<Product> AlcoholList = new ArrayList<>();


    public Product getTypeofProduct(Product product){

        if(product.getProductName().equalsIgnoreCase("beer")){
            AlcoholList.add(product);
            log.info("ALcohol List{}",AlcoholList);

        } else if (product.getProductName().equalsIgnoreCase("Food")) {
            foodList.add(product);
            log.info("Food List{}",foodList);

        }
        else {
            liquidList.add(product);
            log.info("All Other Types List{}",liquidList);

        }
        return product;
    }


}
