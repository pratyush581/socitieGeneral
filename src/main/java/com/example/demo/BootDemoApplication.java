package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.DepartmentRepository;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class BootDemoApplication {
	@Autowired
	UserRepository userRepository;
	@Autowired
	DepartmentRepository deptTRepository;

	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){
		
	}
}
