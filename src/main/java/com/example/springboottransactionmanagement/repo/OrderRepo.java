package com.example.springboottransactionmanagement.repo;

import com.example.springboottransactionmanagement.entity.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderInfo, Integer> {
}
