package com.cts.product.pojo;

public class Friend {
	
	private String name;
	private int age;
	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
 	public Friend(String name, int age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}  

//	public Friend() {
//		super();
//	}
	

}
