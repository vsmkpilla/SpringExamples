package com.springboot.learning.jpa.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeList {
	@Autowired
	private List<Employee> empList;

	public EmployeeList(List<Employee> empList) {
		super();
		this.empList = empList;
	}
	
}
