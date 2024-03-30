package com.springboot.learning.jpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learning.jpa.jdbc.Employee;
import com.springboot.learning.jpa.jdbc.EmployeeJDBCRepository;
import com.springboot.learning.jpa.jdbc.EmployeeList;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeJDBCRepository empRepo;
	
	@RequestMapping("/insertEmployee")
	public String empInsert(@RequestParam long id,@RequestParam String name, @RequestParam String city) {
		return empRepo.insertOneEmployee(new Employee(id,name,city));
		
	}
	
	@RequestMapping("/deleteEmployee")
	public String empDelete(@RequestParam long id) {
		return empRepo.deleteByID(id);
	}
	
	
	
}
