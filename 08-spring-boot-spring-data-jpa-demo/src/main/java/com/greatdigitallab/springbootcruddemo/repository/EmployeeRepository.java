package com.greatdigitallab.springbootcruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatdigitallab.springbootcruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
