<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>${Header}</h1>

	<h2>Welcome, ${user.userName }</h2>
	<h2>Your email address is ${user.email }</h2>
	<h3>Your password is ${user.password }</h3>

</body>
</html>