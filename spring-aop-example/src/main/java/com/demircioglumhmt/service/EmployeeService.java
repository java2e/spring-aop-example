package com.demircioglumhmt.service;

import org.springframework.stereotype.Service;

import com.demircioglumhmt.model.Employee;

@Service
public class EmployeeService {

	
	private Employee employee;
	
	
	public Employee getEmployee()
	{
		return this.employee;
	}
	
	public void setEmployee(Employee employee)
	{
		this.employee=employee;
	}
	
	
}
