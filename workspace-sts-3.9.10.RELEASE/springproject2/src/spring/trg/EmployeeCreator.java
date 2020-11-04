package spring.trg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeCreator {
	
	@Bean(name="emp1")
	public Employee getFirstEmployee()
	{
		return new Employee(100,"Employee 1",6000);
	}
	@Bean(name="emp2")
	public Employee getFirstEmployee2()
	{
		return new Employee(200,"Employee 2",7000);
	}
	
	@Bean(name="emp3")
	public Employee getFirstEmployee3()
	{
		return new Employee(300,"Employee 3",8000);
	}
}
