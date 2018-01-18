<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>	
	<form:form action="loginProcess" method="post" modelAttribute="user">
		<table align="center">
			<tr>
				<td>
					<form:label path="userName">Username : </form:label>
				</td>
				<td>
					<form:input path="userName" name="userName"/>
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="password">Password : </form:label>
				</td>
				<td>
					<form:password path="password" name="password"/>
				</td>
			</tr>
				<tr>
				<td></td>
				<td>
					<form:button name="login">Login</form:button>
				</td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="home.jsp">Home</a></td>
			</tr>
		</table>
	</form:form>
</body>
</html>