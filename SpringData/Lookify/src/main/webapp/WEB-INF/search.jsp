<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>

<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" >

</head>
<body>


<div class="d-flex justify-content-center">
<div class="jumbotron">
		<div class="top">
			<h2 class="left">Songs by artist: <c:out value="${artist}"/></h2>
			<div class="formright">
				<form action="/search" method="post">
					<input class="form2" type="search" name="artist" placeholder="Artist">
					<input class="form2" type="submit" value="New Search">
				</form>
				
			</div>
		</div>
		<table class="table">
		    <thead>
		        <tr>
		            <th scope="col">Title</th>
		            <th scope="col">Rating</th>
		            <th scope="col">Action</th>
		        </tr>
		    </thead>
		    <tbody>
		        <c:forEach items="${songs}" var="song">
		        <tr>
		            <td><a href="/songs/<c:out value="${song.id}"/>"><c:out value="${song.title}"/></a></td>
		            <td><c:out value="${song.rating}"/></td>
		            <td><a href="/delete/<c:out value="${song.id}"/>">Delete</a></td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>

<a href="/dashboard" class="btn btn-danger"> Dashboard </a>
</div>
</div>
</body>
</html>