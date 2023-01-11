package com.tns.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.shoppingmall.entity.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Integer>{

}
