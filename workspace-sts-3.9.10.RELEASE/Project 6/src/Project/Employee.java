package Project;

public class Employee extends Person {
	private int empId;
	private float salary;
	public Employee(String name, String address, int empId, float salary) {
		super(name, address);
		this.empId = empId;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void show()
	{
		super.show();
		System.out.println("Emp id: "+ empId);
		System.out.println("Salary: "+ salary);
	}
	
}
