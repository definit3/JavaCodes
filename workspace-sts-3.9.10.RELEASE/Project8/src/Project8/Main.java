package Project8;
import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		int nums[]=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 number: ");
		for(int i=0;i<5;i++)
		{
			nums[i]=sc.nextInt();
		}
		System.out.println("Numbers entered by you: ");
		for(int i=0;i<5;i++)System.out.println(nums[i]);
		
		while(true)
		{
			System.out.println("Enter an index: ");
			int x=sc.nextInt();
			try
			{
				System.out.println(nums[x]);
			}
			catch(ArrayIndexOutOfBoundsException aex) {
				System.out.println(aex.getMessage());
				System.out.println("Out of bound, enter new index");
			}
		}
	}

}
