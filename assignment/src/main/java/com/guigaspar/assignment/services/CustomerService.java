package com.guigaspar.assignment.services;

import java.util.List;

import com.guigaspar.assignment.dtos.CustomerDTO;

public interface CustomerService {
	
	public CustomerDTO saveUser(CustomerDTO customerDto);
	public CustomerDTO getCustomerByID(Long customerId);
	public List<CustomerDTO> getAllCustomers();
	
}