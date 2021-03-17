package com.klu;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDAO implements EmployeeDAOInter{
	HibernateTemplate temp;

	public HibernateTemplate getTemp() {
		return temp;
	}

	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}
	public int save(Employee e) {
		return (Integer) temp.save(e);
	}
	
	public List<Employee>getallemployee(){
		String query = "from Employee";
		List<Employee>l1 = (List<Employee>) temp.find(query);
		return l1;
		
	}


}