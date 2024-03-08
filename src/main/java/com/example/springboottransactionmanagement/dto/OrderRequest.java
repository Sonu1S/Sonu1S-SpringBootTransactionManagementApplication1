package com.example.springboottransactionmanagement.dto;

import com.example.springboottransactionmanagement.entity.OrderInfo;
import com.example.springboottransactionmanagement.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderRequest {

    private OrderInfo orderInfo ;

    private PaymentInfo paymentInfo ;
}
