package com.springboot.learning.empdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learning.empdetails.jpa.Employee;
import com.springboot.learning.empdetails.jpa.EmployeeControllerRepository;

@Component
public class EmpDetailsCommandLineRunner implements CommandLineRunner {
	@Autowired
	private EmployeeControllerRepository empController;
	
	@Override
	public void run(String... args) throws Exception {

	empController.insert(new Employee(10,"Mani"));
	empController.insert(new Employee(9,"MK"));
	empController.insert(new Employee(36,"RTSV"));
	empController.insert(new Employee(35,"Jsjaj"));
	
		
	}

}
