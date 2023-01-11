package com.tns.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.shoppingmall.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}