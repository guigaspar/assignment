'use strict'

var module = angular.module('gui.controllers', []);
module.controller("CustomerController", [ "$scope", "CustomerService",
		function($scope, CustomerService) {
			
			
			$scope.customerDto = {
				id : null,
				name : null,
				risc : null,
				creditLimit : null
			};

			$scope.saveCustomer = function() {
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
						
					};
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
		} ]);