package com.n2s.miniproject.student;

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
import javax.servlet.http.HttpSession;

import com.n2s.miniproject.pojo.StudentDetailPojo;
import com.n2s.miniproject.core.databasecon;

/**
 * Servlet implementation class StudentViewDelete
 */
@WebServlet("/StudentViewDelete")
public class StudentViewDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentViewDelete() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Connection con;
		StudentDetailPojo sd = new StudentDetailPojo();
		
		sd.setId(request.getParameter("student_id"));
		long student_id = Long.parseLong(sd.getId());
		
		String str3 = request.getParameter("delete");
		String str4 = request.getParameter("view");
		con = databasecon.getconnection();

		if (str3 != null) {

			try {
				PreparedStatement prep = con
						.prepareStatement("delete from student_info where Student_Id = '" + student_id + "' ");
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
		if (str4 != null) {
			try {
				/*String title = "View the table";*/
				PreparedStatement prep = con.prepareStatement(
						"select First_Name, Last_Name, Email_Id, Mobile, Course, Address from student_info where Student_Id = '"
								+ student_id + "' ");
				ResultSet rs = prep.executeQuery();
				
				while (rs.next()) {
					String first = rs.getString("First_Name");
					String last = rs.getString("Last_Name");
					String email = rs.getString("Email_Id");
					long phone = rs.getLong("Mobile");
					String course = rs.getString("Course");
					String address = rs.getString("Address");
					
					HttpSession sess = request.getSession(true);
					sess.setAttribute("first",first);
					sess.setAttribute("last",last);
					sess.setAttribute("email",email);
					sess.setAttribute("phone",phone);
					sess.setAttribute("course",course);
					sess.setAttribute("address",address);
					response.sendRedirect("table.jsp");

					/*out.println("<html>");
					out.println("<head>");
					out.println("<title>" + title + "</title>");
					out.println("</head>");
					out.println("<body>");
					out.println("<table width =100% border = 1 align = \"center\">");
					out.println("<tr>");
					out.println("<th>" + first + "</th>");
					out.println("<th>" + last + "</th>");
					out.println("<th>" + email + "</th>");
					out.println("<th>" + phone + "</th>");
					out.println("<th>" + course + "</th>");
					out.println("<th>" + address + "</th>");
					out.println("</tr>");
					out.println("</table>");*/
					/*out.println("<input type = \"submit\" name =\"submit\" value= \"AdminConsole\"  onclick = \"window.location.href = 'AdminConsole.jsp'\"");
					out.println("</body>" + "</html>");*/
				}
				rs.close();
				
				prep.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

		}
	}
}
