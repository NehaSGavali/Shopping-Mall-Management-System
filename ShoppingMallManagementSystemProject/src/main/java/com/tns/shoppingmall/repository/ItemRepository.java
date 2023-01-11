package com.tns.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.shoppingmall.entity.Item;


public interface ItemRepository extends JpaRepository<Item,Long> {
}
