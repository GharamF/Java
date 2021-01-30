<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo survey index</title>

<link rel="stylesheet" type="text/css" href="css/bootstrap.css">

</head>
<body>
<div class="border border-dark"> 
<div class="container">
		<form action="/Display" method="post">
			<p >Your Name: <input class="formfields" type="text" name="name"></p>
			<p>Dojo Location: <select  name="location"></p>
				  <option value="San Jose">San Jose</option>
  				  <option value="Los Angeles">Los Angeles</option>
				  <option value="Seattle">Seattle</option>
				  </select>
				<p>Favorite Language: <select  name="language">	</p>
				  <option value="Python">Python</option>
				  <option value="Java">Java</option>
				  <option value="MERN">MERN</option>
				  </select>
				<p>Comment (optional):</p>
			<p><input type="textarea" name="comment"></p>
			<p><input type="submit" value="Submit"></p>
		</form>
	</div>
	
	</div>

</body>
</html>