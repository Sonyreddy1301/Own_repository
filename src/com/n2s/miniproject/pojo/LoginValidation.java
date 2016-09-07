package com.n2s.miniproject.pojo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.n2s.miniproject.core.databasecon;

/**
 * Servlet implementation class LoginValidation
 */
@WebServlet("/LoginValidation")
public class LoginValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginValidation() {
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
		
		con = databasecon.getconnection();
	
		AdminRegisterPojo ad = new AdminRegisterPojo();
		ad.setUname(request.getParameter("uname"));
		ad.setPwd(request.getParameter("pwd"));
		
		String uname = ad.getUname();
		String password = ad.getPwd();
try {
			
			PreparedStatement  prep = con.prepareStatement("select name,password from register where name ='"+uname+"' and password = '"+password+"'");
			ResultSet rs = prep.executeQuery();
			int count=0;
			while(rs.next())
			{
			count++;
			}if(count>0){
				out.println("username already exists");
				
			}
			else
			{
				out.println("You can continue");
			}
			

			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
			
	}

}
