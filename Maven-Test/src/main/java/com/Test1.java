package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {	 
		ApplicationContext ac = new ClassPathXmlApplicationContext("Spring1.xml");

		Employee1 emp = ac.getBean("emp", Employee1.class);
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
	}

}
