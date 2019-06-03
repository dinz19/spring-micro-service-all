package com.cts.product.pojo;


public class Task {

	private int id;
	private String task;
	private String status;
	private String suspend;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSuspend() {
		return suspend;
	}
	public void setSuspend(String suspend) {
		this.suspend = suspend;
	}
	
	
	public Task(int id, String task, String status, String suspend) {
		super();
		this.id = id;
		this.task = task;
		this.status = status;
		this.suspend = suspend;
	}

	public Task() {
		super();
	}

	
	
}
