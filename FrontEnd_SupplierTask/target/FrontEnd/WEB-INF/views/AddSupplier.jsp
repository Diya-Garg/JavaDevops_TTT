<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Supplier Form</title>
</head>
<body>
	<h1>Add Supplier</h1>
	<form:form action="addSupplierDetails" method="post" modelAttribute="supplier">
		<table>
			<tr>
				<td>Supplier Id : </td>
				<td><form:input path="supplierId"/></td>
			</tr>
			<tr>
				<td>Supplier Name : </td>
				<td><form:input path="supplierName"/></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="Add"/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>