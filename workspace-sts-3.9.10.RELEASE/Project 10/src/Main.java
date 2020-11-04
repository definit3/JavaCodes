import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>(); 
		a1.add(55);
		a1.add(210);
		a1.add(33);
		a1.add(64);
		a1.add(5);
		a1.add(7);
		a1.add(7);
		for(int i:a1)
		{
			if(i<50)System.out.println(i);
		}
		System.out.println("////\n");
		TreeSet<Integer> a2=new TreeSet<Integer>();  
		a2.add(3);
		a2.add(67);
		a2.add(33);
		a2.add(999);
		a2.add(3);
		for(int i:a2)
		{
			if(i<100)System.out.println(i);
		}
	}

}
