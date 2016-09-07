package com.n2s.miniproject.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.n2s.miniproject.pojo.StudentDetailPojo;
import com.n2s.miniproject.core.databasecon;

/**
 * Servlet implementation class StudentCreate
 */
@WebServlet("/StudentCreate")
public class StudentCreateUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentCreateUpdate() {
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
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Connection con;
		
		StudentDetailPojo sd = new StudentDetailPojo();
		sd.setId(request.getParameter("id"));
		sd.setFname(request.getParameter("fname"));
		sd.setLname(request.getParameter("lname"));
		sd.setEmail(request.getParameter("email"));
		sd.setMobile(request.getParameter("Mobile"));
		sd.setCourse(request.getParameter("Course"));
		sd.setAddress(request.getParameter("Address"));
		
	long student_id = Long.parseLong(sd.getId());
	String first = sd.getFname();
	String last = sd.getLname();
	String email = sd.getEmail();
	long phone = Long.parseLong(sd.getMobile());
	String course = sd.getCourse();
	String address = sd.getAddress();
	
	String str1 = request.getParameter("create");
	String str2 = request.getParameter("update");
	
	con = databasecon.getconnection();	
if (str1!= null) {
		
		try {
			PreparedStatement  prep = con.prepareStatement("Insert into student_info(student_Id,First_Name,Last_Name,Email_Id,Mobile,Course,Address)values ('"+student_id+"','"+first+"','" + last + "','" + email + "','" + phone + "','" + course + "','" + address + "') ");
			long result = prep.executeUpdate();
			
			HttpSession sess = request.getSession(true);
			sess.setAttribute("result",result);
			response.sendRedirect("index.jsp");
			
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
	
		HttpSession sess = request.getSession(true);
		sess.setAttribute("result",result);
		response.sendRedirect("index.jsp");
		
		prep.close();
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	}
	}
}
