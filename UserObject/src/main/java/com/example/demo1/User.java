package com.example.demo1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat
@Entity
@Table(name="user")
public class User {
	@Id
	private long id;
	private String name;
	private int age;
	private String department;
	private String subject;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(long id, String name, int age, String department, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.subject = subject;
	}
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	

}
