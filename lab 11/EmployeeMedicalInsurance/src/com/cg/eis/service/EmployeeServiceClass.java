package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import com.cg.eis.dao.EmployeeDaoClass;

public class EmployeeServiceClass implements EmployeeServiceInterface {
	EmployeeDaoClass e1=new EmployeeDaoClass();

	@Override
	public String addEmployee(Employee e) {
		if(e==null )
		{
			return "invalid data";
		}
		else {
			return e1.addEmployee(e);
		}
		
	}

	@Override
	public String getInsuranceScheme(int salary, String designation) {
		if(salary==0 || designation==null)
		{
			return "invalid data";
		}
		else {
			return e1.getInsuranceScheme(salary,designation);
		}
	}

	@Override
	public Employee getDetails(int id) {
		
		if(id==0)
		{
			return null;
		}
		else
		{
			return e1.getDetails(id);
		}
	}
	
	
	

}
