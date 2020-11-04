package Project;

public class Square implements Shape {
	private float side;
	

	public Square(float side) {
		this.side=side;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public float getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(side+side);
	}

}
