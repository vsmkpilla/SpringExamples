package com.springboot.learning.jpaclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeRepository {
	
	@PersistenceContext
	private EntityManager emanager;
	
	public void insert(Employee e) {
		emanager.merge(e);
	}
	

}
