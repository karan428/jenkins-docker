package com.example.JenkinDocker.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.JenkinDocker.Entity.Employee;

public interface EmployeeDao  extends JpaRepository<Employee,Integer>{

	
}
