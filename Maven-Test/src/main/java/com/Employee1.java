package com;

import org.springframework.stereotype.Component;

@Component ("emp")
public class Employee1 {
	
	 private int EmpId =10;
	 private String EmpName = "Gowsi";
	 
	 
	public int getEmpId() {
		return EmpId;
	}
	
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	
	public String getEmpName() {
		return EmpName;
	}
	
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	 
	 

}
