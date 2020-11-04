package Project3;
public class Main {
	public static void main(String[] args)
	{
		String s1="patna";
		String s2=new String("Patna");
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.indexOf('a'));
		
		StringBuilder sb1=new StringBuilder();
		for(char ch='a'; ch<='z';ch++)
		{
			sb1.append(ch);
		}
		System.out.println(sb1);
	}
}
