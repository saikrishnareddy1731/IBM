package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulClientDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(ConsulClientDemo1Application.class, args);
	}

}
