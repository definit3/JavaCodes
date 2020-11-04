package Project;

public class Circle implements Shape {
	private float radius;
	

	public Circle(float radius) {
		this.radius=radius;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return (float) (3.14*radius*radius);
	}

	@Override
	public float getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(3.14f*radius);
	}

}
