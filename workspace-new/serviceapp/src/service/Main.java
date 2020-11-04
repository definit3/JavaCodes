package service;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args)
	{
		CustomerService ser= new CustomerService();
		Customer c =ser.getCustomer(100);
		System.out.println(c);
		
//		ArrayList<Customer>clist=ser.getAll();
//		for(Customer cc:clist)
//		{
//			System.out.println(cc);
//		}
//		
		Customer cc=new Customer(1000,"Vivek","Patna");
		System.out.println(ser.saveCustomer(cc));
		
		
		ArrayList<Customer>cclist=ser.getAll();
		for(Customer ccc:cclist)
		{
			System.out.println(ccc);
		}
		
		System.out.println(ser.deleteCustomer(100));
		System.out.println(ser.deleteCustomer(100));
		Customer ccc=new Customer(100,"new100","Patna");
		System.out.println(ser.updateCustomer(ccc));
		
	}

}