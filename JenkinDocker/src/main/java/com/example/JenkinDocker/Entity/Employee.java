package com.example.JenkinDocker.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int empId;
	private String name;
	private String email;
	private int mobile;
	private String password;
	public Employee() {
		super();
		
	}
	public Employee(int empId, String name, String email, int mobile, String password) {
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getMobile() {
		return mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
