<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<script type="text/javascript" src="Static/js/validation.js"></script> 
<!-- <script type="text/javascript" src="Static/js/register.js"></script> -->
<link rel="stylesheet" href="Static/css/main.css">

<h2> User Login Details </h2>
</head>

<body>
<%
String msg = request.getParameter("msg");
if(msg != null){
out.println("<script>alert('Registered Successfully..Please Login..')</script>");
}

String msg1 = request.getParameter("msg1");
if(msg1 != null){
out.println("<script>alert('Login Fail..')</script>");
}

String msg2 = request.getParameter("msg2");
if(msg2 != null){
out.println("<script>alert('Enter correct password!!!!')</script>");
}
%> 
<div class ="login-box">
	<form method ="post" action ="AdminLogin">

		<table class="table1">
		<tr class="row1">
			<td colspan="2"><b>User Login Page</b></td>
			</tr>
			<tr>
				<td><b>User name</b></td>
				<td><input type="text" id="uname" name ="uname"  placeholder="Enter username" required/></td>
				
			</tr>

			<tr>
				<td><b>Password</b></td>
				<td><input type="text" id="pwd" name ="pwd"  placeholder="Enter password" required/></td>
			</tr>

			
		</table>
	
		<br>
 <!-- <button onclick = "return validation()">Login</button> --> 
		<input type ="submit" value = "Login" name ="submit" onclick="window.location.href='AdminConsole.jsp'"  > 
		
	</form>
	</div>
 
</body>
</html>