package com.tns.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.shoppingmall.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
