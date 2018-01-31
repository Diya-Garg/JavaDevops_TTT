<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Admin Adding Page</title>
		<style>
			body {
				padding: 10px;
			}
		</style>
	</head>	
	<body>
		<div class="container" align="center">
			<h1>Admin Adding Page</h1>
		</div>
		<div id="exTab1" class="container">
			<ul class="nav nav-pills">
				<li class="active">
					<a href="#a1" data-toggle="tab">Product</a>
				</li>
				<li>
					<a href="#2a" data-toggle="tab">Category</a>
				</li>
				<li>
					<a href="#3a" data-toggle="tab">Supplier</a>
				</li>
			</ul>
			
			<div class="tab-content clearfix">
				<div class="tab-pane active" id="1a">
					<h3>Product Form</h3>
				</div>
				<div class="tab-pane" id="2a">
					<h3>Category Form</h3>
				</div>
				<div class="tab-pane active" id="3a">
					<h3>Supplier Form</h3>
				</div>
			</div> 
			
		</div>
	</body>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</html>