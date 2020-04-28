package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.ImageDao;
import com.example.demo.model.Image;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudImageServiceDemoApplication implements CommandLineRunner {

	@Value("${server.port}")
	String port;
	private ImageDao dao;
	@Autowired
	public SpringCloudImageServiceDemoApplication(ImageDao dao) {
		super();
		this.dao = dao;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudImageServiceDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub
		dao.save(new Image("abc","abc.jpg",port));
		dao.save(new Image("xyz","xyz.jpg",port));
	}

}
