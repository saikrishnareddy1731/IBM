package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.AccountDao;
import com.example.demo.model.Account;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCIientExampleApplication implements CommandLineRunner {

	private AccountDao dao;
	@Autowired
	public SpringCIientExampleApplication(AccountDao dao) {
		super();
		this.dao = dao;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCIientExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		dao.save(new Account("20000"));
		dao.save(new Account("25000"));
		dao.save(new Account("30000"));
		dao.save(new Account("35000"));
		dao.save(new Account("40000"));
		
	}

}
