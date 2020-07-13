package basic;

public class ThreeWheeler implements Automobile { // has-A Relationship

	public void run() {
		System.out.println("Run method of Threewheeler");
	}
	
	public static void main(String args[]) {
		ThreeWheeler obj = new ThreeWheeler();
		obj.run();
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		
	}
}
