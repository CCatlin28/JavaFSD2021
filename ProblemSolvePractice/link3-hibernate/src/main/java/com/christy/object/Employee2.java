package com.christy.object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "employee2")
public class Employee2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_id")
	private int id;
	
	@Column(name="emp_name", length = 100)
	private String name;
	
	@Column(name="emp_email", length = 100)
	private String email;
	
	@Column(name="emp_gender", length = 100)
	private String gender;
	
	@Column(name="emp_country", length = 100)
	private String country;

	public Employee2() {}
	
	public Employee2(int id, String name, String email, String gender, String country) {
		super();
		this.id= id;
		this.name = name;
		this.email =email;
		this.gender = gender;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "<div><tr><td scope=\"row\">"+id+"</td>"
				+"<td value="+name+">"+name+"</td>"
				+"<td value="+email+">"+email+"</td>"
				+"<td value="+gender+">"+gender+"</td>"
				+"<td value="+country+">"+country+"</td>"
				+"<td><input type = \"radio\" name=\"select\" "
				+ "id= \"select\" value = "+id+"></td></tr></div>";

	}
	
}
