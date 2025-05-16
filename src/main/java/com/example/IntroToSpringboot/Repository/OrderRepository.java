package com.example.IntroToSpringboot.Repository;

import com.example.IntroToSpringboot.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {


    // Derived Queries
    public Order findOrderByOrderId(Long orderId);

    public Order findOrderByOrderIdIsIn(List<Long> orderId);


    // JPQL
    @Query("SELECT o FROM Order o WHERE orderId=:id")
    public Order getOrderById(@Param("id") Long orderId);

}
