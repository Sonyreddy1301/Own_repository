<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="Static/css/main.css">
<title>Student Information</title>
</head>
<body>
<h2> Please enter student details</h2>
<form class ="login-box" method ="post" action ="StudentCreate">
            <table>
                <tr class="row1"> 
                <td colspan="5">
                    <b>Student Information</b>
                </td>
                </tr>
                
                <tr>
                    <td>
                        <label name="Student ID">Student ID</label>
                    </td>
                    <td><input type="text" name="id" placeholder ="enter student_id"/></td>
                   
                </tr>
                
                <tr>
                    <td>
                        <label name="First Name">First Name</label>
                    </td>
                    <td><input type="text" name="fname" placeholder ="enter first name" /></td>
                   
                </tr>

                <tr>
                    <td>
                        <label name="Last Name">Last Name</label>
                    </td>
                    <td><input type="text" name="lname" placeholder ="enter last name"/></td>
                </tr>
                 <tr>
                    <td>
                        <label name="Email ID">Email ID</label>
                    </td>
                    <td><input type="text" name="email" placeholder ="enter email_id"  /></td>
                </tr>

                <tr>
                    <td>
                        <label name="Mobile Number">Mobile</label>
                    </td>
                    <td><input type="text" name="Mobile" placeholder="enter mobile"/></td>
                </tr>
                
                <tr>
                    <td>
                        <label name="Course">Course</label></td>
                       <td> <input type="text" name="Course" placeholder="enter course" />
                    </td>
                    
                </tr>

                <tr>
                    <td>
                        <label name="Address">Address</label>
                    </td>
                    <td>
                        <textarea name="Address" placeholder="enter Address"></textarea>
                    </td>
                </tr>
                </table> <br> 
            <input type="submit" value="Create" name ="create">
           <input type="submit" value ="Update" name ="update">
           
           <input type ="reset" value="Reset">
  </form>
        
             

</body>
</html>