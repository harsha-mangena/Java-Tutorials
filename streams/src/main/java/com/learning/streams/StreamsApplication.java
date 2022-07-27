package com.learning.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.learning.streams.Entities.Employee;
import com.learning.streams.Enums.Gender;
import com.learning.streams.Enums.Level;

public class StreamsApplication {

	public static void main(String[] args) {

		//Filter
		List<Employee> employees = new ArrayList<>();
		{
			employees.add(new Employee("Harsha", "Andhra Pradesh", Gender.MALE, Level.L1, (float)1000000));
			employees.add(new Employee("John", "Telangana", Gender.MALE, Level.L1, (float)1000000));
			employees.add(new Employee("Maxwell", "Madhya Pradesh", Gender.MALE, Level.L2, (float)1800000));
			employees.add(new Employee("Maharshi", "Andhra Pradesh", Gender.MALE, Level.M1, (float)3000000));
			employees.add(new Employee("Hasini", "Uttar Pradesh", Gender.FEMALE, Level.L3, (float)2400000));
			employees.add(new Employee("Arundathi", "Telangana", Gender.FEMALE, Level.L3, (float)2400000));
			employees.add(new Employee("Devasena", "Telangana", Gender.FEMALE, Level.M3, (float)4000000));
			employees.add(new Employee("Lahari", "Andhra Pradesh", Gender.FEMALE, Level.M1, (float)2600000));
		}

		// for(Employee employee : employees){
		// 	System.out.println(employee);
		// }

		/**
		 * forEach used to print all the employees we created
		 */

		System.out.println("\n Printing using forEach"); 
		employees.forEach(employee -> System.out.println(employee));

		/**
		 * MAP 
		 * Using Filer to get only employyeeNames
		 */
		System.out.println("\nGetting all employees names");
		List<String> employeeNames = employees.stream()
		                                      .map(Employee::getEmpName)
											  .collect(Collectors.toList());
		
		employeeNames.forEach(employee -> System.out.println(employee));

		/**
		 * FILTER
		 * Getting the list of employees with distinct salary.
		 */
		System.out.println("\nEmployees with salary greater than 15 Lakhs");
		List<String> EmployeeSalaryGreaterThan15L = employees.stream()
		                              .filter(employee -> employee.getEmpSalary() > 1500000.00)
									  .map(Employee::getEmpName)
									  .collect(Collectors.toList());

		EmployeeSalaryGreaterThan15L.forEach(employeeName -> System.out.println(employeeName));

		/**
		 * Getting all female employess.
		 * Similarly goes for the men.
		 */
		System.out.println("Printing all female employees");
		List<Employee> femaleEmployees = employees.stream()
		                                          .filter(employee -> employee.getEmpGender().equals(Gender.FEMALE))
												  .collect(Collectors.toList());

		femaleEmployees.forEach(employee -> System.out.println(employee.toString()));

		/**
		 * allMatch -> Boolean, if any object instance satisfies the condition.
		 */

		 System.out.print("If any employee from delhi");
		 boolean isFromDelhi = employees.stream()
		                                .anyMatch(employee -> employee.getEmpState().equals("Delhi"));
		
		System.out.println(":"+isFromDelhi);



											  

				
	}

}
