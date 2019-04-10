package com.cg.eis.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.Employee;

public class EmployeeDaoClass implements EmployeeDaoInterface{
	List<Employee> li=new ArrayList<Employee>();

	@Override
	public String addEmployee(Employee e) {

		li.add(e);
		return "Employee Added";
	}

	@Override
	public String getInsuranceScheme(int salary, String designation) {
		if(designation=="System Associate" && (salary>5000 && salary <20000))
		{
			return "Scheme C";
		}
		else
			if(designation=="Programmer" && (salary>=20000 && salary <40000))
			{
				return "Scheme B";
			}
			else
				if(designation=="Manager" && salary>=40000)
				{
					return "Scheme A";
				}
				else if(designation=="Clerk" && salary<5000)
				{
					return "No Scheme";
				}
		
	
		return null;
	}

	@Override
	public Employee getDetails(int id) {
		// TODO Auto-generated method stub
		Employee emp=null;
		for(Employee e:li)
		{
			if(e.getId()==id)
			{
				emp=e;
			}
		}
		return emp;
	}
	

}
