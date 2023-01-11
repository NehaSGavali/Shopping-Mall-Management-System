package com.tns.shoppingmall.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.shoppingmall.entity.Customer;
import com.tns.shoppingmall.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {

@Autowired
private CustomerRepository crepo;

//create new admin
	public Customer addCustomer(Customer emp) {
		Customer savedadmin = crepo.save(emp);
		return savedadmin;
	}
	
	
	//Retrieving all admins
		public List<Customer> getAllCustomers(){
		return crepo.findAll();
			
		}
		
	
	//retrieving admin by id
	public Customer searchCustomerById(Integer id) {
		return crepo.findById(id).get();
	}
	
	
	
	
	//deleting admin from database
	public void deleteCustomer(Integer id) {
		crepo.deleteById(id);
	}
	
}
