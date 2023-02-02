<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
input {
	height: 75px;
}
</style>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	Login Here
	
	<form:form action="SubmitLoginDetails" modelAttribute="UserLogin">
	<br>
	Username <form:input path="username"/>
	<br>
	Password <form:input path="password"/>
	<br>
	<input type="submit" value="submit"/>
	</form:form>
	<br>
</body>
</html>