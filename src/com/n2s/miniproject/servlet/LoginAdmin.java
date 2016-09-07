package com.n2s.miniproject.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.n2s.miniproject.core.databasecon;

/**
 * Servlet implementation class LoginAdmin
 */
@WebServlet("/LoginAdmin")
public class LoginAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAdmin() {
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
		Connection con;
		Statement stmt;
		ResultSet rs;
		String uname = request.getParameter("uname");
		String password = request.getParameter("pwd");

		con = databasecon.getconnection();
		
		try{
		stmt = con.createStatement();

		rs = stmt.executeQuery("select name,password from register where name ='"+uname+"' and password = '"+password+"'");

		if(rs.next()){
			HttpSession sess = request.getSession(true);
		sess.setAttribute("uname",uname);
		response.sendRedirect("AdminConsole.jsp");

		}else{
			response.sendRedirect("Login.jsp?msg1=unsucc");
		}
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}

}
}
