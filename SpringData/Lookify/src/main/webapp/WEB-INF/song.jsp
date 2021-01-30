<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${song.title} </title>

<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" >

</head>
<body>


<div class="d-flex justify-content-center">
<div class="jumbotron">

<h2 class='display-4 text-info'>${song.title}</h2>
<h2 class='display-4' > Artist: ${song.artist} </h2>
<h2  class='display-4'>Rating from 1 to 10 : ${song.rating} </h2>
<a href="/dashboard" class="btn btn-danger"> Dashboard </a>
<a class="btn btn-danger" href="/delete/<c:out value="${song.id}"/>">Delete</a>
</div>
</div>

</body>
</html>