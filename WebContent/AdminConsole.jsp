<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="Static/js/validation.js"></script>
<link rel="stylesheet" href="Static/css/main.css">
<title>Admin Console Page</title>
<h2>Admin Console Page</h2>
</head>
<body>
	<%@ page import="java.io.*,java.util.*"%>
	<%
		Integer visitCount = (Integer) session.getAttribute("visitCount");
		String UserID = (String) session.getAttribute("uname");

		if (visitCount == null) {
			visitCount = new Integer(0);
		} else {
			visitCount = new Integer(visitCount.intValue() + 1);

		}
		session.setAttribute("visitCount", visitCount);
	%>
	<h3>
		Welcome
		<%=session.getAttribute("uname")%>
	</h3>
	<br>
	<br>

	<form class="login-box">

		<input id="Button1" type="button" value="CREATE" onclick="window.location.href='Studentinfo.jsp'" /> 
		<input id="Button2" type="button" value="UPDATE" onclick="window.location.href='Studentinfo.jsp'" /> 
		<input id="Button3" type="button" value="VIEW" onclick="window.location.href='studentview.jsp'" /> 
		<input id="Button4" type="button" value="DELETE" onclick="window.location.href='studentview.jsp'" /> 
		<input type="submit" value="LOG OUT" onclick="window.location.href='Login.jsp'">
	</form>
	<br>
	<br>

	<table class="table2">
		<tr class="row1">
			<th>Session Info</th>
			<th>Session Values</th>
		<tr>
			<th>Session Id</th>
			<td><%=session.getId()%></td>
		</tr>

		<tr>
			<th>Creation Time</th>
			<td><%=new Date(session.getCreationTime())%></td>
		</tr>

		<tr>
			<th>Last time access of web page</th>
			<td><%=new Date(session.getLastAccessedTime())%></td>
		</tr>

		<tr>
			<th>User ID</th>
			<td>
				<%
					out.print(UserID);
				%>
			</td>
		</tr>

		<tr>
			<th>Visits to Website</th>
			<td>
				<%
					out.print(visitCount);
				%>
			</td>
		</tr>
	</table>
</body>
</html>