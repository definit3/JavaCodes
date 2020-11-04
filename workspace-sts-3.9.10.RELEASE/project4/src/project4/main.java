package project4;

public class main {

	public static void main(String[] args) {
		int a[]= new int[10];
		System.out.println(a.length);
		a[3]=100;
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		int b[]= {23,24,25,26};
		int sum=0;
		for(int i=0;i<b.length;i++)
			sum+=b[i];
		for(int number:b)
		{
			System.out.print(number+" ");
		}

	}

}
