<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Top Ten</title>

<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" >

</head>
<body>


<div class="d-flex justify-content-center">
<div class="jumbotron">

<h2 class='display-3 text-info'>Top Ten Songs</h2>
<table class="table">
		    <thead>
		        <tr>   
		        	<th scope="col"></th>
		            <th scope="col">Title</th>
		            <th scope="col">Artist</th>
		        </tr>
		    </thead>
		    <tbody>
		        <c:forEach items="${songs}" var="song">
		        <tr>
		          <td><c:out value="${song.id}"/></td>
		            <td><a href="songs/<c:out value="${song.id}"/>"><c:out value="${song.title}"/></a></td>
	 				<td> - <c:out value="${song.artist}"/></td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
		<hr>
		
<a href="/dashboard" class="btn btn-danger"> Dashboard </a> 
</div>
</div>

</body>
</html>