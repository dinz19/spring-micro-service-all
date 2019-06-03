package com.cts.product.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.entity.TaskEntity;
import com.cts.product.pojo.Task;

import com.cts.product.repository.TaskRepository;


@Repository
public class TaskDao {

	@Autowired
	private TaskRepository taskRepository;
	
	
	public List<Task> getAllTask() {
		List<TaskEntity> taskentity = taskRepository.findAll();
		List<Task> allFriends = new ArrayList<Task>();
		for (TaskEntity feTemp : taskentity) {
			Task fTemp = new Task();
			fTemp.setId(feTemp.getId());
			fTemp.setTask(feTemp.getTask() );
			fTemp.setStatus(feTemp.getStatus());
			fTemp.setSuspend(feTemp.getSuspend());
			allFriends.add(fTemp);
		}
		return allFriends;
	}


	public void AddTask(Task task) {
		// TODO Auto-generated method stub
		TaskEntity te = new TaskEntity();

		te.setStatus(task.getStatus());
		te.setSuspend(task.getSuspend());
		te.setTask(task.getTask());
		taskRepository.save(te);
}


	public List<Task> updatestatusById(int id) {
		// TODO Auto-generated method stub
		TaskEntity fe = taskRepository.findById(id).get();
		fe.setStatus("Done");
		taskRepository.save(fe);
		
		List<TaskEntity> taskentity = taskRepository.findAll();
		List<Task> allFriends = new ArrayList<Task>();
		for (TaskEntity feTemp : taskentity) {
			Task fTemp = new Task();
			fTemp.setId(feTemp.getId());
			fTemp.setTask(feTemp.getTask() );
			fTemp.setStatus(feTemp.getStatus());
			fTemp.setSuspend(feTemp.getSuspend());
			allFriends.add(fTemp);
		}
		return allFriends;
	}


}
