package com.guigaspar.assignment.mapper;

import org.springframework.stereotype.Component;

import com.guigaspar.assignment.domains.Customer;
import com.guigaspar.assignment.dtos.CustomerDTO;

@Component
public class CustomerMapper {
	
	public static Customer toEntity(CustomerDTO customerDto) {
		Customer customer = new Customer();
		customer.setName(customerDto.getName());
		customer.setId(customerDto.getId());
		customer.setCreditLimit(customerDto.getCreditLimit());
		customer.setInterestRate(customerDto.getInterestRate());
		customer.setRisc(customerDto.getRisc());
		return customer;
	}

	public static CustomerDTO toDTO(Customer customer) {
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setName(customer.getName());
		customerDTO.setId(customer.getId());
		customerDTO.setCreditLimit(customer.getCreditLimit());
		customerDTO.setInterestRate(customer.getInterestRate());
		customerDTO.setRisc(customer.getRisc());
		return customerDTO;
	}
}