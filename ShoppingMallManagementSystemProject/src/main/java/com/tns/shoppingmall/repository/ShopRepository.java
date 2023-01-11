package com.tns.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.shoppingmall.entity.Shop;

public interface ShopRepository  extends JpaRepository<Shop, Integer> 
{

}