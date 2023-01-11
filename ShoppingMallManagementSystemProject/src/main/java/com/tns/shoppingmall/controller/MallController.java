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
import com.tns.shoppingmall.entity.Mall;
import com.tns.shoppingmall.service.MallService;

@RestController
@RequestMapping("/mall")
public class MallController 
{
 @Autowired
private MallService mService;


	//Create Operation 
		@PostMapping("/Mall")
		public ResponseEntity<Mall> add(@RequestBody Mall admin) {
			Mall savedadmin = mService.addMall(admin);
			return new ResponseEntity<Mall>(savedadmin,HttpStatus.CREATED);
			
		}
		
		

//Retrieve operations of retrieving all Customers
		@GetMapping("/Mall")  
		public List<Mall> list(){
			 return mService.getAllMall();
			}
				
		
	
		//Retrieving operation retrieving Customers by id
		
		@GetMapping("/Mall/{id}")
		public ResponseEntity<Mall> get(@PathVariable Long id){
			try {
				Mall c1 = mService.searchMallById(id);
				return new ResponseEntity<Mall>(c1,HttpStatus.OK);
			}
			catch(NoSuchElementException e){
				return new ResponseEntity<Mall>(HttpStatus.NOT_FOUND);

			}
		}
		
			
//	//Update operation
		@PutMapping("/Mall/{id}")
		public ResponseEntity<?> update (@RequestBody Mall m,@PathVariable Long id){
			
			try {
				Mall exist = mService.searchMallById(id);
				mService.addMall(m);
				return new ResponseEntity<>(HttpStatus.OK);

				
			}
			catch(NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);

			}
		}
		
		
//		//Delete Operation
		@DeleteMapping("/Customers/{id}")
		public void delete(@PathVariable Long id) {
			mService.deleteMall(id);
		}

}