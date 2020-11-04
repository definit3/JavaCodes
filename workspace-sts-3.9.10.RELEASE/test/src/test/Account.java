package test;

public class Account {
	double amount=6.556; //instance variable
	int abc=100;
	Account (double balance) //constructor
	{
		amount=balance;
	}
	void show()  //instance method
	{
		int abc=30; //local variable
		System.out.println(abc);
		System.out.println(this.abc);
	}
}
