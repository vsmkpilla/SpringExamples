package com.springboot.learning.jpa.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;


@Repository
public class EmployeeJDBCRepository {

	
	@Autowired
	private JdbcTemplate empJdbcTemplate;
	
	private String INSERT_QUERY =
			"""
			insert into EMPLOYEE(ID,NAME,CITY) values(?,?,?);
			
			""";
	private String DELETE_QUERY =
			"""
			delete from EMPLOYEE where id = ?;
			
			""";
	private String SELECT_QUERY_ByID = 
			"""
			select * from EMPLOYEE where id = ?;
			""";
	
	private String SELECT_QUERY = 
			"""
			select * from EMPLOYEE where id = ?;
			""";
	
	
	
	public Employee selctByID(long id) {
		
		return empJdbcTemplate.queryForObject(SELECT_QUERY_ByID,new BeanPropertyRowMapper<>(Employee.class),id);
	}
	
	
	public void insertListOfEmployees(List<Employee> employeeList) {
		
	for(Employee e:employeeList) {
		empJdbcTemplate.update(INSERT_QUERY,e.getId(),e.getName(),e.getCity());
	}
	}
	
	public String insertOneEmployee(Employee employee) {
		empJdbcTemplate.update(INSERT_QUERY,employee.getId(),employee.getName(),employee.getCity());
		return "Inserted";
	}
	
	public String deleteByID(long id) {
		empJdbcTemplate.update(DELETE_QUERY,id);
		return "Deleted";
	} 
	
	


	
}
