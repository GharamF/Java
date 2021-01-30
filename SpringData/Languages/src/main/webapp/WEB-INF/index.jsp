<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages</title>

<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" >

</head>
<body>


<div class="container">
<div class="jumbotron">
<table class="table">
    <thead>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Version</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${Languages}" var="Languages">
        <tr>
            <td>  <a href="/Languages/${Languages.id}"> <c:out value="${Languages.name}"/> </a> </td>
            <td><c:out value="${Languages.creator}"/></td>
            <td><c:out value="${Languages.currentVersion}"/></td>
            <td>  <a href="/Languages/${Languages.id}">View</a> /   <a href="/Languages/${Languages.id}/edit"> Edit </a>  </td>
        </tr>
        </c:forEach>
    </tbody>
</table>


<form action="/Languages/new" class="inline">
    <button class="btn btn-secondary" > Add New Language </button>
</form>
</div>
</div>

</body>
</html>