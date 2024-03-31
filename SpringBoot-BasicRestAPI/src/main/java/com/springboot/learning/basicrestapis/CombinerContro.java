package com.springboot.learning.basicrestapis;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springboot.learning.basicrestapis.beans.Details;
import com.springboot.learning.basicrestapis.beans.Employee;

@Component
public class CombinerContro {
	
	private List<Employee> employeeList;
	private List<Details> detailsList;
	public CombinerContro(List<Employee> employeeList, List<Details> detailsList) {
		super();
		this.employeeList = employeeList;
		this.detailsList = detailsList;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public List<Details> getDetailsList() {
		return detailsList;
	}
	public void setDetailsList(List<Details> detailsList) {
		this.detailsList = detailsList;
	}
		


}
