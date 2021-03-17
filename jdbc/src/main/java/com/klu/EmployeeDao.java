package com.klu;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeDao implements EmployeeDaoInter{

	//1.properties and activation of the object is done by using spring.xml
	private JdbcTemplate jdbctemp;
	//2.create a setter

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	//3.
	public int save(Employee e) {
		String query="insert into Employee values("+e.getEmpno()+","+"'"+e.getEmpname()+"'"+","+"'"+e.getEmpemail()+"'"+")";
		return jdbctemp.update(query);//insert,delete,update
		
	}
	public List<Employee> getallemployee() {
		// Retrieving Data
	 String query="select * from Employee";
	 return jdbctemp.query(query, new ResultSetExtractor<List<Employee>>() {

		public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
			
			 List<Employee> l1 = new ArrayList<Employee>();
			 while(rs.next()) {
				 Employee e = new Employee();
				 e.setEmpno(rs.getInt(1));     //100,101,102
				 e.setEmpname(rs.getString(2));// name
				 e.setEmpemail(rs.getString(3)); //email
		
				 l1.add(e);
			 }
			 return l1;
			 
		}
		 
		 
		 
	 });
	
}
}
