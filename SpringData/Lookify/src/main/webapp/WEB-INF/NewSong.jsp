<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Song</title>

<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" >

</head>
<body>


<div class="d-flex justify-content-center">
<div class="jumbotron">
<a href="/dashboard" class="btn btn-danger"> Dashboard </a> 
<form:form action="/AddNewSong" method="post" modelAttribute="NewSong">		  
	<div class="form-group">
		        <form:label path="title">Song Title</form:label>
		        <form:errors path="title"/>
		        <form:input class="form-control" path="title"/>
		    </div>
		    <div class="form-group">
		        <form:label path="artist">Artist</form:label>
		        <form:errors path="artist"/>
		        <form:input class="form-control" path="artist"/>
		    </div>
		    <div class="form-group">
		        <form:label path="rating">Rating</form:label>
		 <form:errors path="rating"/>
		        <form:input type="number" class="form-control" path="rating"/>
		    </div>
		    <input id="btn" type="submit" value="Add Song"/>	 
		</form:form>


</div>
</div>
</body>
</html>