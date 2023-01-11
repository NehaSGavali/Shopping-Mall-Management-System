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

import com.tns.shoppingmall.entity.Employee;
import com.tns.shoppingmall.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService eService;
	
	//Create Operation 
			@PostMapping("/Employee")
			public ResponseEntity<Employee> add(@RequestBody Employee admin) {
				Employee savedadmin = eService.addEmployee(admin);
				return new ResponseEntity<Employee>(savedadmin,HttpStatus.CREATED);
				
			}
			
			//Retrieve operations of retrieving all Employee
			@GetMapping("/Employee")  
			public List<Employee> list(){
				 return eService.getAllEmployee();
				}
			
			//Retrieving operation retrieving Employee by id
			
			@GetMapping("/Employee/{id}")
			public ResponseEntity<Employee> get(@PathVariable Integer id){
				try {
					Employee e1 = eService.searchEmployeeById(id);
					return new ResponseEntity<Employee>(e1,HttpStatus.OK);
				}
				catch(NoSuchElementException e){
					return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);

				}
			}
			
			//Update operation
			@PutMapping("/Employee/{id}")
			public ResponseEntity<?> update (@RequestBody Employee emp,@PathVariable Integer id){
				
				try {
					Employee exist = eService.searchEmployeeById(id);
					eService.addEmployee(emp);
					return new ResponseEntity<>(HttpStatus.OK);

					
				}
				catch(NoSuchElementException e) {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND);

				}
			}
			
			//Delete Operation
			@DeleteMapping("/Employee/{id}")
			public void delete(@PathVariable Integer id) {
				eService.deleteEmployee(id);
			}
			
}
/*package com.tns.shoppingmall.controller;

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
import com.tns.shoppingmall.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService cService;
	
	

	//Create Operation 
		@PostMapping("/Customers")
		public ResponseEntity<Customer> add(@RequestBody Customer admin) {
			Customer savedadmin = cService.addCustomer(admin);
			return new ResponseEntity<Customer>(savedadmin,HttpStatus.CREATED);
			
		}
		
		

//Retrieve operations of retrieving all Customers
		@GetMapping("/Customers")  
		public List<Customer> list(){
			 return cService.getAllCustomers();
			}
				
		
	
		//Retrieving operation retrieving Customers by id
		
		@GetMapping("/Customers/{id}")
		public ResponseEntity<Customer> get(@PathVariable Integer id){
			try {
				Customer c1 = cService.searchCustomerById(id);
				return new ResponseEntity<Customer>(c1,HttpStatus.OK);
			}
			catch(NoSuchElementException e){
				return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);

			}
		}
		
			
//	//Update operation
		@PutMapping("/Customers/{id}")
		public ResponseEntity<?> update (@RequestBody Customer cust,@PathVariable Integer id){
			
			try {
				Customer exist = cService.searchCustomerById(id);
				cService.addCustomer(cust);
				return new ResponseEntity<>(HttpStatus.OK);

				
			}
			catch(NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);

			}
		}
		
		
//		//Delete Operation
		@DeleteMapping("/Customers/{id}")
		public void delete(@PathVariable Integer id) {
			cService.deleteCustomer(id);
		}
}
*/
