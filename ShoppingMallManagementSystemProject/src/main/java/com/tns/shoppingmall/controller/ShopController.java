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
import com.tns.shoppingmall.entity.Shop;
import com.tns.shoppingmall.service.ShopService;

@RestController
@RequestMapping("/shop")
public class ShopController {
	@Autowired
	private ShopService sService;



	//Create Operation 
		@PostMapping("/Shop")
		public ResponseEntity<Shop> add(@RequestBody Shop admin) {
			Shop savedadmin = sService.addShop(admin);
			return new ResponseEntity<Shop>(savedadmin,HttpStatus.CREATED);
			
		}
		
		

//Retrieve operations of retrieving all Customers
		@GetMapping("/Shop")  
		public List<Shop> list(){
			 return sService.getAllShop();
			}
				
		
	
		//Retrieving operation retrieving Customers by id
		
		@GetMapping("/Shop/{id}")
		public ResponseEntity<Shop> get(@PathVariable Integer id){
			try {
				Shop c1 = sService.searchShopById(id);
				return new ResponseEntity<Shop>(c1,HttpStatus.OK);
			}
			catch(NoSuchElementException e){
				return new ResponseEntity<Shop>(HttpStatus.NOT_FOUND);

			}
		}
		
			
//	//Update operation
		@PutMapping("/Customers/{id}")
		public ResponseEntity<?> update (@RequestBody Shop s,@PathVariable Integer id){
			
			try {
				Shop exist = sService.searchShopById(id);
				sService.addShop(s);
				return new ResponseEntity<>(HttpStatus.OK);

				
			}
			catch(NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);

			}
		}
		
		
//		//Delete Operation
		@DeleteMapping("/Customers/{id}")
		public void delete(@PathVariable Integer id) {
			sService.deleteShop(id);
		}
}