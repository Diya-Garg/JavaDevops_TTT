<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fetch Supplier</title>
</head>
<body>
	<div align="center">
		<h1>${msg}</h1>
		<form:form method="get" action="deleteSupplier" modelAttribute="supplier">
		<table>
			<tr>
				<td>Supplier Id : </td>
				<td><form:input path="supplierId"/></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="Delete Supplier"/>
				</td>
			</tr>
		</table>
			
			
		</form:form>
	</div>
</body>
</html>