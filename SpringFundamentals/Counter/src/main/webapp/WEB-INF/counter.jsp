<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>current visit time </title>

	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>


<div class="container">
<h1> You have visited <a href="http://localhost:8080/"> http://localhost:8080/ </a>   <c:out value="${count}" /> Times.    </h1>
<h1><a href="/reset" > Test another visit ?</a> </h1>
</div>
</body>
</html>