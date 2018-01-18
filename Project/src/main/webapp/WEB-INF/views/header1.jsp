<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resources/images/fevicon.ico"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/homepagecss.css"/>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width",initial-scale=1">
<title>PizzaStore</title>
</head>
<body>
 <nav class="nav navbar-inverse navbar-custom">
 	<div class="navbar-header">
      	<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        	<span class="icon-bar"></span>
        	<span class="icon-bar"></span>
        	<span class="icon-bar"></span>                        
      	</button>
      	  <a class="navbar-brand" href="#" style="color:white!important;font-size:20px">
      	  info@pizzastore.com | 180087970</a>
     </div>
	 <div class="collapse navbar-collapse container-fluid" id="myNavbar">
    	
		<ul class="nav navbar-nav navbar-right">
			<li><a href="#" class="nav1options"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      		<!-- <li><a href="#" class="nav1options"><span class="glyphicon glyphicon-log-in"></span> Login</a></li> -->
      		
      		<li class="dropdown">
          		<a href="#" class="dropdown-toggle" data-toggle="dropdown">
          			<i class="fa fa-cogs"></i> <b class="color-blue">Login</b> <span class="caret"></span>
   				</a>
          	<ul class="dropdown-menu login-panel">
            <li>
                <div class="dropdown-header">
                    <span class="login-header color-blue">Sign In</span>
                    <span class="forgot-password color-blue"><a href="">Forgot password?</a></span>
                </div>
                <div class="clearfix"></div>
                <div style="padding: 8px;">
       
                    <form id="loginform" class="form-horizontal" role="form"  autocomplete="off" action="login">
                        <div style="margin-bottom: 10px" class="input-group">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-user color-blue"></i></span>
                            USERNAME
                            <input id="login-username" type="text" class="form-control" name="username" value="" placeholder="username or email" pattern="[a-zA-Z0-9]{5,}" title="Minimum 5 letters or numbers." oninvalid="this.setCustomValidity('Enter User Name Here')" oninput="setCustomValidity('')" required>                                        
                        </div>
                        <div style="margin-bottom: 10px" class="input-group">
                            <span class="input-group-addon"><i class="glyphicon glyphicon-lock color-blue"></i></span>
                             PASSWORD 
                            <input id="login-password" type="password" class="form-control" name="password" placeholder="password" pattern=".{5,}" title="Minmimum 5 letters or numbers." oninvalid="this.setCustomValidity('Enter a password')" oninput="setCustomValidity('')" required>
                        </div>
                        <!-- <div class="center-text">
                            <span class="error-message color-red"><i class="glyphicon glyphicon-warning-sign"></i> Username & password don't match!</span>
                        </div> -->
                        <div style="margin-top:10px" class="form-group">
                            <div class="col-sm-12 controls center-text">
                              <a id="btn-login" href="#" class="btn btn-block btn-success">Login</a>
                              
                            </div>
                        </div>  
                    </form>
                </div>
                
                                
           </li>
        </ul>
        </li>
        </ul>
	</div>
</nav>