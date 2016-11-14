var app = angular.module('myApp', ['ngResource']);

app.controller('PersonController', ['$scope', '$resource',function($scope,$resource) {
    
    function fetchAllPersons(){
        $scope.persons = $resource('http://localhost:8080/person'
        ).query(function(data){return data;});
    };
    fetchAllPersons();
    
    $scope.refresh = function(){
    	fetchAllPersons();
    };
    
    $scope.create = function(){
    	User = $resource(
    		    "http://localhost:8080/create",
    		    {},
    		    {save: {method:'PUT',isArray:false}}
    	);
    	
    	var user = {};
		
		user.id = $scope.personForm.id;
		user.name = $scope.personForm.name;
		user.phoneNo = $scope.personForm.mobile;
		user.password = $scope.personForm.password;
		user.confirmPassword = "";
		user.email = $scope.personForm.email;
		
		$scope.Message = User.save(user);
				
		$scope.personForm.id = "";
		$scope.personForm.name="";
		$scope.personForm.mobile="";
		$scope.personForm.password="";
		$scope.personForm.email="";
    };
    
    $scope.deleteRec = function(){
    	User = $resource(
    		    "http://localhost:8080/delete/:id",
    		    {},
    		    {save: {method:'DELETE', params: {id: '@id'}}}
    	);
    	
			
		User.delete({id: $scope.personForm.id}).then(function successCallback(response) {
			$scope.Message = response;
		}, function errorCallback(response) {
		    
		});
				
		$scope.personForm.id = "";
		$scope.personForm.name="";
		$scope.personForm.mobile="";
		$scope.personForm.password="";
		$scope.personForm.email="";
    };
    
    
    $scope.update = function(){
    		
    	User = $resource(
    		    "http://localhost:8080/update/:id",
    		    {},
    		    {save: {method:'PUT', params: {id: '@id'}}}
    	);
    	
		var user = {};
		
		user.id = $scope.personForm.id;
		user.name = $scope.personForm.name;
		user.phoneNo = $scope.personForm.mobile;
		user.password = $scope.personForm.password;
		user.confirmPassword = "";
		user.email = $scope.personForm.email;
		
		$scope.Message = User.save({id: $scope.personForm.id}, user);
				
		$scope.personForm.id = "";
		$scope.personForm.name="";
		$scope.personForm.mobile="";
		$scope.personForm.password="";
		$scope.personForm.email="";
    };
    
}]);