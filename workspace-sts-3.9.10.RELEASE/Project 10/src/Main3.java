import java.util.HashMap;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		HashMap<Integer,String> x = new HashMap<Integer, String>();
		x.put(1, "Vivek");
		x.put(2, "name2");
		x.put(3, "name3");
		
		Scanner myObj = new Scanner(System.in);
		while(true)
		{
			int xx=myObj.nextInt();
			if(xx==0)break;
			if(x.containsKey(xx))
			{
				System.out.println("Employee name is: "+ x.get(xx));
			}
			else
			{
				System.out.println("empID not found");
			}
		}
		
	}

}
