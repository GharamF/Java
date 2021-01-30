<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<html>
<head>
<meta charset="ISO-8859-1">
<title>${Language.name}</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" >

</head>
<body>



<div class="container">
<div class="jumbotron">
<h2 class="display-3" ><c:out value="${Language.name}"/></h2>
<p>Creator: <c:out value="${Language.creator}"/></p>
<p>Version: <c:out value="${Language.currentVersion}"/></p>

<form action="/Languages/${Language.id}/edit" class="inline">
    <button class="btn btn-secondary" >Edit Language </button>
</form>

<form action="/languages/${Language.id}" method="post">
    <input type="hidden" name="_method" value="delete"  class="inline">
    <button class="btn btn-danger" type="submit" value="Delete"> Delete </button>
</form>


	<hr>
<form action="/Languages" class="inline">
    <button class="btn btn-secondary" > Back To DashBoard </button>
</form>
	
	</div>
</div>
</body>
</html>