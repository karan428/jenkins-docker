package com.example.JenkinDocker.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JenkinDocker.Entity.Employee;
import com.example.JenkinDocker.Service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/start")
	public void start()
	{
		System.out.println("Welcome to Employee server");
	}
	
	@GetMapping("/allemployee")
	public List<Employee> allEmployee()
	{
		return this.service.allEmployee();
	}
	
	@GetMapping("/employee/{empId}")
	public Employee employeeById(@PathVariable int empId)
	{
		
		return this.service.employeeById(empId);
	}
	
	@PostMapping("/addemployee")
	public Employee addUser(@RequestBody Employee emp)
	{
		return this.service.addEmployee(emp);
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee e)
	{
		return this.service.updateEmployee(e);
	}
	
	@DeleteMapping("/delete/{empId}")
	public Employee deleteEmployee(@PathVariable int empId)
	{
		return this.service.delete(empId);
	}
	
}

