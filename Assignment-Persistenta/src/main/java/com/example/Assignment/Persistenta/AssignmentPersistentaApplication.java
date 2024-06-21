package com.example.Assignment.Persistenta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class AssignmentPersistentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentPersistentaApplication.class, args);
	}

}
