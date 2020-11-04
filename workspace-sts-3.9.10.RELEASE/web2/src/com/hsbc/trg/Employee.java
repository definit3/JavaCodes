package com.hsbc.trg;
public class Employee {
	private int empId;
	private String name;
	private float salary;
	private String dob;
	public int getEmpId() {
		return empId;
	}
 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public String getDob() {
		return dob;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee(int empId, String name, float salary, String dob) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.dob=dob;
	}
	public void show()
	{
		System.out.println("Emp id: "+ empId);
		System.out.println("Name: "+ name);
		System.out.println("Salary: "+ salary);
		System.out.println("DOB: "+ dob);
	}

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary=10000;
	}
	public Employee()
	{
		
	}
	public void increment(int per)
	{
		salary=salary+salary*per/100;
	}
}







 