package com.service;
/**
 * @author Akshay Kumar Modi
 */
import java.util.List;

import com.bean.Employee;

public interface EmployeeServiceInterface {
	
	public double totalSalary();
	public List<Employee> getEmpsWithoutDept();

}
