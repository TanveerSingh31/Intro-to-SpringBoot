package com.example.IntroToSpringboot.Controller;

import com.example.IntroToSpringboot.DTO.CreateOrderDTO;
import com.example.IntroToSpringboot.DTO.GetOrderDTO;
import com.example.IntroToSpringboot.DTO.GetOrderListDTO;
import com.example.IntroToSpringboot.Entity.Order;
import com.example.IntroToSpringboot.Entity.Product;
import com.example.IntroToSpringboot.Service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/product")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/get-order")
    public GetOrderDTO getProducts(@RequestParam Long orderId){
        try{
            return orderService.getOrder(orderId);
        }
        catch(Exception e) {
            throw e;
        }
    }

    @PostMapping("/add-order")
    public Order addOrder(@RequestBody CreateOrderDTO obj) {

        // transfering data from DTO to entity object
        Order orderObj = new Order();
        Product productObj = new Product();

        productObj.setName(obj.getName());
        productObj.setPrice(obj.getPrice());
        productObj.setQuantity(obj.getQuantity());

        orderObj.setProduct(productObj);

        return orderService.addOrder(orderObj);
    }


    @GetMapping(path="/derived-query/get-order")
    public Order getOrder(@RequestBody GetOrderListDTO orderObj) {

        return orderService.getOrderById(orderObj.orderIds);
    }


    @GetMapping(path="/jpql-query/get-order")
    public Order getOrder(@RequestParam Long orderId) {

        return orderService.getOrderByIdJpql(orderId);
    }

}
