package com.tns.shoppingmall.service;

import java.util.List;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.shoppingmall.entity.Customer;
import com.tns.shoppingmall.entity.User;
import com.tns.shoppingmall.repository.UserRepository;

@Service
@Transactional
	public class UserService 
	{
	 @Autowired
	 private UserRepository urepo;

	//create new admin
		public User addUser(User emp) {
			User savedadmin = urepo.save(emp);
			return savedadmin;
		}
		
		
		//Retrieving all admins
			public List<User> getAllUser(){
			return urepo.findAll();
				
			}
			
		
		//retrieving admin by id
		public User searchUserById(Integer id) {
			return urepo.findById(id).get();
		}
		
		
		
		
		//deleting admin from database
		public void deleteUser(Integer id) {
			urepo.deleteById(id);
		}
	}


