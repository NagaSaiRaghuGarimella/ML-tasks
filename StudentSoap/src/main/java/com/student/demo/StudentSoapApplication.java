package com.student.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.student"})
public class StudentSoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentSoapApplication.class, args);
	}

}
