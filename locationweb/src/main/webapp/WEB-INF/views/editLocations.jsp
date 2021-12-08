<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Customer</title>
</head>
<body>
<form action="updateLoc" method="post">
<pre>
ID: <input type="text" name= "id" value="${location.id}" readonly="readonly"/> 
Code: <input type="text" name= "code" value="${location.code}">
Name: <input type="text" name= "name"  value="${location.name}">
Type: Urban <input type="radio" name= "type" value="URBAN" ${location.type=='URBAN'?'checked':''}>
	  Rural <input type="radio" name= "type" value="RURAL" ${location.type=='RURAL'?'checked':''}></pre>
	  <input type="submit" value="save">
</form>

</body>
</html>
