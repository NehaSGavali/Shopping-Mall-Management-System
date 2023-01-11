package com.tns.shoppingmall.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tns.shoppingmall.entity.Customer;
import com.tns.shoppingmall.entity.MallAdmin;
import com.tns.shoppingmall.repository.MallAdminRepository;

@Service
@Transactional
	public class MallAdminService 
	{
	 @Autowired
	 private MallAdminRepository marepo;
	 
	//create new admin
		public MallAdmin addMallAdmin(MallAdmin emp) {
			MallAdmin savedadmin = marepo.save(emp);
			return savedadmin;
		}
		
		
		//Retrieving all admins
			public List<MallAdmin> getAllMallAdmin(){
			return marepo.findAll();
				
			}
			
		
		//retrieving admin by id
		public MallAdmin searchMallAdminById(Long id) {
			return marepo.findById(id).get();
		}
		
		
		
		
		//deleting admin from database
		public void deleteMallAdmin(Long id) {
			marepo.deleteById(id);
		}
		
	}


