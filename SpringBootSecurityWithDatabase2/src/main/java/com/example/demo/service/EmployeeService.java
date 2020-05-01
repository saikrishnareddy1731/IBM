package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee getEmployee(int id);
	public void deleteEmployee(int id);

	
}
