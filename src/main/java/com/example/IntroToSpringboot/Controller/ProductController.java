package com.example.IntroToSpringboot.Controller;

import com.example.IntroToSpringboot.DTO.ProductDetail;
import com.example.IntroToSpringboot.Entity.Product;
import com.example.IntroToSpringboot.Sample2;
import com.example.IntroToSpringboot.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products/")
public class ProductController {

    @Autowired
    ProductService productService;
    @Autowired
    Sample sampleObj;
    @Autowired
    Sample2 sample2Obj;

    @GetMapping("/data")
    public List<Product> getProducts(@RequestParam(name = "productId", required = false) Object productId,
                                    @RequestParam(name = "productName", required = false) String productName){

        List<Product> data = productService.getProductList();
        return data;
    }

    @GetMapping("/data/{product}/detail")
    public int getProducts123(@PathVariable(name="product") int productId){
        List<String> productList = new ArrayList<String>(3);
        productList.add("product1");
        productList.add("product2");
        productList.add("product3");

        return productId;
    }



    // Bean creation

    @PostMapping(path="/add-product")
    public ResponseEntity<String> addProduct(@RequestBody Product productObj){
        productService.addProduct(productObj.name, productObj.price);

        return ResponseEntity.status(HttpStatus.OK).body("Product Added successfully");
    }

}


// Bean creation Example

// class with default constructor
// Bean can be created by Spring automatically, no external configuration needed
@Component
class Sample {
    public int data = 100;
};



