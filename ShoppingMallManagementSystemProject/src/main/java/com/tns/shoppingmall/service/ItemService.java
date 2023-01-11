package com.tns.shoppingmall.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.shoppingmall.entity.Customer;
import com.tns.shoppingmall.entity.Item;
import com.tns.shoppingmall.repository.ItemRepository;

@Service
@Transactional
	public class ItemService 
	{
	 @Autowired
	 private ItemRepository irepo;
	 

	//create new admin
		public Item addItem(Item emp) {
			Item savedadmin = irepo.save(emp);
			return savedadmin;
		}
		
		
		//Retrieving all admins
			public List<Item> getAllItem(){
			return irepo.findAll();
				
			}
			
		
		//retrieving admin by id
		public Item searchItemById(Long id) {
			return irepo.findById(id).get();
		}
		
		
		
		
		//deleting admin from database
		public void deleteItem(Long id) {
			irepo.deleteById(id);
		}
	}
