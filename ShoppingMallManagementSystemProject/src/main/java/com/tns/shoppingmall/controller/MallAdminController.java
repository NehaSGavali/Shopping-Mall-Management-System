package com.tns.shoppingmall.controller;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tns.shoppingmall.entity.Customer;
import com.tns.shoppingmall.entity.Item;
import com.tns.shoppingmall.entity.MallAdmin;
import com.tns.shoppingmall.service.MallAdminService;

@RestController
@RequestMapping("/malladmin")
public class MallAdminController 
{
 @Autowired
private MallAdminService maService;

//Create Operation 
		@PostMapping("/MallAdmin")
		public ResponseEntity<MallAdmin> add(@RequestBody MallAdmin admin) {
			MallAdmin savedadmin = maService.addMallAdmin(admin);
			return new ResponseEntity<MallAdmin>(savedadmin,HttpStatus.CREATED);
			
		}

		//Retrieve operations of retrieving all Customers
				@GetMapping("/MallAdmin")  
				public List<MallAdmin> list(){
					 return maService.getAllMallAdmin();
					}
						
				
			
				//Retrieving operation retrieving Customers by id
				
				@GetMapping("/MallAdmin/{id}")
				public ResponseEntity<MallAdmin> get(@PathVariable Long id){
					try {
						MallAdmin c1 = maService.searchMallAdminById(id);
						return new ResponseEntity<MallAdmin>(c1,HttpStatus.OK);
					}
					catch(NoSuchElementException e){
						return new ResponseEntity<MallAdmin>(HttpStatus.NOT_FOUND);

					}
				}
				
					
//			//Update operation
				@PutMapping("/MallAdmin/{id}")
				public ResponseEntity<?> update (@RequestBody MallAdmin ma,@PathVariable Long id){
					
					try {
						MallAdmin exist = maService.searchMallAdminById(id);
						maService.addMallAdmin(ma);
						return new ResponseEntity<>(HttpStatus.OK);

						
					}
					catch(NoSuchElementException e) {
						return new ResponseEntity<>(HttpStatus.NOT_FOUND);

					}
				}
				
				
//				//Delete Operation
				@DeleteMapping("/MallAdmin/{id}")
				public void delete(@PathVariable long id) {
					maService.deleteMallAdmin(id);
				}
}	
	

