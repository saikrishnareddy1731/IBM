package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

	/*
	 * public Employee addEmployee(Employee employee); public List<Employee>
	 * getAllEmployee(); public Employee getEmployee(int id); public void
	 * deleteEmployee(int id);
	 */
}
