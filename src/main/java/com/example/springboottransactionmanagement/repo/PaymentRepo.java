package com.example.springboottransactionmanagement.repo;

import com.example.springboottransactionmanagement.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<PaymentInfo , Long> {
}
