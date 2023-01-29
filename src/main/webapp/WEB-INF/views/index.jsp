<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is the first home page</title>
</head>
<body>
	<h1>Called by home controller.. yeahh</h1>
	<h1> Hello Sir </h1>
	
	<%
	
		String name = (String) request.getAttribute("name");
	
	%>

	<h2>My name is <%=name%></h2>
</body>
</html>