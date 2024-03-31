package com.springboot.learning.SpringDataJPA.empdetails;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learning.SpringDataJPA.empdetails.entity.Employee;
import com.springboot.learning.SpringDataJPA.empdetails.entity.EmployeeRepository;

@Component
public class EmployeeCommandLineRunner implements CommandLineRunner {

	@Autowired
	EmployeeRepository empRepository;
	@Override
	public void run(String... args) throws Exception {
		
	empRepository.save(new Employee(10,"Mani"));
	empRepository.save(new Employee(11,"MK"));
	empRepository.save(new Employee(12,"VS"));
	empRepository.save(new Employee(13,"MMM"));
	
	}
	
	

}
