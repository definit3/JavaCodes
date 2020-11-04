package Project;


public class Main {
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle(10,20);
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
		
		Square s=new Square(4);
		System.out.println(s.getArea());
		System.out.println(s.getPerimeter());
		
		Circle c=new Circle(3);
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
	}
}
