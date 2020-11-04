package Project5;

public class Manager extends Employee{
	private String projectName;

	public Manager(int empId, String name, float salary, String projectName) {
		super(empId, name, salary);
		this.projectName = projectName;
	}
	
	public void show()
	{
		super.show();
		System.out.println("Project Name: "+ this.getProjectName());
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
}
