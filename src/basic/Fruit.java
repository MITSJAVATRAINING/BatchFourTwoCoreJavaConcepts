package basic;

public class Fruit {
	
	String name;
	String measuringUnit;
	String taste;
	
	public Fruit() {
		System.out.println("Default Constructor");
	}
	
	public Fruit(String name, String measuringUnit, String taste) {
		System.out.println("parametrised constructor");
		this.name = name;
		this.measuringUnit = measuringUnit;
		this.taste = taste;
	}
	
	 void eat() { 
		
		/**
		 * Access Modifiers : public/private/protected/default.
		 * return type : void or any other dataaype
		 * name of method
		 * parameters
		 * */
		
	}
	
	public static void main(String args[]) {
		
		Fruit apple = new Fruit();
		apple.name = "Apple";
		apple.measuringUnit = "Kg";
		apple.taste = "sweet";
		
		Fruit banana = new Fruit();
		banana.name = "banana";
		banana.measuringUnit = "dozens";
		banana.taste = "sweet";
		
		Fruit peer = new Fruit("peer", "kg", "sweet");
		
	}
	
}
