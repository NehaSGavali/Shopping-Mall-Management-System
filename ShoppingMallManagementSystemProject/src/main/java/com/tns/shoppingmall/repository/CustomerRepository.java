package com.tns.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.shoppingmall.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{



}
