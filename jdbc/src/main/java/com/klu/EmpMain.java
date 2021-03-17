package com.klu;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("unused")
public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		//Employee e= (Employee) ac.getBean("emp"); //IOC , DI Technique
		EmployeeDao edao = (EmployeeDao) ac.getBean("empdao");
		//insertion of data
		//System.out.println(edao.save(e));
		
		//retrieving the data
		List<Employee> e=edao.getallemployee();
		//Iteration of getting multiple values from the database.
		for(Employee p:e) {
			System.out.println(p);
		}
	}
}


