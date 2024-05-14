package com.example.product.service;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {


    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private AlcoholService alcoholService;

    @Autowired
    private ProductTypeService productTypeService;

    public Product addProduct(Product product){
        try {
           alcoholService.alcoholProduct(product);
            productTypeService.getTypeofProduct(product);
           log.info("Product is {}",productRepository.save(product));
                return productRepository.save(product);
        }catch (Exception e){
            e.getMessage();
        }
        return null;
    }

    public List<Product> getAllProducts(){
        try {
            log.info("Product List {}",productRepository.findAll());
            return productRepository.findAll();

        }
        catch (Exception e){
            e.getMessage();
        }
        return null;
    }

    public Product getProductById(int productId){
        if(productRepository.findById(productId).isPresent()){
            log.info("Product Found {}",productRepository.findById(productId));
            return productRepository.findById(productId).get();
        }else {
            log.info("Product Not Found");
        }
        return null;
    }

    public void deleteProductByName(String name){
       productRepository.deleteAll(productRepository.findAll().
               stream().filter(product1 -> product1.getProductName().equals(name)).toList());
    }

}
