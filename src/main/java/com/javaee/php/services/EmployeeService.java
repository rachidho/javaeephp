package com.javaee.php.services;

import java.util.List;

import com.javaee.php.entites.Employee;

public interface EmployeeService {
	
	List<Employee> listEmployee();
	
	int countListEmployee();

}
