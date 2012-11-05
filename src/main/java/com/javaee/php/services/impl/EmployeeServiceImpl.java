package com.javaee.php.services.impl;

import java.util.List;

import javax.inject.Inject;

import com.javaee.php.dao.EmployeeDao;
import com.javaee.php.entites.Employee;
import com.javaee.php.services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Inject
	private EmployeeDao employeeDAO;
	
	
	
	public EmployeeServiceImpl() {
	}

	public List<Employee> listEmployee() {
		return employeeDAO.listEmployee();
	}
	
	public int countListEmployee() {
		//List<Employee> list = employeeDAO.listEmployee();
		return 233;
	}


}
