package com.cts.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.pojo.Friend;
import com.cts.product.service.FriendService;

@RestController 
@RequestMapping("/api")
public class WelcomeController {
	
	@Autowired 
	private FriendService friendService;
	
	
	 @RequestMapping(value ="/welcome", method=RequestMethod.GET)
	 public String welcome() {
		  return "Hello from Spring Boot Get!!!!";
	 }
	 
	 
	 @RequestMapping(value ="/welcome", method=RequestMethod.POST)
     public String welcomePost() {
    	 return "Hello from Spring POST!!!!";
     }
	 
	 @RequestMapping(value ="/welcome", method=RequestMethod.PUT)
     public String welcomePut() {
    	 return "Hello from Spring PUT!!!!";
     }
	 
	 @RequestMapping(value ="/welcome", method=RequestMethod.DELETE)
     public String welcomeDelete() {
    	 return "Hello from Spring DELETE!!!!";
     }
	 
	 @GetMapping("/all")
	 public List<Friend> listFriends() {
		 return friendService.getAllFriends1();
	 }

	 @RequestMapping(value = "/get/{id}")
     public Friend getFriendById(@PathVariable String id) {
 
		 return friendService.getFriendById(id);
     }
	 
	 
}
