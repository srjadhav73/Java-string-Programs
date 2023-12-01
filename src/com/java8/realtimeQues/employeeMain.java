package com.java8.realtimeQues;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class employeeMain {
	
	public static void main(String args[])
	{
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee("ABC",22,"Male","HR"));
		emp.add(new Employee("PQR",24,"Female","IT"));
		emp.add(new Employee("LMN",21,"Female","HR"));
		emp.add(new Employee("XYZ",29,"Male","IT"));
		
	  //Q1.Find Distinct Department
		System.out.println("Q1 : Find Distinct Department ");
	                  emp.stream()
	                     .map(Employee::getDepartment).distinct().forEach(System.out::println);
	    
	    System.out.println("--------------------------------------------------------------");
	    
	  //Q2.Find employee count each department
	    System.out.println("Q2.Find employee count each department");
	    
	    Map<String, Long> empCount = emp.stream()
			   						    .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
	    System.out.println(empCount);
	    System.out.println("--------------------------------------------------------------");
	    
	 //Q3.Find average age of employee
	    
	   System.out.println("Q3.Find average age of employee");
	   Map<String, Double> avgAgeEmp = emp.stream()
			                              .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingLong(Employee::getAge)));
	   System.out.println(avgAgeEmp);  
	    
	    
		
	}

}
