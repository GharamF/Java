<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
<!DOCTYPE html>
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
<form:form action="/languages/${Language.id}" method="post" modelAttribute="Language">
    <input type="hidden" name="_method" value="put">
    <div class="form-group row">
        <form:label  class="col-sm-2 col-form-label" path="name">Name</form:label>
        <form:errors path="name"/>
         <div class="col-sm-10">
        <form:input  path="name"/>
        </div>
    </div>

    <div class="form-group row">
        <form:label class="col-sm-2 col-form-label" path="creator">creator</form:label>
        <form:errors path="creator"/>
        <div class="col-sm-10">
        	<form:input path="creator"/>
        </div>
     </div>
    
 <div class="form-group row">
        <form:label  class="col-sm-2 col-form-label" path="currentVersion">currentVersion</form:label>
        <form:errors path="currentVersion"/>
          <div class="col-sm-10">
        <form:input path="currentVersion"/>
        </div>
    </div>
    
    <input class= "btn btn-secondary" type="submit" value="Submit"/>
</form:form>
</div></div>
</body>
</html>