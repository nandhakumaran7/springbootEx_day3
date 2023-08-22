package com.classwork3.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.classwork3.demo.model.Employee;
import com.classwork3.demo.repository.EmployeeRepo;

@Service
public class ApiService {
	@Autowired
	EmployeeRepo er;
	
	public Employee saveinfo(Employee e)
	{
		return er.save(e);
	}
	
	public List<Employee> showinfo()
	{
		return er.findAll();
	}

	public Employee getEmployeeById(Long id) {
		Optional<Employee> employeeOptional = er.findById(id);
        return employeeOptional.orElse(null);
	}
}