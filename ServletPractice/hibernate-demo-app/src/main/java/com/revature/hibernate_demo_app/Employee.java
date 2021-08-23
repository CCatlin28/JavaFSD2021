package com.revature.hibernate_demo_app;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int id;
	
	private String name;
	private String email;
	
	public Employee() {}
	
	public Employee(int id, String name, String email) {
		super();
		this.id =id;
		this.name = name;
		this.email = email;
		
	}
	
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id= id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employee [id="+id+", name="+name+", email="+email+"]";
	}

	

}
