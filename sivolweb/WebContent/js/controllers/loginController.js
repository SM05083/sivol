
//--- * Controlador para login * ---
var app = angular.module("sivolweb", []);

app.service("dataService", function() {
	//--- * Variable publica * ---
	var _dataUser = {
		username: ""
	}
	
	return {
		dataUser: _dataUser
	}

});

app.controller("loginController", function($scope, dataService) {
	$scope.user = {
		      username: "",
		      password: ""
	}
	
	$scope.errMjs = "";
	
    $scope.loginFunction = function() {
    	var userObj = $scope.user;
    	var u = userObj.username;
    	var p = userObj.password;
    	$.get("rest/login/" + u + "/" + p, function(respuesta){    		
    		if(respuesta.estadoLogin == true){
    			console.log('true');
    			
    			window.location.href = "pages/main.jsp";
    		} else{
    			$scope.errMjs = respuesta.errMjs;
    			console.log("errMsj: " + $scope.errMjs);
    			$("#msjLogin").alert('open');
    		}    		
    	}, "json");
    	
    }
	
	$scope.init = function(){
		$("#msjLogin").alert('close');
	}
	
	$scope.init();
});