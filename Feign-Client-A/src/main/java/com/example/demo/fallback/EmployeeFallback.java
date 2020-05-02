package com.example.demo.fallback;
import org.springframework.stereotype.Component;

import com.example.demo.client.Employeeclient;
@Component
public class EmployeeFallback implements Employeeclient{

	@Override
	public String callHi(String name) {
		// TODO Auto-generated method stub
		return "<p>service is currently not available come back later<p>";
	}

}