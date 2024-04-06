package com.springboot.learning.SpringDataJPA.empdetails.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	//We can create user defined methods as well
	Employee findByName(String name);

}
