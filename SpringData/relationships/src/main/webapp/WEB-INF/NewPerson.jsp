<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding New Person</title>

<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" >
</head>
<body>

<div class="container">
<div class="jumbotron">
<form:form action="/" method="post" modelAttribute="person">
  <div class="form-group row">
        <form:label class="col-sm-2 col-form-label" path="firstName">firstName</form:label>
        <form:errors path="firstName"/>
        <div class="col-sm-10">
        <form:input path="firstName"/>
        </div>
</div>
<div class="form-group row">
        <form:label class="col-sm-2 col-form-label" path="lastName">lastName</form:label>
        <form:errors path="lastName"/>
        <div class="col-sm-10">
        <form:input path="lastName"/>
        </div>
   </div>
    
    <input type="submit" value="Submit"/>
</form:form>  
</div>
</div>  
</body>
</html>