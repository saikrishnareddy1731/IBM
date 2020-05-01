package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao;
	@Autowired
	public EmployeeServiceImpl(EmployeeDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return (List<Employee>) dao.findAll();

	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}
