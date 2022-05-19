package com.example.JenkinDocker.ServiceImp;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JenkinDocker.Dao.EmployeeDao;
import com.example.JenkinDocker.Entity.Employee;
import com.example.JenkinDocker.Service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public List<Employee> allEmployee() {
		
		return dao.findAll();
	}

	@Override
	public Employee employeeById(int empId) {
		Employee e=dao.findById(empId).get();
		
		return e;
	}

	@Override
	public Employee addEmployee(Employee emp) {
	
		Employee entity=dao.save(emp);
		return entity; 
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		
		Employee e=dao.save(emp);
		return e;
	}

	@Override
	public Employee delete(int empId) {
		
		Employee emp=dao.findById(empId).get();
		dao.delete(emp);
		
		return emp;
		
		
	}

}
