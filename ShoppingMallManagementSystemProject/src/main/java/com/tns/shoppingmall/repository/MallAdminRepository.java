package com.tns.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.shoppingmall.entity.MallAdmin;

public interface MallAdminRepository extends JpaRepository<MallAdmin,Long> {
}