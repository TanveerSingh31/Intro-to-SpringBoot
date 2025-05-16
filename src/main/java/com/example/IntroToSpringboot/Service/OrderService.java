package com.example.IntroToSpringboot.Service;

import com.example.IntroToSpringboot.DTO.CreateOrderDTO;
import com.example.IntroToSpringboot.DTO.GetOrderDTO;
import com.example.IntroToSpringboot.Entity.Order;
import com.example.IntroToSpringboot.Repository.OrderRepository;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public GetOrderDTO getOrder(Long orderId) {
        Order obj = orderRepository.findById(orderId).orElseThrow(() -> new EntityNotFoundException("User not found"));;
        return new GetOrderDTO(obj);
    }

    public Order addOrder(Order obj) {
        return orderRepository.save(obj);
    }


    public Order getOrderById(List<Long> orderId) {
        return orderRepository.findOrderByOrderIdIsIn(orderId);
    }


    public Order getOrderByIdJpql(Long orderId) {
        return orderRepository.getOrderById(orderId);
    }

}
