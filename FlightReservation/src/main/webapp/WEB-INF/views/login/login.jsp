<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<h2>Welcome to Login</h2>
<form action="searchFlights" method="post">
email <input type= "text" name="email">
Password <input type="text" name="password">
<input type="submit" value="Submit">
</form>
${msg}
</body>
</html>