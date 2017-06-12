<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="sivolweb">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<title>SIVOL Web</title>
<link href="css/login.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<link rel="shortcut icon" type="image/png" href="images/favicon.ico" />
<!-- Carga de controladores  -->
<script type="text/javascript" charset="utf-8"
	src="js/angular/angular.min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/app.js"></script>
<script type="text/javascript" charset="utf-8"
	src="js/controllers/loginController.js"></script>
<script type="text/javascript" charset="utf-8"
	src="js/services/services.js"></script>
<script type="text/javascript" charset="utf-8"
	src="js/angular/angular-resource.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-default navbar-inverse" role="navigation">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Login SIVOL - WEB 1.0</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Bienvenido <span class="caret"></span></a>
					<ul class="dropdown-menu" role="menu">
						<li><a href="#">Acerca de Nosotros</a></li>

						<li class="divider"></li>
						<li><a href="#">Otra cosa que poner</a></li>

					</ul></li>
			</ul>

			<ul class="nav navbar-nav navbar-right">

				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><b>Login</b> <span class="caret"></span></a>
					<ul id="login-dp" class="dropdown-menu">
						<li>
							<div class="row">
								<div class="col-md-12">
									Login
									<div ng-app="sivolweb" ng-controller='loginController'
										class="form" role="form" accept-charset="UTF-8" id="login-nav">
										<div id="msjLogin" class="alert alert-danger alert-dismissable fade in">
											<a href="#" class="close" data-dismiss="alert" 
												aria-label="close">&times;</a>
												 <strong>Inicio de Sesion!</strong>
												 {{msjErr}}
												 												
										</div>
										<div class="form-group">
											<label class="sr-only" for="exampleInputEmail2">Usuario{{user.username}}</label>
											<input type="text" class="form-control" placeholder="Usuario"
												ng-model="user.username" required>
										</div>
										<div class="form-group">
											<label class="sr-only" for="exampleInputPassword2">Password{{user.password}}</label>
											<input type="password" class="form-control"
												placeholder="Contraseña" ng-model="user.password" required>
											<!--                                              <div class="help-block text-right"><a href="">Olvido su contraseña?</a></div> -->
										</div>
										<div class="form-group">
											<button type="button" ng-click='loginFunction()'
												class="btn btn-primary btn-block">Iniciar Sesion</button>
										</div>

									</div>
								</div>
								<!--  <div class="bottom text-center">
								<a href="#"><b>Registrarse</b></a>
							</div>
							
							-->
							</div>
						</li>
					</ul></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>


</body>
</html>