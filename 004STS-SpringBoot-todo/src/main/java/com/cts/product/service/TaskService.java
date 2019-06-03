package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.TaskDao;
import com.cts.product.pojo.Task;


@Service
public class TaskService {


	@Autowired
	private TaskDao taskDAO;
	
	public List<Task> getAllTask() {
		// TODO Auto-generated method stub
		return taskDAO.getAllTask();
	}

	  
	  public void AddTask(Task task) {
			// TODO Auto-generated method stub
			taskDAO.AddTask(task);
		}


	public List<Task> updatestatusById(int id) {
		// TODO Auto-generated method stub
		 return taskDAO.updatestatusById(id);
	}



	
}
