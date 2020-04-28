package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.ProductsDao;
import com.example.demo.model.Products;

@SpringBootApplication
public class SpringThymeleafDemo1Application implements CommandLineRunner {

	private ProductsDao dao;
	@Autowired
	public SpringThymeleafDemo1Application(ProductsDao dao) {
		super();
		this.dao = dao;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringThymeleafDemo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		dao.save(new Products("Shoes",2700,"shoes.jpg"));
		dao.save(new Products("laptop",40000,"laptop.jpg"));
		dao.save(new Products("Earphones",1500,"eaphones.jpg"));
		dao.save(new Products("Shirt",2700,"Shirt.jpg"));
	}

}
