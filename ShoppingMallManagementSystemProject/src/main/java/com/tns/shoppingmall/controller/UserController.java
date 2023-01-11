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
import com.tns.shoppingmall.entity.User;
import com.tns.shoppingmall.service.UserService;
@RestController
@RequestMapping("/user")
public class UserController 
{
 @Autowired
 private UserService Uservice;
 


	//Create Operation 
		@PostMapping("/User")
		public ResponseEntity<User> add(@RequestBody User admin) {
			User savedadmin = Uservice.addUser(admin);
			return new ResponseEntity<User>(savedadmin,HttpStatus.CREATED);
			
		}
		
		

//Retrieve operations of retrieving all Customers
		@GetMapping("/User")  
		public List<User> list(){
			 return Uservice.getAllUser();
			}
				
		
	
		//Retrieving operation retrieving Customers by id
		
		@GetMapping("/User/{id}")
		public ResponseEntity<User> get(@PathVariable Integer id){
			try {
				User c1 = Uservice.searchUserById(id);
				return new ResponseEntity<User>(c1,HttpStatus.OK);
			}
			catch(NoSuchElementException e){
				return new ResponseEntity<User>(HttpStatus.NOT_FOUND);

			}
		}
		
			
//	//Update operation
		@PutMapping("/User/{id}")
		public ResponseEntity<?> update (@RequestBody User u,@PathVariable Integer id){
			
			try {
				User exist = Uservice.searchUserById(id);
				Uservice.addUser(u);
				return new ResponseEntity<>(HttpStatus.OK);

				
			}
			catch(NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);

			}
		}
		
		
//		//Delete Operation
		@DeleteMapping("/Customers/{id}")
		public void delete(@PathVariable Integer id) {
			Uservice.deleteUser(id);
		}

}