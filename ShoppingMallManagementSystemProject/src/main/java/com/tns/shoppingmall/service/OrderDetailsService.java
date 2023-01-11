package com.tns.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.shoppingmall.entity.OrderDetails;
import com.tns.shoppingmall.repository.OrderDetailsRepository;

@Service
public class OrderDetailsService {

	@Autowired
	private OrderDetailsRepository odrepo;
	
	//create new admin
		public OrderDetails addOrderDetails(OrderDetails od) {
			OrderDetails savedadmin = odrepo.save(od);
			return savedadmin;
		}
		
		
		//Retrieving all admins
			public List<OrderDetails> getAllOrderDetails(){
			return odrepo.findAll();
				
			}
			//retrieving admin by id
			public OrderDetails searchOrderDetailsById(Integer odId) {
				return odrepo.findById(odId).get();
			}
			//deleting admin from database
			public void deleteOrderDetails(Integer odId) {
				odrepo.deleteById(odId);
			}
}
