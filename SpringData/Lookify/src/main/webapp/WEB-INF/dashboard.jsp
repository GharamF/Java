<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lookify</title>

<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" >

</head>
<body>


<div class="d-flex justify-content-center">
<div class="jumbotron">
<a href="/newSong" class="btn btn-danger"> Add new Song </a> <a href="/TopTen" class="btn btn-danger"> Top song </a>
				<form action="/search" method="post">
					<input class="form" type="submit" value="Search Artists">
					<input class="form" type="search" name="artist" placeholder="Artist">
				</form>
				<hr>
<div>
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
		            <td><a href="songs/<c:out value="${song.id}"/>"><c:out value="${song.title}"/></a></td>
		            <td><c:out value="${song.rating}"/></td>
		            <td><a href="/delete/<c:out value="${song.id}"/>">Delete</a></td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
</div>
</div>
</div>
</body>
</html>