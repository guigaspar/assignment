'use strict'

angular.module('gui.services', []).factory('CustomerService',
		[ "$http", function($http) {
			var service = {};
			var url = "/customers";
			service.getCustomerById = function(customerId) {
				return $http.get(url);
			}
			service.getAllCustomers = function() {
				return $http.get(url);
			}
			service.saveCustomer = function(customerDto) {
				return $http.post(url, customerDto);
			}
			return service;
		} ]);