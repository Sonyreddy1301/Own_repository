package com.n2s.miniproject.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.n2s.miniproject.core.databasecon;

/**
 * Servlet implementation class AdminRegister
 */
@WebServlet("/AdminRegister")
public class AdminRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		Connection con;
		String first = request.getParameter("fname");
		String last = request.getParameter("lname");
		String name = request.getParameter("uname");
		String email = request.getParameter("email");
		String email1 = request.getParameter("email1");
		String password = request.getParameter("pwd");
		con = databasecon.getconnection();
try{
		PreparedStatement prep = con.prepareStatement("Insert into register(first,last,name,email,password)values ('"+first+"','" + last + "','" + name + "','" + email + "','" + password + "') ");
		int result = prep.executeUpdate();  
		out.println(result+" Record is added to database!!!<br/>"); 
		prep.close();
		con.close();
		response.sendRedirect("Login.jsp?msg=succ");
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}
}
