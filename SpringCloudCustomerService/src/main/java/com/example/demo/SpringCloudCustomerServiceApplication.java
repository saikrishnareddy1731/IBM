package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.Customer;
import com.example.demo.model.CustomerType;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudCustomerServiceApplication implements CommandLineRunner {

	private CustomerDao dao;
	@Autowired
	public SpringCloudCustomerServiceApplication(CustomerDao dao) {
		super();
		this.dao = dao;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCustomerServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		dao.save(new Customer("ABC",CustomerType.INDIVIDUAL));
		dao.save(new Customer("XYZ",CustomerType.COMPANY));
	}

}
