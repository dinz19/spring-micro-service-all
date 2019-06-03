package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 
		ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
        Employee emp=(Employee)ac.getBean("emp");
  //    Employee emp=ac.getBean("emp",Employee.class);
 //  	Employee emp=ac.getBean(Employee.class);
	    System.out.println(emp.getEmpId());
	    System.out.println(emp.getEmpName());
	    System.out.println(emp.getSalary());
	}
	
}
