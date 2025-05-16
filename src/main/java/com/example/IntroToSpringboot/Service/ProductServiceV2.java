package com.example.IntroToSpringboot.Service;

import com.example.IntroToSpringboot.Entity.Product;
import com.example.IntroToSpringboot.Repository.ProductRepositoryV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceV2 {

    @Autowired
    ProductRepositoryV2 productRepositoryV2;

    public List<Product> getProductList() {
        return productRepositoryV2.findAll();
    }


    public Product addProduct(Product productObj) {
        return productRepositoryV2.save(productObj);
    }

}
