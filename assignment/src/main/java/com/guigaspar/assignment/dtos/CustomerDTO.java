package com.guigaspar.assignment.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
public class CustomerDTO {

	@JsonInclude(JsonInclude.Include.NON_DEFAULT)
	private Long id;
	
	private String name;
	private Double creditLimit;
	private String risc;
	private Double interestRate;
	
}