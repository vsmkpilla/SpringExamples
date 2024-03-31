package com.springboot.learning.SpringDataJPA.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private long id;
	
	private String name;
	
	public Student() {
		
	}

	public Student(long id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	

}
