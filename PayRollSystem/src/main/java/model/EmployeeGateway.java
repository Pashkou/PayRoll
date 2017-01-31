package model;

import java.util.Arrays;
import java.util.List;

public class EmployeeGateway {
	
	private static Employee employee = new Employee.Builder("Siarhei", "Pashkou").build(); 
	
	public static Employee getEmployee(){
		return employee;
	}
	
	public static List<Employee> getAllEmployees(){
		return Arrays.asList(employee);
	}
	
	private EmployeeGateway(){}
}
