package in.ibm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.ibm.demo.service.ProductService;

@SpringBootApplication
public class SpringThymeLeafDemoApplication {


	public static void main(String[] args){
		SpringApplication.run(SpringThymeLeafDemoApplication.class, args);
	}

}
