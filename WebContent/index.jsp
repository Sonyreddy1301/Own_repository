<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="Static/css/main.css">
<title>CRUD operations</title>
</head>
<body>
<h2> Result Page of admin</h2>
<h3> Welcome <%= session.getAttribute("uname")%> </h3>><br> 
<h3> <%= session.getAttribute("result") %> Successfully done with "CRUD" operations </h3><br> <br>
<div class ="login-box" align = "center">
<input type ="submit" name = "submit" value = "AdminConsole" onclick = "window.location.href ='AdminConsole.jsp'"> 
</div>
</body>
</html>