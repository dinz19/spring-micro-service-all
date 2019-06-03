package com.cts.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	
	// Loading a from
	@RequestMapping("/loadForm")
	public String loadForm() {
		return "form";
	}
	
	// save data from form

	
	@RequestMapping("/saveProduct")
	public ModelAndView saveProduct(@RequestParam("id") String id,@RequestParam("name") String name,@RequestParam("price") double price, @RequestParam("description") String description) {
		
	Product prod=new Product();
	prod.setId(id);
	prod.setName(name);
	prod.setPrice(price);
	prod.setDescription(description);
	
	ModelAndView mav=new ModelAndView();
	mav.setViewName("product");
	mav.addObject("product",prod);
	return mav;
		
	}
	
	@RequestMapping("/saveProduct_v1")
	public ModelAndView saveProduct_v1(@ModelAttribute Product prod) {
	ModelAndView mav=new ModelAndView();
	mav.setViewName("product");
	mav.addObject("product",prod);
	return mav;
	}
	
	
	
	@RequestMapping("/test")
	public String test() {
		System.out.println("---- test method");
		System.out.println("--- testing my method");
		return "one";
	}
}