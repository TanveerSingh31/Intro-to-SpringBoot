package com.example.IntroToSpringboot.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products", uniqueConstraints = { @UniqueConstraint(columnNames = "name") })
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public String name;

    @Column(name="product_price")
    public int price;

    @Column
    public float quantity;



    // getter, setter

    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public float getQuantity() {
        return quantity;
    }

}
