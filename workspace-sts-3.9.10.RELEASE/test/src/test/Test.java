package test;

public class Test {
	public static void main(String[] args)
	{
		System.out.println("hello world! ");
		Account a,b;
		a= new Account(1.234);
		b= new Account(6.543);
		System.out.println(a.amount);
		b.show();
	}
}
