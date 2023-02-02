<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
input {
	height: 50px;
}
</style>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	Register Here
	<form:form action="SubmitRegistrationDetails" modelAttribute="UserRegData">
	<br>
	Email Id <form:input path="EmailId"/>
	<br>
	Password <form:input path="Password"/>
	<br>
	User name <form:input path="Username"/>
	<br>
	First Name <form:input path="FName"/>
	<br>
	Last Name <form:input path="LName"/>
	<br>
	Java <form:checkbox path="Java" value="true"/>
	mysql <form:checkbox path="Mysql" value="true"/>
	cpp <form:checkbox path="CPP" value="true"/>
	<br>
	<input type="submit" value="submit"/>
	</form:form>
	<br>
</body>
</html>