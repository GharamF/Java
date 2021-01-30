<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Secret Code</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body>

<form method="POST" action="/TheCode">
	<p class="Danger"> <c:out value="${error}"/></p>
	<p> What is the code : </p>
    <label>code: <input type="text" name="code"></label>
        <button>Try Code </button>
</form>

</body>
</html>