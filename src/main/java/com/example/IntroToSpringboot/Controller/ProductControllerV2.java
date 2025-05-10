package com.example.IntroToSpringboot.Controller;

import com.example.IntroToSpringboot.Entity.Product;
import com.example.IntroToSpringboot.Service.ProductServiceV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v2/jpa/")
@RestController
public class ProductControllerV2 {

    @Autowired
    ProductServiceV2 productServiceV2;

    @GetMapping(path="/products")
    public List<Product> getProductList() {
        return productServiceV2.getProductList();
    }


}
