<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MVCxHibernate</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Nunito+Sans:ital,wght@0,200;0,300;0,400;0,600;0,700;0,800;1,800&display=swap');
        *{
        margin: 0;
        padding: 0;
        font-family: "Nunito Sans", Arial, Sans-serif;
        color: white;
        /* font-weight: 500; */
        /* font-size: 14px; */
        }
        div{display: flex;}
        .fd-c{flex-direction: column;}
        .ai-c{align-items: center;}
        .jc-c{justify-content: center;}
        .page{
            height: 100vh;
            width: 100vw;
            box-sizing: border-box;
            background-color: #0A4157
;
        }
        input[type="text"]{
            margin: 10px;
            height: 50px;
            width: 250px;
            border: 2px solid #0A4157;
            border-radius: 100px;
            text-align: center;
        }
        input[type="submit"]{
            margin: 10px;
            height: 40px;
            width: 150px;
            border: 2px solid #0A4157;
            border-radius: 100px;
            text-align: center;
            background-color: white;
            color: grey;
        }
        .register{
            margin-top: 10px;
        }
        a{
            text-decoration: none;
            /* color: white; */
        }
    </style>
</head>
<body>
    <div class="page jc-c ai-c fd-c">
        <div class="title ai-c"><h1>Log Into You Account</h1></div>
        <div class="form">
        	<form:form action="SubmitLoginDetails" modelAttribute="UserLogin">
	            <div><form:input path="username" type="text" placeholder="Username"/></div>
	            <div><form:input path="password" type="text" placeholder="Password"/></div>
	            <div class="jc-c"><input type="submit" value="submit"></div>
            </form:form>
        </div>
        <div class="register"><a href="Register"><h3>New User? Register Here</h3></a></div>
    </div>
</body>
</html>