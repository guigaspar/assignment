'use strict'

angular.module('gui.services', []).factory('CustomerService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.getCustomerById = function(customerId) {
				var url = "/customers";
				return $http.get(url);
			}
			service.getAllCustomers = function() {
				return $http.get("/customers");
			}
			service.saveCustomer = function(customerDto) {
				return $http.post("/customers", customerDto);
			}
			return service;
		} ]);