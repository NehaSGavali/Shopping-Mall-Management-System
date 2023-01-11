package com.tns.shoppingmall.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tns.shoppingmall.entity.Customer;
import com.tns.shoppingmall.entity.ShopOwner;
import com.tns.shoppingmall.service.ShopOwnerService;

@RestController
@RequestMapping("/shopowner")
public class ShopOwnerController {

	private static final HttpStatus ShopOwnersponseEntity = null;
	@Autowired
	private ShopOwnerService soService;
	
	


	//Create Operation 
		@PostMapping("/ShopOwner")
		public ResponseEntity<ShopOwner> add(@RequestBody ShopOwner admin) {
			ShopOwner savedadmin = soService.addShopOwner(admin);
			return new ResponseEntity<ShopOwner>(savedadmin,HttpStatus.CREATED);
			
		}
		
		

//Retrieve operations of retrieving all Customers
		@GetMapping("/ShopOwner")  
		public List<ShopOwner> list(){
			 return soService.getAllShopOwner();
			}
				
		
	
		//Retrieving operation retrieving Customers by id
		
		@GetMapping("/ShopOwner/{id}")
		public ResponseEntity<ShopOwner> get(@PathVariable Long id){
			try {
				ShopOwner c1 = soService.searchShopOwnerById(id);
				return new ResponseEntity<ShopOwner>(c1,HttpStatus.OK);
			}
			catch(NoSuchElementException e){
				return new ResponseEntity<ShopOwner>(HttpStatus.NOT_FOUND);

			}
		}
		
			
//	//Update operation
		@PutMapping("/Customers/{id}")
		public ResponseEntity<?> update (@RequestBody ShopOwner so,@PathVariable Long id){
			
			try {
				ShopOwner exist = soService.searchShopOwnerById(id);
				soService.addShopOwner(so);
				return new ResponseEntity<>(HttpStatus.OK);

				
			}
			catch(NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);

			}
		}
		
		
//		//Delete Operation
		@DeleteMapping("/ShopOwner/{id}")
		public void delete(@PathVariable Long id) {
			soService.deleteShopOwner(id);
		}
}
