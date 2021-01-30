<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${dojo.name}</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" >
</head>
<body>

<div class="container">
<div class="jumbotron">
<h1 class="display-4">${dojo.name} Location Ninjas  </h1>
<table class="table">
    <thead>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${dojo.ninjas}" var="ninja">
        <tr>
            <td><c:out value="${ninja.firstName}"/></td>
            <td><c:out value="${ninja.lastName}"/></td>
            <td><c:out value="${ninja.age}"/></td>
         </tr>
        </c:forEach>
    </tbody>
</table>



	<hr>
<form action="/NewDojo" class="inline">
    <button class="btn btn-secondary" > Create New Dojo </button>
</form>
<hr>
<form action="/NewNinja" class="inline">
    <button class="btn btn-secondary" > Add New Ninjas</button>
</form>
	

</div>
</div>

</body>
</html>