package spring.trg;

import org.springframework.stereotype.Component;

@Component
public class Department {
	private int departmentId=10;
	private String name="Finance";
	private String address="Patna";
	
	public Department() {}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", name=" + name + ", address=" + address + "]";
	}
	
}
