package com.example.JenkinDocker.Service;

import java.util.List;

import com.example.JenkinDocker.Entity.Employee;

public interface EmployeeService {
	public List<Employee> allEmployee();
	public Employee employeeById(int empId);
	public Employee addEmployee(Employee emp);
	public Employee updateEmployee(Employee emp);
	public Employee delete(int empId);


}
