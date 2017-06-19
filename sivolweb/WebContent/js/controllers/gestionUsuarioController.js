/**
 * Controlador para la gestion de usuarios
 */
app.controller("gestionUsuarioController", function($scope, $http, dataService) {
	
	$scope.usuario = dataService.dataUser;
	$scope.titleMsg = "";
	$scope.msg="";
	$scope.listaUsuarios;
	
	
	/**
	 * Inicializando
	 */
	$scope.initUsuario = function(){
		console.log("Inicializando Gestion de Usuarios..");
		
		$http.get('../rest/usuarios/load').then(function(response) {
			
			$scope.listaUsuarios = response.data.listaUsuarios;
        });
	}
	
	
});