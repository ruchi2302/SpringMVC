<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="user" action="registerProcess"
		method="POST">

		<table align="center">

		<!-- 	<tr>
				<td><label >UserId</label></td>

				<td><input path="userId" name="userId" id="userId" /></td>

			</tr> -->

			<tr>
				<td><label path="userName">UserName</label></td>

				<td><input path="userName" name="userName" id="userName" /></td>

			</tr>

			<tr>
				<td><label path="password">Password</label></td>

				<td><input path="password" name="password"
						id="password" /></td>
			</tr>

			<tr>
				<td><label path="firstName">FirstName</label></td>

				<td><input path="firstName" name="firstName"
						id="firstName" /></td>
			</tr>


			<tr>
				<td><label path="lastName" >LastName</label></td>

				<td><input path="lastName" name="lastName" id="lastName" /></td>
			</tr>


			<tr>
				<td><label path="email">EmailId</label></td>

				<td><input path="email" name="email" id="email" /></td>
			</tr>



			<tr>
				<td><label path="address">Address</label></td>

				<td><input path="address" name="address" id="address" /></td>
			</tr>


			<tr>
				<td><label path="phone">Phone Number</label></td>

				<td><input path="phone" name="phone" id="phone" /></td>
			</tr>
			<tr>
				<td></td>
				<td><button id="register" name="register">Register</button>
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