package com.example.IntroToSpringboot.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long orderId;


    @Column(name="orderDate", nullable = true)
    public LocalDateTime orderDate;


    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name="productId", referencedColumnName = "id")
    @JsonIgnore
    public Product product;




    // getter , setter
    public Long getOrderId() {
        return orderId;
    }

    public void setProduct(Product p) {
        this.product = p;
    }

}
