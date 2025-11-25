package InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// MaxSalaryExample
/*
Employee {John, Mathew, Sam, Paul, Grahm} 
Salary {20000,30000,40000,50000,35000}
*/
public class Capgemini {

	public static void main(String[] args) {
		
		// Given Employees names 
		List<String> employees = Arrays.asList("John", "Mathew", "Sam", "Paul", "Grahm");
		
		// Given Salaries
		List<Integer> salaries = Arrays.asList(20000, 30000, 40000, 50000, 35000);
		
		// Finding max salary
		int maxSalary = Collections.max(salaries);
		
		// Finding Employee with max salary
		int index = salaries.indexOf(maxSalary);
		String employeeName = employees.get(index);
		
		// Output
		System.out.println("Maximum Salary : " + maxSalary);
		System.out.println("Employee with Maximum Salary : " + employeeName);
	}
}
