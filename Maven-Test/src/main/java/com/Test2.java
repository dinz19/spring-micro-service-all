package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.AppConfig;
//import com.*;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee emp = ac.getBean(Employee.class);
		emp.setEmpId(101);
		emp.setEmpName("Gowsi");
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		
		Employee1 emp1 = ac.getBean(Employee1.class);
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmpName());

	}

}
