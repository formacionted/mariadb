package com.telefonica.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Example of mariadb database configuration
 * Look at application.properties and pom.xml
 */
@SpringBootApplication
public class MariadbApplication implements CommandLineRunner{

	@Autowired
	private ProductRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(MariadbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product product1 = new Product();	
		product1.setName("Nike");
		repository.save(product1);
	}

}
