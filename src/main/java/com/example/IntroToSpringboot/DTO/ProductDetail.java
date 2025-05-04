package com.example.IntroToSpringboot.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductDetail {

    @JsonProperty("product_name") // this denotes actual key present in the body
    String productName;
    int price;

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName(){
        return productName;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

}
