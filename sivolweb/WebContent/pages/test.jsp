<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="sivolweb">

  	<head>

<script type="text/javascript" charset="utf-8" src="js/angular/angular.min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/app.js"></script>
<script type="text/javascript" charset="utf-8" src="js/controllers/loginController.js"></script>
<script type="text/javascript" charset="utf-8" src="js/services/services.js"></script>
<script type="text/javascript" charset="utf-8" src="js/angular/angular-resource.min.js"></script>
 	</head>

  	<body>

 		<table id="breakingBadChar" ng-controller="BreakinBadCharCtrl"> <!-- ng-controller define qué controlador se encargará de manejar la tabla-->

  			<thead>

  				<tr>

  					<td>Nombre</td>

  					<td>Apellido</td>

  				</tr>

  			</thead>

  			<tbody>

  				<tr ng-repeat="character in characters"> <!-- ng-repeat function como un "for" iterando la variable characters hidratada en el controlador -->

  					<!-- Muestra los datos del registro -->

  					<td>{{character.name}}</td> 

  					<td>{{character.surname}}</td>

  				</tr>

  			</tbody>

 		</table>

	</body>

</html>

