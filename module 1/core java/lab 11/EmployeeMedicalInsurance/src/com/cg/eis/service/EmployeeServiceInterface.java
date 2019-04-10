package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeServiceInterface {
	public String addEmployee(Employee e);
	public String getInsuranceScheme(int salary, String designation);
	public Employee getDetails(int id);

}
