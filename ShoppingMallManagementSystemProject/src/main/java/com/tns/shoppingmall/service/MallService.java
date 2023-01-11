package com.tns.shoppingmall.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.shoppingmall.entity.Customer;
import com.tns.shoppingmall.entity.Mall;
import com.tns.shoppingmall.repository.MallRepository;

@Service
@Transactional
	public class MallService 
	{
	private MallRepository mrepo;

	//create new admin
		public Mall addMall(Mall emp) {
			Mall savedadmin = mrepo.save(emp);
			return savedadmin;
		}
		
		
		//Retrieving all admins
			public List<Mall> getAllMall(){
			return mrepo.findAll();
				
			}
			
		
		//retrieving admin by id
		public Mall searchMallById(Long id) {
			return mrepo.findById(id).get();
		}
		
		
		
		
		//deleting admin from database
		public void deleteMall(Long id) {
			mrepo.deleteById(id);
		}
	}



