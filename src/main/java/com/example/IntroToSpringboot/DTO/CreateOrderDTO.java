package com.example.IntroToSpringboot.DTO;

public class CreateOrderDTO {

    public Product product;


    public class Product {
        public String name;
        public int price;
        public float quantity;
    }



    // getter , setter

    public String getName() {
        return product.name;
    }

    public int getPrice() {
        return product.price;
    }


    public float getQuantity() {
        return product.quantity;
    }

}
