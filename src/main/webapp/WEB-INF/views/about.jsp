<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is about page</h1>
	<h1>Very happy</h1>
	
	<%
	
		String name = (String) request.getAttribute("name");
	
	%>

	<h2>My name is <%=name%></h2>
</body>
</html>