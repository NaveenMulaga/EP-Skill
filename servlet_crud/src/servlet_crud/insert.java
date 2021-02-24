package servlet_crud;




import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class insert
 */
@WebServlet("/insert")  
public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public insert() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("regno"));
		 String sname=request.getParameter("name"); 
		 String semail=request.getParameter("email");
		 Bean rb1=new Bean();
		  rb1.setRegno(id); 
		  rb1.setName(sname);
		  rb1.setEmail(semail);
		  PrintWriter pw=response.getWriter();
		  DAO dao = new DAO();
		  try { 
			  int i=dao.StudentInsert(rb1);
			  if(i>0)
			  {
				  	pw.print("<p>Record saved successfully!</p>");
				  	pw.print("<a href='view'>View Details</a>");
			  } 
			  else{ 
				  RequestDispatcher rd1=request.getRequestDispatcher("error.html");
				  rd1.include(request, response); 
				  } 
		 } 
		 catch (ClassNotFoundException e) 
		  { // TODO Auto-generated catch block 
			 e.printStackTrace();
			 
		  } 
		  catch (SQLException e)
		  { //TODO Auto-generated catch block 
			  e.printStackTrace(); }//sb have details of client
			 
		 }
	}