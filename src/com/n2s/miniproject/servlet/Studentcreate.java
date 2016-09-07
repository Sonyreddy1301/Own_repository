package com.n2s.miniproject.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.n2s.miniproject.core.databasecon;

/**
 * Servlet implementation class Studentcreate
 */
@WebServlet("/Studentcreate")
public class Studentcreate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Studentcreate() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Connection con;
		int student_id = Integer.parseInt(request.getParameter("id"));
		String first = request.getParameter("fname");
		String last = request.getParameter("lname");

		String email = request.getParameter("email");
		int phone = Integer.parseInt(request.getParameter("Mobile"));
		String course = request.getParameter("Course");
		String address = request.getParameter("Address");
		
		String str1 = request.getParameter("create");
		String str2 = request.getParameter("update");
		


		con = databasecon.getconnection();
if (str1!= null) {
		
		try {
			PreparedStatement  prep = con.prepareStatement("Insert into student_info(student_Id,First_Name,Last_Name,Email_Id,Mobile,Course,Address)values ('"+student_id+"','"+first+"','" + last + "','" + email + "','" + phone + "','" + course + "','" + address + "') ");
			int result = prep.executeUpdate();
			out.println(result+" Record is added to Student_Info!!!<br/>"); 
			prep.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
}else if (str2!= null ) {
	try {
		PreparedStatement  prep = con.prepareStatement("update student_info set First_Name = '"+first+"' ,Last_Name ='"+last+"' ,Email_Id ='"+email+"',Mobile ='"+phone+"',Course ='"+course+"',Address='"+address+"' where Student_Id = '"+student_id+"' ");
		int result = prep.executeUpdate();
		out.println(result+" Record is updated to Student_Info!!!<br/>"); 
		prep.close();
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
}
}
}


