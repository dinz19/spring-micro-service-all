package com.cts.product.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.pojo.Task;
import com.cts.product.service.TaskService;



@RestController 
public class TaskControllet {
	
	@Autowired
    private TaskService taskService;
	
    @GetMapping("/get")
    public List<Task> getAllTask() {
    	return taskService.getAllTask(); 
    }
    
    @RequestMapping(value = "/add", method=RequestMethod.POST)   
	 public void AddTask(@RequestBody Task task) {
	    	 taskService.AddTask(task);
    }
   
    @PostMapping("/status/{myid}")
 		public List<Task> updatestatusById(@PathVariable("myid") int id) {
 			return taskService.updatestatusById(id);
 		}

}
