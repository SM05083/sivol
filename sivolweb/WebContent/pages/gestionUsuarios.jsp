<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="sivolweb">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Sivol Web</title>

<!-- Bootstrap Core CSS -->
<link href="../css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="../css/sb-admin.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="../css/plugins/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="../font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<script type="text/javascript" charset="utf-8"
	src="../js/angular/angular.min.js"></script>
<script type="text/javascript" charset="utf-8"
	src="../js/controllers/loginController.js"></script>
<script type="text/javascript" charset="utf-8"
	src="../js/controllers/gestionUsuarioController.js"></script>
<script type="text/javascript" charset="utf-8"
	src="../js/angular/angular-resource.min.js"></script>
</head>

<body ng-app="sivolweb" ng-controller="gestionUsuarioController">


	<div id="page-wrapper" ng-init="initUsuario()">

		<div class="container-fluid">

			<!-- Page Heading -->
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">
						Gestion de Usuarios <small>Usted podra crear, actualizar o
							eliminar usuarios</small>
					</h1>
					<ol class="breadcrumb">
						<li class="active"><i class="fa fa-dashboard"></i> Inicio</li>
						<li class="active"><i class="fa fa-fw fa-user"></i> Gestion
							de Usuarios</li>
					</ol>
				</div>
			</div>
			<!-- /.row -->

			<div class="row">
				<div class="col-lg-12">

					<button type="button" class="btn btn-sm btn-primary"
						data-dismiss="modal">
						<span class="glyphicon glyphicon-user"></span> Crear Usuario
					</button>

				</div>
				<br />
				<div class="col-lg-12">
					<div class="table-responsive">
						<table class="table table-bordered table-hover table-striped">
							<thead>
								<tr>
									<th>Usuario</th>
									<th>Estado</th>
									<th>Fecha de Creacion</th>
									<th>..</th>
								</tr>
							</thead>
							<tbody>
								<tr ng-repeat="usuario in listaUsuarios" >
									<td>{{usuario.usuUsuario}}</td>
									<td >{{usuario.usuEstado}}</td>
									<td>{{usuario.usuFechaCreacion}}</td>
									<td><button type="button" class="btn btn-xs btn-info"
											data-dismiss="modal">
											<span class="glyphicon glyphicon-pencil"></span>
										</button>
										<button type="button" class="btn btn-xs btn-danger"
											data-dismiss="modal">
											<span class="glyphicon glyphicon-trash"></span>
										</button></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<br />
			</div>
			<!-- /.row -->


			<!-- /.row -->


			<!-- /.row -->

		</div>
		<!-- /.container-fluid -->

	</div>
	<!-- /#page-wrapper -->



	<!-- jQuery -->
	<script src="../js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="../js/bootstrap.min.js"></script>

	<!-- Morris Charts JavaScript -->
	<script src="../js/plugins/morris/raphael.min.js"></script>
	<script src="../js/plugins/morris/morris.min.js"></script>
	<script src="../js/plugins/morris/morris-data.js"></script>

</body>

</html>
