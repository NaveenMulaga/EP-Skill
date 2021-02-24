package servlet_crud;



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
@WebServlet("/view") 
public class view extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public view() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost( HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
			  PrintWriter out = response.getWriter();
			  out.print("<h1 align=\"center\">STUDENT DETAILS</h1>");
			  try {
				  Connection con=DBUtil.DBconnection();		
				PreparedStatement stmt=con.prepareStatement("select * from servlet_student");  
				ResultSet rs=stmt.executeQuery();
				   out.println("<html><body>");
				   out.println("<br><br>");	
				   out.println("<table border='1' align=\"center\">");
				   out.println("<tr>");
				   out.println("<td><b>ID</b></td>");
				   out.println("<td><b>NAME</b></td>");
				   out.println("<td><b>EMAILID</b></td>");
				   out.println("</tr>");

				   while(rs.next()) {
				    out.println("<tr>");
				    out.println("<td>"+rs.getInt(1) + "</td>");
				    out.println("<td>"+rs.getString(2) + "</td>");
				    out.println("<td>"+rs.getString(3) + "</td>");
				    out.println("</tr>");

				   }

				   out.println("</table></body></html>");
				   out.print("<a href='index.html'>Home</a>");
				   
				  }
			  
			  catch (SQLException e) {

			   e.printStackTrace();
			  } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			 }
}