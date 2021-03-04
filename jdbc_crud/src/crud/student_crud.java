package crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.lang.ClassNotFoundException;

import DBUtil.DBUtil;
import Bean.student_bean;

public class student_crud {

	public static int StudentInsert(student_bean student) throws ClassNotFoundException, SQLException {
		Connection con=DBUtil.DBconnection();
		
		PreparedStatement stmt=con.prepareStatement("insert into student values(?,?,?)");
		stmt.setInt(1,student.getRegno());
		stmt.setString(2,student.getName());
		stmt.setString(3,student.getEmail());
		int i=stmt.executeUpdate();
		con.close();
		return i;
	}
	public static int StudentDeletion(student_bean student) throws ClassNotFoundException, SQLException {
		Connection con=DBUtil.DBconnection();		
		PreparedStatement stmt=con.prepareStatement("delete from student where regno=?");
		stmt.setInt(1,student.getRegno());
		int a=stmt.executeUpdate();
		con.close();
		return a;
	}
	public static int Studentupdation(student_bean student) throws ClassNotFoundException, SQLException {
		Connection con=DBUtil.DBconnection();		
		PreparedStatement stmt=con.prepareStatement("update student set name=? where regno=?");  
		stmt.setString(1,student.getName());
		stmt.setInt(2,student.getRegno());
		int u=stmt.executeUpdate();  
		return u;
	}
	public static void Studentdisplay(student_bean student) throws ClassNotFoundException, SQLException {
		Connection con=DBUtil.DBconnection();		
	    PreparedStatement stmt=con.prepareStatement("select * from student");  
	    ResultSet rs=stmt.executeQuery();  
	    while(rs.next()){  
	    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));  
	    }  
		
	}
}