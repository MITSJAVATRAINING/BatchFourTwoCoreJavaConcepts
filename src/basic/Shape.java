package basic;

/**
 * Polymorphism  :- Representation of data in more than one form.
 * 2 Types 
 *   1. Static polymorphism (compile time polymorphism) - method overloading
 * 	 2. dynamic polymorphism (run time polymorphism) - method overriding
 * 
 * Encapsulation :- Wrapping of data into single unit.
 * 
 * Abstraction :- Hiding the details which are not important/ or showing just the declartion.
 * 
 * Inheritance :-
 * */
public abstract class Shape  {

	float area;
	
	public abstract void draw();
	
//	public void draw(int radius) {
//		area = (float) (2*3.17*radius);
//		System.out.println("Area covered by circle is " + area);
//	}
//	
//	public void draw(int l, int b) {
//		area = l*b;
//		System.out.println("Area covered by rectangle is "+ area);
//	}
//	
	public static void main(String args[]) {
		
//		Shape circle = new Shape();
//		circle.draw(3);
//		
//		Shape rectangle = new Shape();
//		rectangle.draw(10,8);
		
	}
}
