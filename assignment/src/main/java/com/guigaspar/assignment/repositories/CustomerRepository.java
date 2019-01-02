package com.guigaspar.assignment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guigaspar.assignment.domains.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
}