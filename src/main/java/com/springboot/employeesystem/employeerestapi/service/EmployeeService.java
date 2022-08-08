package com.springboot.employeesystem.employeerestapi.service;

import java.util.List;

import com.springboot.employeesystem.employeerestapi.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(int id);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int id);
	
}
