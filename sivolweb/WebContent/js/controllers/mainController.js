/**
 * Controlador del main frame principal
 */

app.controller("mainController", function($scope, dataService) {

	$scope.usuario = dataService.dataUser;
	/**
	 * Metodo que inicializa variables de sesion
	 */
	
	
	$scope.initMain = function() {
		
//		$.get("../rest/login/load", function(respuesta) {
//				dataService.dataUser.username = respuesta.usuario;	
//				$scope.usuario = dataService.dataUser;
		
				console.log("SSInicializando. . . . " + $scope.usuario.username);
//		}, "json");	

	}
	
	$scope.getUsuario = function(){
		console.log("user ..." + dataService.dataUser.username);
		return dataService.dataUser.username;
	}
	

	/**
	 * metodo de cierre de sesion
	 */
	$scope.logOut = function() {

		$.get("../rest/logout", function(respuesta) {
			if (respuesta.estadoLogout == true) {
				console.log('Closing session .. ok');
				window.location.href = "../";
			}
		}, "json");
	}
});