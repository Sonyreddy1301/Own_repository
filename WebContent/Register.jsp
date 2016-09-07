<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="Static/js/register.js"></script>
<link rel="stylesheet" href="Static/css/main.css">

<title>Registration Page</title>
<h2> Online Student Registration </h2>
</head>
<body>
	<form class ="login-box" method = "post" name="myForm" action="AdminRegisterServlet">
		<table >

			<tr class="row1">
			<td colspan="7"><b>User Details</b></td>
			</tr>
			<tr>
				<td><b> First Name</b></td>
				<td><input type="text" id ="fname" name="fname" placeholder ="enter first name" /></td>
			</tr>

			<tr>
				<td><b>Last name</b></td>
				<td><input type="text" id="lname" name ="lname" placeholder ="enter last name" ></td>
			</tr>

			<tr>
				<td><b>User Name</b></td>
				<td><input type="text" id="uname" name ="uname" placeholder ="enter user name" ></td>
			</tr>

			<tr>
				<td><b>Your Email</b></td>
				<td><input type="text" id="email" name="email" placeholder ="enter email_id" ></td>
			</tr>



			<tr>
				<td><b>Re-enter Email</b></td>
				<td><input type="text" id="email1" name ="email1" placeholder ="verify email_id" ></td>
			</tr>

			<tr>
				<td><b>New Password</b></td>
				<td><input type="text" id="pwd" name ="pwd" placeholder ="enter password" ></td>

			</tr>




		</table>
		<br>
		<button onclick=" return register()">Register</button>
		<input type="reset" value="Reset" /> 
		<input type="submit" value="Login" onclick="window.location.href='Login.jsp'" />
		

	</form>

</body>
</html>