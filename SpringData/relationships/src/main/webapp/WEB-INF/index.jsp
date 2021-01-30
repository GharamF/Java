<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Home </title>

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
			<th>License #</th>	
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${persons}" var="persons">
        <tr>
           <td>${ persons.firstName } ${ persons.lastName }</td>
		   <td>${ persons.license.getNumberAsString() }</td>
        </tr>
        </c:forEach>
    </tbody>
</table>



<button  class="btn btn-secondary" > <a href="/new"> Add Person</a ></button>  | 
<button  class="btn btn-secondary" ><a href="/licenses/new"> Add License</a> </button>

</div>
</div>
</body>
</html>