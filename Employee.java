package com.junitDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
	
private String name;
private int empId;
private int salary;

public Employee(String string, int i, int j) {
	// TODO Auto-generated constructor stub
}

@Override
public int hashCode() {
	return this.empId;
}

@Override
public boolean equals(Object obj) {
	
	Employee emp = (Employee) obj;
	boolean status = false;
	
	if (this.name.equalsIgnoreCase(emp.name)
		&& this.empId == emp.empId
		&& this.salary == emp.salary)
{
	status = true;
}
		
return status;
}



public static List<Employee> getEmployeeList()
{
	List<Employee> emps = new ArrayList<Employee>();
	
	Employee emp1 = new Employee("Padmaja" , 1 ,2324);
	Employee emp2 = new Employee("Radhika" , 2 ,2332);
	Employee emp3 = new Employee("Punam" , 3 ,2634);
	
	emps.add(emp1);
	emps.add(emp2);
	emps.add(emp3);
	
	return emps;
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}


}