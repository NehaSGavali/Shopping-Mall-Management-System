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

import com.tns.shoppingmall.entity.OrderDetails;
import com.tns.shoppingmall.service.OrderDetailsService;

@RestController
@RequestMapping("/orderdetails")
public class OrderDetailsController {
	
	@Autowired
	private OrderDetailsService odService;
	
	//Create Operation 
			@PostMapping("/OrderDetails")
			public ResponseEntity<OrderDetails> add(@RequestBody OrderDetails admin) {
				OrderDetails savedadmin = odService.addOrderDetails(admin);
				return new ResponseEntity<OrderDetails>(savedadmin,HttpStatus.CREATED);
				
	}
			//Retrieve operations of retrieving all Customers
			@GetMapping("/OrderDetails")  
			public List<OrderDetails> list(){
				 return odService.getAllOrderDetails();
	}
			//Retrieving operation retrieving Customers by id
			
			@GetMapping("/OrderDetails/{id}")
			public ResponseEntity<OrderDetails> get(@PathVariable Integer id){
				try {
					OrderDetails c1 = odService.searchOrderDetailsById(id);
					return new ResponseEntity<OrderDetails>(c1,HttpStatus.OK);
				}
				catch(NoSuchElementException e){
					return new ResponseEntity<OrderDetails>(HttpStatus.NOT_FOUND);

				}
	}		
			//Update operation
			@PutMapping("/OrderDetails/{id}")
			public ResponseEntity<?> update (@RequestBody OrderDetails od,@PathVariable Integer id){
				
				try {
					OrderDetails exist = odService.searchOrderDetailsById(id);
					odService.addOrderDetails(od);
					return new ResponseEntity<>(HttpStatus.OK);

					
				}
				catch(NoSuchElementException e) {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND);

				}
			}
			//Delete Operation
			@DeleteMapping("/OrderDetails/{id}")
			public void delete(@PathVariable Integer id) {
				odService.deleteOrderDetails(id);
			}
			
}
