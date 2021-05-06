'use strict'

angular.module('demo.services', []).factory('CakeService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.getAllCakes = function() {
				return $http.get(CONSTANTS.getAllCakes);
			}
			service.saveCake = function(cakeDto) {
				return $http.post(CONSTANTS.saveCake, cakeDto);
			}
			return service;
		} ]);