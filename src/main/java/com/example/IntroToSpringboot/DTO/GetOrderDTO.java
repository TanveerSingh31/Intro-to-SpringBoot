package com.example.IntroToSpringboot.DTO;

import com.example.IntroToSpringboot.Entity.Order;

import java.util.Optional;

public class GetOrderDTO {

    public long orderId;
    public Product product;

    class Product {
        public long productId;
        public String name;
        public int price;
        public float quantity;
    }

    public GetOrderDTO(Order obj){

        this.orderId = obj.orderId;
        Product product = new Product();

        product.name = obj.product.getName();
        product.price = obj.product.getPrice();
        product.quantity = obj.product.getQuantity();


        this.product = product;
        
    }


}
