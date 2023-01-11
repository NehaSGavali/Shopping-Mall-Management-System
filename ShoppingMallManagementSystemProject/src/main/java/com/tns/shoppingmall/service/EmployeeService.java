package com.tns.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.shoppingmall.entity.Employee;
import com.tns.shoppingmall.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository erepo;
	
	//create new admin
		public Employee addEmployee(Employee emp) {
			Employee savedadmin = erepo.save(emp);
			return savedadmin;
		}
		
		//Retrieving all admins
		public List<Employee> getAllEmployee(){
			return erepo.findAll();
					
		}
		//retrieving admin by id
		public Employee searchEmployeeById(Integer empId) {
			return erepo.findById(empId).get();
		}
		//deleting admin from database
		public void deleteEmployee(Integer empId) {
			erepo.deleteById(empId);
		}
}
