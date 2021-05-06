'use strict'

var module = angular.module('demo.controllers', []);
module.controller("CakeController", [ "$scope", "CakeService",
		function($scope, CakeService) {

			$scope.cakeDto = {
				cakeId : null,
				title  : null,
				description : null,
				image : null
			};
			
			
			$scope.saveCake = function() {
			   
				CakeService.saveCake($scope.cakeDto).then(function() {
					console.log("works");
					CakeService.getAllCakes().then(function(value) {
						$scope.allCakes= value.data;
					}, function(reason) {
						console.log("error logged!!!");
					}, function(value) {
						console.log("no callback");
					});

					
					$scope.cakeDto = {
						cakeId : null,
						title : null,
						description : null,
						image : null
					};
				}, function(reason) {
					console.log("error logged!!!");
				}, function(value) {
					console.log("no callback");
				});
			}
		} ]);