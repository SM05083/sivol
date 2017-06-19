<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="sivolweb">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Sivol Web</title>

	<link rel="shortcut icon" type="image/png" href="../images/favicon.ico" />
    <!-- Bootstrap Core CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="../css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <script>
  function resizeIframe(obj) {
    obj.style.height = (obj.contentWindow.document.body.scrollHeight + 20) + 'px';
  }
</script>

    <script type="text/javascript" charset="utf-8" src="../js/angular/angular.min.js"></script>
    <script type="text/javascript" charset="utf-8" src="../js/controllers/loginController.js"></script>
	<script type="text/javascript" charset="utf-8" src="../js/controllers/mainController.js"></script>
	<script type="text/javascript" charset="utf-8" src="../js/angular/angular-resource.min.js"></script>
</head>

<body ng-app="sivolweb" ng-controller="mainController" >

    <div id="wrapper" ng-init="initMain()">

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="main.html">SivolWeb</a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                
                
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"  ><i class="fa fa-user"></i>
<!--                     <div ng-bind-html="usuario"> -->
                    <c:out value="${sessionScope.usuario}" /> <b class="caret"></b>
                    
<!--                     </div> -->
                    
                    </a>
                    <ul class="dropdown-menu">
<!--                         <li> -->
<!--                             <a href="#"><i class="fa fa-fw fa-user"></i> Profile</a> -->
<!--                         </li> -->
<!--                         <li> -->
<!--                             <a href="#"><i class="fa fa-fw fa-envelope"></i> Inbox</a> -->
<!--                         </li> -->
<!--                         <li> -->
<!--                             <a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a> -->
<!--                         </li> -->
<!--                         <li class="divider"></li> -->
                        <li>
                            <a href="#" ng-click="logOut()"><i class="fa fa-fw fa-power-off"></i> Cerrar Sesion</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
<!--                     <li class="active"> -->
<!--                         <a href="index.html"><i class="fa fa-fw fa-dashboard"></i> Dashboard</a> -->
<!--                     </li> -->
                    
<!--                     <li> -->
<!--                         <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i> Dropdown <i class="fa fa-fw fa-caret-down"></i></a> -->
<!--                         <ul id="demo" class="collapse"> -->
<!--                             <li> -->
<!--                                 <a href="#">Dropdown Item</a> -->
<!--                             </li> -->
<!--                             <li> -->
<!--                                 <a href="#">Dropdown Item</a> -->
<!--                             </li> -->
<!--                         </ul> -->
<!--                     </li> -->
                    <li ng-repeat="x in itemsMenu" >
                        <a href="{{x.url}}" target="mainContainer" ><i class="fa fa-fw fa-automobile"></i> {{x.nombre}}</a>
                    </li>
                    
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

        <div id="page-wrapper" >

            <div class="container-fluid" style="height: 750px">
				<iframe name="mainContainer" width="100%" height="100%" src="welcome.jsp" onload="resizeIframe(this)">
				
				</iframe>
                

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

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
