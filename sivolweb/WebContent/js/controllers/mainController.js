/**
 * Controlador del main frame principal
 */

app.controller("mainController", function($scope, $http, dataService) {

	$scope.usuario = dataService.dataUser;
	$scope.itemsMenu;
	/**
	 * Metodo que inicializa pantalla principal
	 */
	$scope.initMain = function() {
		$http.get('../rest/login/load').then(function(response) {
			dataService.dataUser.username = response.data.usuario;	
			$scope.usuario = dataService.dataUser;
			console.log("SSInicializando. . . . " + $scope.usuario.username);
			$scope.itemsMenu = response.data.opciones;
        });
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