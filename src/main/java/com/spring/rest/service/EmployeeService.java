package com.spring.rest.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.rest.model.Employee;
import com.spring.rest.repository.EmployeeRepository;
import com.spring.rest.repository.RoleRepository;

@Service
public class EmployeeService {
	private EmployeeRepository employeeRepository;
	private RoleRepository roleRepository;
	public EmployeeService(EmployeeRepository employeeRepository, RoleRepository roleRepository) {
		this.employeeRepository = employeeRepository;
		this.roleRepository = roleRepository;
	}
	
//	Create New Employee
	public ResponseEntity<?> createEmployee(Employee model)
	{
		Employee employee;
		if(employeeRepository.findByEmail(model.getEmail()).isPresent())
		{
			return ResponseEntity.badRequest().body("Email already present, failed to create new user.");
		}
		else
		{
			
			
			return ResponseEntity.badRequest().body("Email already present, failed to create new user.");
		}
		
	}
	

}
