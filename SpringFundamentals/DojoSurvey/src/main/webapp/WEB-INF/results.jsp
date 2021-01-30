<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo survey index</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">

</head>
<body>

<div class="border border-dark"> 
<div class="container">
	<p > <c:out value="${name}"/></p>
	<p> <c:out value="${location}"  /> </p>
	<p> <c:out value="${language}"  /> </p>
	<p> <c:out value="${comment}"  /> </p>
</div>	
</div>
</body>
</html>