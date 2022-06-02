package com.example.JenkinDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.JenkinDocker.Entity.Employee;



@SpringBootApplication
public class JenkinDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinDockerApplication.class, args);
	}
	
	@Bean
	public Employee employee()
	{
		return new Employee();
	}

}
