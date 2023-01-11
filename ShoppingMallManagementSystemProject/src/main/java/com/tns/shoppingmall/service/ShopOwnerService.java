package com.tns.shoppingmall.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.shoppingmall.entity.Customer;
import com.tns.shoppingmall.entity.ShopOwner;
import com.tns.shoppingmall.repository.ShopOwnerRepository;


@Service
@Transactional
public class ShopOwnerService {

@Autowired	
private ShopOwnerRepository sorepo;

//create new admin
	public ShopOwner addShopOwner(ShopOwner emp) {
		ShopOwner savedadmin = sorepo.save(emp);
		return savedadmin;
	}
	
	
	//Retrieving all admins
		public List<ShopOwner> getAllShopOwner(){
		return sorepo.findAll();
			
		}
		
	
	//retrieving admin by id
	public ShopOwner searchShopOwnerById(Long id) {
		return sorepo.findById(id).get();
	}
	
	
	
	
	//deleting admin from database
	public void deleteShopOwner(Long id) {
		sorepo.deleteById(id);
	}
}