package com.classwork3.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.classwork3.demo.model.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}