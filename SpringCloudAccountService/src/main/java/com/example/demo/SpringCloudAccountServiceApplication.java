package com.example.demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.AccountDao;
import com.example.demo.model.Account;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudAccountServiceApplication implements CommandLineRunner 
{

	private AccountDao dao;
	@Autowired
	@Value("${server.port}")
	private String port;
	public SpringCloudAccountServiceApplication(AccountDao dao) 
	{
		super();
		this.dao = dao;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAccountServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		dao.save(new Account(123,UUID.randomUUID().toString(),port));
		dao.save(new Account(124,UUID.randomUUID().toString(),port));
	}

}
