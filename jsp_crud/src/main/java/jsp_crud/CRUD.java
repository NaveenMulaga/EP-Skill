package jsp_crud;

import java.sql.Connection;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class CRUD {
	public int Insert(Bean eb) throws ClassNotFoundException,SQLException{
		Connection con=DBUtil.DBConnection();
		String sql="insert into student values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,eb.getEmpid());
		ps.setString(2,eb.getName());
		ps.setString(3,eb.getEmailid());;
		int i=ps.executeUpdate();
		return i;
		
	}
	public  int updation(Bean eb) throws ClassNotFoundException, SQLException {
		Connection con=DBUtil.DBConnection();		
		PreparedStatement stmt=con.prepareStatement("update student set name=?,email=? where id=?");  
		stmt.setString(1,eb.getName());
		stmt.setString(2,eb.getEmailid());
		stmt.setInt(3,eb.getEmpid());
		int u=stmt.executeUpdate();  
		return u;
	}
	public  int Delete(int id) throws ClassNotFoundException, SQLException {
		Connection con=DBUtil.DBConnection();		
		PreparedStatement stmt=con.prepareStatement("delete from student where id=?");  
		stmt.setInt(1,id);
		int u=stmt.executeUpdate();  
		con.close();
		return u;
	}
	 
	public static Bean getRecordById(int id){  
		Bean u=null;  
	    try{  
	    	 Connection con=DBUtil.DBConnection();   
	        PreparedStatement ps=con.prepareStatement("select * from student where id=?");  
	        ps.setInt(1,id);  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){ 
	        	  u=new Bean();  
	            u.setEmpid(rs.getInt("id"));  
	            u.setName(rs.getString("name"));  
	            u.setEmailid(rs.getString("email")); 
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return u;  
	}  
}