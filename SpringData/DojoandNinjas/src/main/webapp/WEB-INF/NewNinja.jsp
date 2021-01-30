<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>

<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" >
</head>
<body>

<div class="container">
<div class="jumbotron">
	<h1>New Ninja</h1>
<form:form action="/AddNinja" method="post" modelAttribute="Ninja">
  <div class="form-group row">
      <form:label cssClass="label left" path="dojo"> Dojo:</form:label>
   			    <form:select cssClass="box" path="dojo">
   			    <c:forEach items="${dojos}" var="dojo">
   			    <form:option value="${dojo}"><c:out value="${dojo.name}"/></form:option>
		    </c:forEach>
 	</form:select>
</div>
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

 <div class="form-group row">
        <form:label class="col-sm-2 col-form-label" path="age">age</form:label>
        <form:errors path="age"/>
        <div class="col-sm-10">
        <form:input type='number' path="age"/>
        </div>
</div> 
 
    <input type="submit" value="Submit"/>
</form:form>  
</div>
</div>  

</body>
</html>