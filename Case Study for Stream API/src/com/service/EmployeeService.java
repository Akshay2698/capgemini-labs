package com.service;
/**
 * @author Akshay Kumar Modi
 */
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.bean.Employee;
import com.dao.EmployeeRepository;

public class EmployeeService implements EmployeeServiceInterface {

	
	@Override
	public double totalSalary() {
		List<Employee> li=EmployeeRepository.getEmployees();
		List<Double>  sal=li.stream().map(em->em.getSalary()).collect(Collectors.toList());
		Optional<Double> total=sal.stream().reduce((a,b)->a+b);
		return total.get();
	}

	@Override
	public List<Employee> getEmpsWithoutDept() {
		List<Employee> li2=EmployeeRepository.getEmployees();
		
		
		return li2;
	}
	
	
	
	
}
