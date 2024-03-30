package com.springboot.learning.jpa.jdbc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component
public class EmployeJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private EmployeeJDBCRepository empjdbcrepository;
	@Override
	public void run(String... args) throws Exception {
		
		empjdbcrepository.insertListOfEmployees(
				Arrays.asList(new Employee(1, "ManiKanta", "East"),
						new Employee(2, "ManiKaa", "Eas"),
						new Employee(3, "Manita", "Eat"))
				);
		empjdbcrepository.deleteByID(2);
		System.out.print(empjdbcrepository.selctByID(1));
		
	}

}
