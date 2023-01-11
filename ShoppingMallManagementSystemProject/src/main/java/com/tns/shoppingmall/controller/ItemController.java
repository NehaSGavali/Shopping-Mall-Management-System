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
import com.tns.shoppingmall.service.ItemService;

@RestController
@RequestMapping("/Item")
public class ItemController 
{
 @Autowired
private ItemService iService;
 
 
//Create Operation 
		@PostMapping("/Item")
		public ResponseEntity<Item> add(@RequestBody Item admin) {
			Item savedadmin = iService.addItem(admin);
			return new ResponseEntity<Item>(savedadmin,HttpStatus.CREATED);
			
		}

		//Retrieve operations of retrieving all Customers
				@GetMapping("/Item")  
				public List<Item> list(){
					 return iService.getAllItem();
					}
							
				//Retrieving operation retrieving Customers by id
				
				@GetMapping("/Item/{id}")
				public ResponseEntity<Item> get(@PathVariable Long id){
					try {
						Item c1 = iService.searchItemById(id);
						return new ResponseEntity<Item>(c1,HttpStatus.OK);
					}
					catch(NoSuchElementException e){
						return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);

					}
				}
				
					
//			//Update operation
				@PutMapping("/Item/{id}")
				public ResponseEntity<?> update (@RequestBody Item i,@PathVariable Long id){
					
					try {
						Item exist = iService.searchItemById(id);
						iService.addItem(i);
						return new ResponseEntity<>(HttpStatus.OK);

						
					}
					catch(NoSuchElementException e) {
						return new ResponseEntity<>(HttpStatus.NOT_FOUND);

					}
				}
				
				
//				//Delete Operation
				@DeleteMapping("/Item/{id}")
				public void delete(@PathVariable long id) {
					iService.deleteItem(id);
				}
}