package com.example.springboottransactionmanagement.util;

import com.example.springboottransactionmanagement.entity.PaymentInfo;
import com.example.springboottransactionmanagement.exception.InsufficientMoneyException;

import java.util.HashMap;
import java.util.Map;

public class PaymentValidation {

     private static Map<String ,Double> paymentDetails = new HashMap<>();

     static {
         paymentDetails.put("Mobile",20000.0);
         paymentDetails.put("Laptop",60000.0);
         paymentDetails.put("Tablet",30000.0);
         paymentDetails.put("Charger",1000.0);

     }
     public static boolean validatePaymentInfo(PaymentInfo  paymentInfo ){
     if(paymentInfo.getAmount() <paymentDetails.get(paymentInfo.getProductName()))   {
         throw new InsufficientMoneyException("insufficient amount");
     }
     else {
         return true;
     }
     }
}
