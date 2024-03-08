package com.example.springboottransactionmanagement.controller;

import com.example.springboottransactionmanagement.dto.OrderAck;
import com.example.springboottransactionmanagement.dto.OrderRequest;
import com.example.springboottransactionmanagement.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {

     @Autowired
     private OrderService orderService;
   @PostMapping("/placeOrder")
    public OrderAck  placeOrder(@RequestBody OrderRequest orderRequest){

      return orderService.placingOrder(orderRequest)  ;
   }

}
