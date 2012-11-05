package com.javaee.php.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.javaee.php.dao.EmployeeDao;
import com.javaee.php.entites.Employee;

public class EmployeeImpl implements EmployeeDao {

	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Employee> listEmployee() {
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

}
