package com.greatdigitallab.springbootcruddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatdigitallab.springbootcruddemo.entity.Employee;
import com.greatdigitallab.springbootcruddemo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int id) {
		Optional<Employee> dbEmployee = employeeRepository.findById(id);
		Employee employee = null;
		
		// check for null
		if(dbEmployee.isPresent()) {
			employee = dbEmployee.get();
		}else {
			throw new RuntimeException("Did not find id : " + id);
		}
		
		return employee;
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void deleteById(int id) {
		employeeRepository.deleteById(id);
	}
}