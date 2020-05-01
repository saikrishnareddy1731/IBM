package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Employee;
import com.example.demo.model.MyUser;
import com.example.demo.service.EmployeeService;


@Controller
public class RegisterController {

	@Autowired
	private JdbcUserDetailsManager jdbcDetailsManager;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Autowired
	private EmployeeService service;
	@PostMapping("/register")
	public String registerUser(MyUser myUser)
	{
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(myUser.getRoles()));
		String encodedPassword = passwordEncoder.encode(myUser.getPassword());
		User obj = new User(myUser.getUserName(),encodedPassword,authorities);
		jdbcDetailsManager.createUser(obj);
		return "userCreated";
		
	}
	 @RequestMapping("/user1/new")
	    public String newProduct(Model model){
	        model.addAttribute("myUser", new MyUser());
	        return "userForm";
	    }
	 
	 @GetMapping(value = "/admin/add")
		public String add(Model model) {
			model.addAttribute("employee",new Employee());
			return "employeeForm";
		}
	 @PostMapping(value = "/addEmployee")
	 public String RegisterEmployee(Employee employee)
	 {
		 service.addEmployee(employee);
		 return "employeeAdded";
	 }
}

