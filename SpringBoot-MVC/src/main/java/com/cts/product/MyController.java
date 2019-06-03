package com.cts.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/s1")
	public void f1() {
	    System.out.println("----Mycontoleer F1 methos");
	}   
	
	@RequestMapping("/s2")
	public void f2() {
	    System.out.println("----This is my F2 methos");
	    
	}
	
	@RequestMapping("/s3")
	public String f3() {
		 System.out.println("---This is F3 method");
		 return "one";
	}
	
	@RequestMapping("/s4")
	public String f4(Model model) {
		 System.out.println("---This is F4 method");
		 String userName="Gowsi";
		 model.addAttribute("Uname", userName);
		 return "two";
	}

}
