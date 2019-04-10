package main;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceClass;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeServiceClass eservice = new EmployeeServiceClass();
		Employee emp=new Employee(11,"akshay",45000,"Manager","");
		System.out.println(eservice.addEmployee(emp));
		System.out.println(eservice.getInsuranceScheme(45000,"Manager"));
		System.out.println(eservice.getDetails(11));

	}

}
