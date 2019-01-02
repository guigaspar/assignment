'use strict'

var module = angular.module('gui.controllers', ["ngTable"]);
module.controller("CustomerController", [ "$scope", "CustomerService", "NgTableParams", 
		function($scope, CustomerService, NgTableParams) {
			
			$scope.customerDto = {
				id : null,
				name : null,
				risc : null,
				creditLimit : null
			};

			$scope.saveCustomer = function() {
				
				$scope.customerDto.creditLimit = $('#currency').maskMoney('unmasked')[0];
				
				CustomerService.saveCustomer($scope.customerDto).then(function() {
					console.log("works");
					CustomerService.getAllCustomers().then(function(value) {
						$scope.allCustomers= value.data;
					}, function(reason) {
						console.log("error occured");
					}, function(value) {
						console.log("no callback");
					});

					$scope.customerDto = {
						id : null,
						name : null,
						risc : null,
						creditLimit : null
					};
					
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
			
			$scope.customersTable = new NgTableParams({}, { dataset: $scope.allCustomers });
			
		} ]);