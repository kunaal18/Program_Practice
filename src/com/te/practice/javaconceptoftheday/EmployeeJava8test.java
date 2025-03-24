package com.te.practice.javaconceptoftheday;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeJava8test {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Twinkle Singh", 32, "Female", "Product Development", 2011, 250000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Amelia Zoe", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Murali Gowda", 31, "Male", "Product Development", 2012, 35700.0));

		System.out.println("\n1--> How many male and female employees are there in the organization?\n");
		// write code here
		employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).entrySet()
				.forEach(System.out::println);

		System.out.println("\n2--> Print the name of all departments in the organization?\n");
		// write code here
		List<String> list = employeeList.stream().distinct().map(i -> i.getDepartment()).toList();
		System.out.println(list);

		System.out.println("\n3-->  What is the average age of male and female employees?\n");
		// write code here

		System.out.println("\n4--> Get the details of highest paid employee in the organization?\n");
		// write code here

		System.out.println("\n5--> Get the names of all employees who have joined after 2015?\n");

		System.out.println("\n6--> Count the number of employees in each department?\n");

		System.out.println("\n7--> What is the average salary of each department?\n");

		System.out
				.println("\n8-->  Get the details of youngest male employee in the product development department?\n");

		System.out.println("\n9-->  Who has the most working experience in the organization?\n");

		System.out.println("\n10-->  How many male and female employees are there in the sales and marketing team?\n");

		System.out.println("\n11--> What is the average salary of male and female employees?\n");

		System.out.println("\n12--> List down the names of all employees in each department?\n");

		System.out.println("\n13--> What is the average salary and total salary of the whole organization?\n");

		System.out.println(
				"\n14--> Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.\n");

		System.out.println("\n15---Write a code to print dublicate employee name count from Employee List \n");

		// using for loop
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (Employee emp : employeeList) {
			if (map.containsKey(emp.getName())) {
				map.put(emp.getName(), map.get(emp.getName()) + 1);
			} else {
				map.put(emp.getName(), 1);
			}
		}
		System.out.println(map);

		System.out.println("\nWrite a code to find nth highest salary\n");
		int n = 3;

		Employee employee4 = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.distinct().skip(3 - 1).findFirst().get();
		System.out.println(employee4);
	}

}
