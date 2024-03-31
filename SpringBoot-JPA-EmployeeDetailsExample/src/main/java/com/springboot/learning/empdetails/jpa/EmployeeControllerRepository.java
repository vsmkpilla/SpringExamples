package com.springboot.learning.empdetails.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class EmployeeControllerRepository {
	
	@PersistenceContext
	private EntityManager emanager;
	
	
	
	public void insert(Employee emp) {
		
		emanager.merge(emp);
		System.out.println("Insert Exeecuted");
	}
	
	public Employee findByID(long id) {
		return emanager.find(Employee.class,id);
	}
	
	public void removeByID(long id) {
		Employee emp = findByID(id);
		emanager.remove(emp);
	}


	
	
	
	
}
