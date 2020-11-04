package Project;


public class Main {
	public static void main(String[] args)
	{
		Employee m= new Employee("Suresh","Patna",1,45000);
		m.show();
		m.setSalary(50000);
		m.show();
		Student s=new Student("Vivek", "Patna",45120069,100);
		s.show();
		
		Person p;
		p= new Person("Test1","city1");
		p.show();
		p=m;
		System.out.println("\n\n\n");
		p.show();
		p=s;
		System.out.println("\n\n\n");
		p.show(); 
		
		System.out.println("\\\\\\n\n");
	}
}
