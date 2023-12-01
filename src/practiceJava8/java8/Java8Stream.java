package practiceJava8.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Stream {
	
	static List<Employee> employeeList = new ArrayList<Employee>();
	
	public static void main(String args[])
	{
		employeeList.add(new Employee(11, "Pallavi", 26, "Female", "HR", 2011, 60000.0));
		employeeList.add(new Employee(22, "Raj", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(23, "Reena", 35, "Female", "Sales And Marketing", 2016, 13500.0));
		employeeList.add(new Employee(33, "Shiv", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(44, "Shakti", 28, "Female", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(55, "Shivam", 21, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(66, "Rajesh", 25, "Male", "Product Development", 2016, 22500.0));
		employeeList.add(new Employee(77, "radhika", 27, "Female", "HR", 2017, 22700.0));
		
		
		//Q1 : How many male and feamle employee are there in the oraganization
		    // getNoOfMaleFemaleCount();
		    // System.out.println("\n");
	    
	   // Q2 : Print the name of all departments in the organization?
		    // printAllDepartment();
		    // System.out.println("\n");
		     
	   // Q3 : What is the average age of male and female employees?     
		   //  averageAgeOfEmp();
		   //  System.out.println("\n");
		
	  // Q4 : Get the details of highest paid employee in the organization?
			 // getHighestPaidEmp();
			//  System.out.println("\n");
			  
	  // Q5 : Get the names of all employees who have joined after 2015?
			//getEmpNameWhoJoinedAfter2015();
			//System.out.println("\n");
			
	  // Q6 : Count the number of employees in each department?
	       // countEmployeeEachDep();
	        //System.out.println("\n");
	        
	  // Q7 : What is the average salary of each department?
			//avgSalaryOfEachDep();
			//System.out.println("\n");
		
	 // Q8 : Get the Name and Age of youngest male employee in the product development department?
			//getYoungestEmpInPrdDev();
			//System.out.println("\n");
		
	// Q9 : Who has the most working experience in the organization?
		  //  getWhoMostWorkExpOrg();
		    //System.out.println("\n");
		
   // Q10 : How many male and female employees are there in the sales and marketing team?
			//countOfMaleFemaleEmployee();
			//System.out.println("\n");
		
   // Q11 : What is the average salary of male and female employees?
			//getAvgSalOfMaleAndFemaleEmp();
			//System.out.println("\n");
		
   // Q12 : List down the names of all employees in each department?
		    //getEmpListByDept();
		   // System.out.println("\n");
		    
  // Q13  : What is the average salary and total salary of the whole organization?
	       // avgSalAndTotlaSal();
	      //System.out.println("\n");
		
  // Q14  : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
		    // method14();
		     //System.out.println("\n");
		
 // Q15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
		     method15();
		     System.out.println("\n");
		     
	}
	
		public static void getNoOfMaleFemaleCount()
		{
			System.out.println("Q1 : How many male and feamle employee are there in the oraganization?");
			Map<String, Long> noOfMaleFemaleCount = employeeList.stream()
			.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
			
			System.out.println(noOfMaleFemaleCount);
			
		}
		public static void printAllDepartment()
		{
			 System.out.println("Q2 : Print the name of all departments in the organization?");
			 employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		}
		public static void averageAgeOfEmp()
		{
			System.out.println("Q3 : What is the average age of male and female employees? ");
			Map<String, Double> averageAgeOfEmp = employeeList.stream()
			.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
			System.out.println(averageAgeOfEmp);
		}
		public static void getHighestPaidEmp()
		{
			System.out.println("Q4 : Get the details of highest paid employee in the organization? ");
			Optional<Employee> getHighestPaidEmp = employeeList.stream()
			.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
			
			System.out.println(getHighestPaidEmp.get().getDepartment()+" "+getHighestPaidEmp.get().getName()+"  "+getHighestPaidEmp.get().getSalary());
		}
		
		public static void getEmpNameWhoJoinedAfter2015()
		{
			System.out.println("Q5 : Get the names of all employees who have joined after 2015? ");
			employeeList.stream()
			.filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);
		}
		
		public static void countEmployeeEachDep()
		{
			System.out.println("Q6 : Count the number of employees in each department? ");
			
			Map<String, Long> countEmployeeEachDep = employeeList.stream()
			.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
			
			Set<Entry<String, Long>> entrySet = countEmployeeEachDep.entrySet();
			System.out.println(countEmployeeEachDep);
			System.out.println("\n");
			for(Entry<String, Long> eset:entrySet)
			{
				System.out.println(eset.getKey()+" : "+eset.getValue());
			}
			
		}
		
		public static void avgSalaryOfEachDep()
		{
			System.out.println("Q7 : What is the average salary of each department? ");
			Map<String, Double> avgSalaryOfEachDep = employeeList.stream()
			.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
			
			Set<Entry<String, Double>> entrySet = avgSalaryOfEachDep.entrySet();
			System.out.println(avgSalaryOfEachDep);
			System.out.println("\n");
			for(Entry<String, Double> enSet:entrySet)
			{
				System.out.println(enSet.getKey()+" : "+enSet.getValue());
			}
		}
		
		public static void getYoungestEmpInPrdDev()
		{
			System.out.println("Q8 : Get the Name and Age of youngest male employee in the product development department?");
			Optional<Employee> getYoungestEmpInPrdDev = employeeList.stream()
			.filter(e -> e.getDepartment().equals("Product Development") && e.getGender().equals("Male"))
			.collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge)));
			
			Employee newEmployee=getYoungestEmpInPrdDev.get();
			System.out.println("Name and Age of youngest male employee in the product development department");
			System.out.println("========================================================================");
			System.out.println("Name of Employee :"+newEmployee.getName()+"\n Age of Employee : "+newEmployee.getAge() );
			
		}
		public static void getWhoMostWorkExpOrg()
		{
			System.out.println("Q9 : Who has the most working experience in the organization?");
			Optional<Employee> getWhoMostWorkExpOrg = employeeList.stream()
			.sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
			
			Employee emp=getWhoMostWorkExpOrg.get();
			System.out.println("Senior most employee details :");
			System.out.println("Name :"+emp.getName()+"\n Id :"+emp.getId());
		}
		public static void countOfMaleFemaleEmployee()
		{
			System.out.println("Q10 : How many male and female employees are there in the sales and marketing team?");
			
			Map<String, Long> countOfMaleFemaleEmployee = employeeList.stream()
			.filter(e -> e.getDepartment().equals("Sales And Marketing"))
			.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
			
			System.out.println(countOfMaleFemaleEmployee);
		}
		public static void getAvgSalOfMaleAndFemaleEmp()
		{
			System.out.println("Q11 : What is the average salary of male and female employees?");
			
			Map<String, Double> getAvgSalOfMaleAndFemaleEmp = employeeList.stream()
			.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
			
			System.out.println(getAvgSalOfMaleAndFemaleEmp);
		} 
		
		public static void getEmpListByDept()
		{
			System.out.println("Q12 : List down the names of all employees in each department?");
			Map<String, List<Employee>> getEmpListByDept = employeeList.stream()
			.collect(Collectors.groupingBy(Employee::getDepartment));
			
			Set<Entry<String, List<Employee>>> entrySet = getEmpListByDept.entrySet();
			for(Entry<String, List<Employee>> eSet :entrySet)
			{
				System.out.println("============================================");
				
				System.out.println("Employees in "+eSet.getKey()+" :");
				
				System.out.println("============================================");
				
				List<Employee> empList=eSet.getValue();
				
				for(Employee list :empList)
				{
					System.out.println("Employee Name :"+list.getName());
				}
			}
		}
		public static void avgSalAndTotlaSal()
		{
			System.out.println("Q13  : What is the average salary and total salary of the whole organization?");
			DoubleSummaryStatistics avgSalAndTotlaSal = employeeList.stream()
			                                                        .collect(Collectors.summarizingDouble(Employee::getSalary));
			System.out.println("Average salary of employee : "+avgSalAndTotlaSal.getAverage());
			System.out.println("Total   salary of employee : "+avgSalAndTotlaSal.getSum());
		}
		
		public static void method14()
		{
			System.out.println("Q14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");
			Map<Boolean, List<Employee>> collect = employeeList.stream()
			.collect(Collectors.partitioningBy(e -> e.getAge() > 25));
			
			Set<Entry<Boolean, List<Employee>>> enSet = collect.entrySet();
			
			for(Entry<Boolean, List<Employee>> emp:enSet)
			{
				System.out.println("================================================");
				if(emp.getKey())
				{
					System.out.println("Employee older than 25 years :");
				}else
				{
					System.out.println("Employee younger than or equal to 25 year :");
				}
				System.out.println("===============================================");
				
				List<Employee> list = emp.getValue();
				
				for(Employee e:list)
				{
					System.out.println(e.getName());
				}
			}
		}
		public static void method15()
		{
			System.out.println("Q15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?");
			Optional<Employee> oldestEmp = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
			
			Employee employee = oldestEmp.get();
			
			System.out.println("=======================================================");
			System.out.println("Oldest employee name : " +employee.getName());
			System.out.println("Oldest employee age : " +employee.getAge());
			System.out.println("Oldest employee department : " +employee.getDepartment());
			System.out.println("=======================================================");
		}
	}

	class Employee {
		int id;

		String name;

		int age;

		String gender;

		String department;

		int yearOfJoining;

		double salary;

		public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
			this.id = id;
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.department = department;
			this.yearOfJoining = yearOfJoining;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public String getGender() {
			return gender;
		}

		public String getDepartment() {
			return department;
		}

		public int getYearOfJoining() {
			return yearOfJoining;
		}

		public double getSalary() {
			return salary;
		}

		@Override
		public String toString() {
			return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
					+ department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
		}
}
