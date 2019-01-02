package com.guigaspar.assignment.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.guigaspar.assignment.domains.Customer;
import com.guigaspar.assignment.dtos.CustomerDTO;
import com.guigaspar.assignment.mapper.CustomerMapper;
import com.guigaspar.assignment.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	CustomerRepository customerRepository;
	CustomerMapper customerMapper;
	
	public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
		this.customerRepository = customerRepository;
		this.customerMapper = customerMapper;
	}
	
	@Override
	public CustomerDTO saveUser(CustomerDTO customerDto){
		calculateInterestRate(customerDto);
		Customer customer = customerRepository.save(CustomerMapper.toEntity(customerDto));
		customerRepository.flush();
		return CustomerMapper.toDTO(customer);
	}

	private void calculateInterestRate(CustomerDTO customerDto) {
		if(customerDto.getRisc().equalsIgnoreCase("A")) {
			customerDto.setInterestRate(0.0);
		}
		if(customerDto.getRisc().equalsIgnoreCase("B")) {
			customerDto.setInterestRate(0.1);
		}
		if(customerDto.getRisc().equalsIgnoreCase("C")) {
			customerDto.setInterestRate(0.2);
		}
	}

	@Override
	public List<CustomerDTO> getAllCustomers() {
		return customerRepository.findAll().stream().map(CustomerMapper::toDTO).collect(Collectors.toList());
	}

	@Override
	public CustomerDTO getCustomerByID(Long customerId) {
		return CustomerMapper.toDTO(customerRepository.getOne(customerId));
	}

}
