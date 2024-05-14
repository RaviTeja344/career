package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.service.AlcoholService;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    AlcoholService alcoholService;


    @PostMapping(value = "/addProduct")
    public Product addProduct(@RequestBody Product product){
         return productService.addProduct(product);
    }

    @GetMapping(value = "/getProducts")
    public List<Product> getAllProducts(){
       return productService.getAllProducts();
    }

    @GetMapping(value = "/getProductID/{productID}")
    public Product getProductByID(@PathVariable int  productID) {
       return productService.getProductById(productID);
    }

    @PostMapping(value = "/deleteProductByName/{name}")
    public void deleteProductByName(@PathVariable String name){
        productService.deleteProductByName(name);
    }
}
