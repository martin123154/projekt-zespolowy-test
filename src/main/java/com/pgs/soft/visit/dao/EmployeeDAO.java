
package com.pgs.soft.visit.dao;

import java.util.List;

import com.pgs.soft.visit.domain.Employee;

public interface EmployeeDAO {
   
	   public void addEmployee(Employee employee);
	   public List<Employee> getEmployees();
	}