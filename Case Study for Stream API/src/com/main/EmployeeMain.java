package com.main;
/**
 * @author Akshay Kumar Modi
 */
import com.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeService e1=new EmployeeService();
		System.out.println(e1.totalSalary());
		System.out.println(e1.getEmpsWithoutDept());

	}

}
