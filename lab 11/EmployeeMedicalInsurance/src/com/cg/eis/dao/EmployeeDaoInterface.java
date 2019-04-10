package com.cg.eis.dao;

import com.cg.eis.bean.Employee;

public interface EmployeeDaoInterface {
	
	public String addEmployee(Employee e);
	public String getInsuranceScheme(int salary, String designation);
	public Employee getDetails(int id);
}
