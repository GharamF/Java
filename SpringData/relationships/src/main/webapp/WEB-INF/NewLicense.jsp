<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
   
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New License</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" >
</head>
<body>


<div class="container">
<div class="jumbotron">

		<form:form action="/licenses" method="POST" modelAttribute="License">
        <div class="form-group">
         <form:label path="person">Person</form:label>
		        <form:errors path="person"/>
		        <form:select class="form-control" path="person">
		        <c:forEach items="${persons}" var="person">
		        	<form:option value="${ person.id }">${ person.firstName } ${ person.lastName }</form:option>
		        </c:forEach>
		        </form:select>
		</div>
		<div class="form-group">
		        <form:label path="state">State</form:label>
		        <form:errors path="state"/>
		        <form:input class="form-control" path="state"/>
		    </div>
		    <div class="form-group">
		        <form:label path="expirationDate">Expiration Date</form:label>
		        <form:errors path="expirationDate"/>
		        <form:input type="date" class="form-control" path="expirationDate"/>
		    </div>
 <button>Add License</button>
		</form:form>
 </div>
</div>

</body>
</html>