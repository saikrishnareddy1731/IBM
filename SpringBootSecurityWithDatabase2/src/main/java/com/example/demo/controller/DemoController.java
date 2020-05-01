package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class DemoController {

	private EmployeeService service;
	@Autowired
	public DemoController(EmployeeService service) {
		super();
		this.service = service;
	}
	@GetMapping(value = "/admin/emp")
	public String test() {
		return "hello";
	}

	@PostMapping(value = "/admin/add")
	public Employee add(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	@GetMapping(value = "/admin/employees")
	public List<Employee> getEmployeesAdmin() {
		return service.getAllEmployee();
	}

	@GetMapping(value = "/admin/employee/{id}")
	public Employee getEmployeeAdmin(@PathVariable("id")int id) {
		return service.getEmployee(id);
	}

	@GetMapping(value = "/user/employees")
	public List<Employee> getEmployees() {
		return service.getAllEmployee();
	}

	@GetMapping(value = "/user/employee/{id}")
	public Employee getEmployee(@PathVariable("id")int id) {
		return service.getEmployee(id);
	}
	
	@PutMapping("/admin/employee")
	public Employee update(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	
	@DeleteMapping("/admin/employee/{id}")
	public void deleteEmployee(@PathVariable("id")int id)
	{
		service.deleteEmployee(id);
	}
}
