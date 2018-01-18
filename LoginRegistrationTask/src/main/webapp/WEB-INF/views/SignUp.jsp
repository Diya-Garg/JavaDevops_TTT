<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp Page</title>
<style>
	.error{
		color:#ff0000;
		font-style: italic;
		font-weight: bold;
	}
</style>
</head>
<body>	
	<form:form action="registerProcess" method="post" modelAttribute="user">
		<table align="center">
			<tr>
				<td>
					<form:label path="userName">Username : </form:label>
				</td>
				<td>
					<form:input path="userName" name="userName"/>
				</td>
				<td>
					<form:errors path="userName" cssClass="error"></form:errors>
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="password">Password : </form:label>
				</td>
				<td>
					<form:password path="password" name="password"/>
				</td>
				<td>
					<form:errors path="password" cssClass="error"></form:errors>
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="firstName">First Name : </form:label>
				</td>
				<td>
					<form:input path="firstName" name="firstName"/>
				</td>
				<td>
					<form:errors path="firstName" cssClass="error"></form:errors>
				</td>
			</tr>
			<tr>	
				<td>
					<form:label path="lastName">Last Name : </form:label>
				</td>
				<td>
					<form:input path="lastName" name="lastName"/>
				</td>
				<td>
					<form:errors path="lastName" cssClass="error"></form:errors>
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="email">Email : </form:label>
				</td>
				<td>
					<form:input path="email" name="email"/>
				</td>
				<td>
					<form:errors path="email" cssClass="error"></form:errors>
				</td>
			</tr>
			<%-- <tr>
				<td>
					<form:label path="address">Address : </form:label>
				</td>
				<td>
					<form:input path="address" name="address"/>
				</td>
			</tr> --%>
			<tr>
				<td>
					<form:label path="phone">Phone : </form:label>
				</td>
				<td>
					<form:input path="phone" name="phone"/>
				</td>
				<td>
					<form:errors path="phone" cssClass="error"></form:errors>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<form:button name="register">Register</form:button>
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