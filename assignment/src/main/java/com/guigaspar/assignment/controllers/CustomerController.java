package com.guigaspar.assignment.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guigaspar.assignment.dtos.CustomerDTO;
import com.guigaspar.assignment.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping
	public ResponseEntity<CustomerDTO> saveCustomer(@RequestBody CustomerDTO customerDTO){
		
		HttpStatus status;
		try {
			customerService.saveUser(customerDTO);
			status = HttpStatus.OK;
		}catch(Exception e) {
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<CustomerDTO>(customerDTO, status);
	}
	
	@GetMapping
	public ResponseEntity<List<CustomerDTO>> getAllCustomers(){
		HttpStatus status;
		List<CustomerDTO> customersList = new ArrayList<CustomerDTO>();
		try {
			customersList = customerService.getAllCustomers();
			status = HttpStatus.OK;
		}catch(Exception e) {
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<List<CustomerDTO>>(customersList, status);
	}
	
}