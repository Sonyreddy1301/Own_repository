package com.n2s.miniproject.pojo;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.n2s.miniproject.core.databasecon;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminRegisterServlet")
public class AdminRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminRegisterServlet() {
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
		con = databasecon.getconnection();
		AdminRegisterPojo ad = new AdminRegisterPojo();
		ad.setFname(request.getParameter("fname"));
		ad.setLname(request.getParameter("lname"));
		ad.setUname(request.getParameter("uname"));
		ad.setEmail(request.getParameter("email"));
		ad.setPwd(request.getParameter("pwd"));
		
		
		String first = ad.getFname();
		String last = ad.getLname();
		String name = ad.getUname();
		String email = ad.getEmail();
		String password = ad.getPwd();
		try {
			PreparedStatement prep = con.prepareStatement("Insert into register(first,last,name,email,password)values ('" + first + "','"+ last + "','" + name + "','" + email + "','" + password + "') ");
			int result = prep.executeUpdate();
			System.out.println(result + " Record is added to database!!!");
			prep.close();
			con.close();
			response.sendRedirect("Login.jsp?msg=succ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	}


