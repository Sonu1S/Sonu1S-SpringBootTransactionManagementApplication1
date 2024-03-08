package com.example.springboottransactionmanagement.service;

import com.example.springboottransactionmanagement.dto.OrderAck;
import com.example.springboottransactionmanagement.dto.OrderRequest;
import com.example.springboottransactionmanagement.entity.OrderInfo;
import com.example.springboottransactionmanagement.entity.PaymentInfo;
import com.example.springboottransactionmanagement.repo.OrderRepo;
import com.example.springboottransactionmanagement.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.example.springboottransactionmanagement.util.PaymentValidation.validatePaymentInfo;

@Service
public class OrderService {

    @Autowired

    private OrderRepo orderRepo;

    @Autowired
    private PaymentRepo paymentRepo;

@Transactional
    public OrderAck placingOrder(OrderRequest orderRequest){
        OrderInfo   orderInfo = orderRequest.getOrderInfo();
        orderInfo  = orderRepo.save(orderInfo);

        PaymentInfo paymentInfo = orderRequest.getPaymentInfo();
        validatePaymentInfo(paymentInfo);
        orderInfo.setProductName(paymentInfo.getProductName());
        orderRepo.save(orderInfo);
        paymentRepo.save(paymentInfo);
        return new OrderAck("Success",paymentInfo.getAmount(),paymentInfo);




    }


}
