package com.example.IntroToSpringboot.Controller;

import com.example.IntroToSpringboot.Entity.Product;
import com.example.IntroToSpringboot.Service.ProductServiceV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping(path="/add-product")
    public ResponseEntity<String> addProduct(@RequestBody Product productObj) {
        try{

            Product data = productServiceV2.addProduct(productObj);
            if(data != null) {
                return ResponseEntity.status(HttpStatus.OK).body("product added !");
            }
            else{
                return ResponseEntity.status(HttpStatus.OK).body("product not added ");
            }

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }


}
