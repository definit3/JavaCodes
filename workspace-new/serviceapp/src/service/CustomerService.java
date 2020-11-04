package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class CustomerService {
	HashMap<Integer, Customer>custData=new HashMap<>();
	public CustomerService()
	{
		custData.put(100, new Customer(100,"ABC Retail","Delhi"));
		custData.put(200, new Customer(200,"BCD Retail","Delhi"));
		custData.put(300, new Customer(300,"CDE Retail","Delhi"));
		custData.put(400, new Customer(400,"DEF Retail","Delhi"));
		custData.put(500, new Customer(500,"EFG Retail","Delhi"));
		custData.put(600, new Customer(600,"FGH Retail","Delhi"));
	}
	
	public Customer getCustomer(int cid)
	{
		Customer c=custData.get(cid);
		return c;
	}
	
	public ArrayList<Customer>getAll()
	{
		Collection<Customer> col=custData.values();
		ArrayList<Customer> list= new ArrayList<>();
		list.addAll(col);
		return list;
	}
	
	public String saveCustomer(Customer cust)
	{
		if(custData.containsKey(cust.getId()))
			return "Customer already exists";
		else
		{
			custData.put(cust.getId(),cust);
			return "Customer Data Successfully Saved";
		}
	}
	
	public String updateCustomer(Customer c)
	{
		if(custData.containsKey(c.getId()))
		{
			custData.put(c.getId(), c);
			return "Customer data updated successfully";
		}
		else
		{
			return "Customer does not exist";
		}
	}
	
	public String deleteCustomer(int id)
	{
		if(custData.containsKey(id))
		{
			custData.remove(id);
			return "Deleted Successfully";
		}
		else
		{
			return "Customer does not exist";
		}
	}
}
