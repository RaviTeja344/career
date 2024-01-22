package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/products")
@Slf4j
public class ProductController {

   @Autowired
   private ProductRepository productRepository;

   RestTemplate restTemplate;

    @PostMapping(value = "/addProduct")
    public Product addProduct(@RequestBody Product product){
         productRepository.save(product);
        return product;
    }

    @GetMapping(value = "/getProducts")
    public List<Product> getAllProducts(){
        List<Product> productList = productRepository.findAll();
        return productList;

    }

    @GetMapping(value = "/getProductID/{productID}")
    public Product getProductByID(@PathVariable int  productID) {
        Optional<Product> product = productRepository.findById(productID);
        if(product.isPresent()){
            return product.get();
        }
        else {
            throw new RuntimeException("No ID Found");
        }


    }

    @GetMapping(value = "/getProductIDD/{productIDD}")
    public ResponseEntity<Product> getProductByIDD(@PathVariable int  productIDD) {
        Optional<Product> product = productRepository.findById(productIDD);
        if(product.isPresent()){
            log.info("Returned : {}",product);
            return new ResponseEntity(product,HttpStatus.OK);
        }
        else {
            log.info("No ID Found");
            throw new RuntimeException("No ID Found");
        }


    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public String runTimeException(Exception e){
       return e.getMessage();
    }



}
