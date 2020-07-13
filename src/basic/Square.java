package basic;

public abstract class Square extends Shape { // IS-A Relationship

	float area;
	public void draw(int side) {
		area = side*side;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
}
