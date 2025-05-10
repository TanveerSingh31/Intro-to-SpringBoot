package com.example.IntroToSpringboot.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {

    @Id
    public int id;

    @Column
    public String name;

    @Column
    public int price;

}
