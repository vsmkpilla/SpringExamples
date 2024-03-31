package com.springboot.learning.SpringDataJPA.empdetails.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
