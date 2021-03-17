package com.klu;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	public static void main(String [] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		//Employee e = (Employee) ac.getBean("emp");//IOC ---> DI
		EmployeeDAO edao = (EmployeeDAO) ac.getBean("empdao");
		//System.out.println(edao.save(e));
		List<Employee> e = edao.getallemployee();
		for(Employee p:e) {
			System.out.println(p);
		}
	}

}