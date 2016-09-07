<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="Static/css/main.css">
<title>View the table</title>
</head>
<body>
<h2> Result Page of admin</h2>
<h3> Welcome <%= session.getAttribute("uname")%> </h3><br> 

<form class ="login-box">
	<table border = 1 align ="center">
		<tr>
		<th>First_Name</th>
		<td><%= session.getAttribute("first") %></td></tr>
		
			<tr>
			<th>Last_Name</th>
			<td><%= session.getAttribute("last") %> </td></tr>
			
			<tr>
			<th>Last_Name</th>
			<td><%= session.getAttribute("email") %></td></tr>
			
			<tr>
			<th>Mobile</th>
			<td><%= session.getAttribute("phone") %></td></tr>
			
			<tr>
			<th>Course</th>
			<td><%= session.getAttribute("course") %></td></tr>
			
			<tr>
			<th>Address</th>
			<td><%= session.getAttribute("address") %></td></tr>
		
	</table>

	<input type ="submit" name = "submit" value = "AdminConsole" onclick = "window.location.href ='AdminConsole.jsp'">
	</form> 
</body>
</html>