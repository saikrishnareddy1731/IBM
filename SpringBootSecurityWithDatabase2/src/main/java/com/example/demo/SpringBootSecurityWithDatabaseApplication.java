package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@SpringBootApplication
public class SpringBootSecurityWithDatabaseApplication implements CommandLineRunner {

	@Autowired
	private EmployeeDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityWithDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * dao.addEmployee(new Employee(111,"abc","abc@gmail.com")); dao.addEmployee(new
		 * Employee(222,"xyx","xyz@gmail.com")); dao.addEmployee(new
		 * Employee(333,"pqr","pqr@gmail.com"));
		 */
	}

}
