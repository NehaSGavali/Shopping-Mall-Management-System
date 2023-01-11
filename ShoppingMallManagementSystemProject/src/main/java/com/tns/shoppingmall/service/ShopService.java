package com.tns.shoppingmall.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.shoppingmall.entity.Customer;
import com.tns.shoppingmall.entity.Shop;
import com.tns.shoppingmall.repository.ShopRepository;

@Service
@Transactional
public class ShopService {
	@Autowired
	private ShopRepository srepo;


	//create new admin
		public Shop addShop(Shop emp) {
			Shop savedadmin = srepo.save(emp);
			return savedadmin;
		}
		
		
		//Retrieving all admins
			public List<Shop> getAllShop(){
			return srepo.findAll();
				
			}
			
		
		//retrieving admin by id
		public Shop searchShopById(Integer id) {
			return srepo.findById(id).get();
		}
		
		
		
		
		//deleting admin from database
		public void deleteShop(Integer id) {
			srepo.deleteById(id);
		}
		
}