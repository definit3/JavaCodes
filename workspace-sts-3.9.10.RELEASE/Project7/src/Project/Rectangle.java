package Project;

public class Rectangle implements Shape {
	private float length;
	private float breadth;
	

	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	public float getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(length+breadth);
	}

}
