package com.tns.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.shoppingmall.entity.Mall;

public interface MallRepository extends JpaRepository<Mall,Long> {
}