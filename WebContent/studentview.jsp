<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="Static/css/main.css">
<title>View and delete victims</title>
</head>
<h2>View Student Details</h2>
<body>
<form class="login-box" method = "post" action ="StudentViewDelete">
<label class="small" name="Student ID">Student ID</label>
 <input type = "text" name ="student_id"  placeholder ="enter student_id"> <br> <br>

<input type ="submit" value = "Delete" name = "delete">
<input type ="submit" value = "View" name = "view">

</form>
</body>
</html>