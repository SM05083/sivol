/**
 * Controlador para la gestion de usuarios
 */
app.controller("gestionUsuarioController", function($scope, $http, dataService) {
	
	$scope.usuario = dataService.dataUser;
	
	/**
	 * Inicializando
	 */
	$scope.initUsuario = function(){
		Console.log("Inicializando Gestion de Usuarios..");
	}
	
	
}