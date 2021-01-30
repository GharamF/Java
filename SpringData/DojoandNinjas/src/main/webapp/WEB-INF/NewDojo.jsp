<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %> 


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Dojo</title>

<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" >
</head>
<body>

<div class="container">
<div class="jumbotron">
	<h1>New Dojo</h1>
<form:form action="/AddDojo" method="post" modelAttribute="Dojo">
  <div class="form-group row">
        <form:label class="col-sm-2 col-form-label" path="name">Name</form:label>
        <form:errors path="name"/>
        <div class="col-sm-10">
        <form:input path="name"/>
        </div>
</div>
 
    <input type="submit" value="Submit"/>
</form:form>  
</div>
</div>  
</body>
</html>