package com.example.IntroToSpringboot.Service;

import com.example.IntroToSpringboot.Entity.Product;
import com.example.IntroToSpringboot.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getProductList() {
        return  productRepository.getProductList();
    }

    public int addProduct(String name, int price) {
        return productRepository.addProduct(name, price);
    }
}
