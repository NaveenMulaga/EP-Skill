package servlet_crud;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/update") 
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public update() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("regno"));
		String sname=request.getParameter("name"); 
		Bean b=new Bean();
		b.setRegno(id);
		b.setName(sname);
		PrintWriter pw=response.getWriter();
		DAO dao = new DAO();
		try {
			int i=dao.Studentupdation(b);
			if(i>0) {
				pw.print("<p>Record Updated successfully!</p>");  
				pw.print("<a href='view'>View Details</a>");
			}
			else {
				pw.print("<p>Record not updated</p>");  	
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}