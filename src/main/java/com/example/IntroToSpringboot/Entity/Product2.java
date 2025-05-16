package com.example.IntroToSpringboot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

// this entity is having composite-primary key
@Entity
@IdClass(Product2_CompositeKey.class)
public class Product2 {

    @Id
    public int product_id;

    @Id
    public String product_name;

    public int product_price;


}
