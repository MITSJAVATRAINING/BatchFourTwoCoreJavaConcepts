
public class MathsOperation {

	static int defaultValue = 0;
	
	final static int a = 10;
	static int b = 20;
	
	 public static int sum() {
		int c = a + b;
		//System.out.println(c);
		return c;
	}
	
	public void substract(int x, int y) {
		int c = x - y;
		System.out.println(c);
	}
	
	public static void main(String args[]) {
		MathsOperation operation = new MathsOperation();
		int sum = MathsOperation.sum();
		System.out.println(operation.a);
		System.out.println(MathsOperation.defaultValue);
		System.out.println(sum);
		operation.substract(100, 20);
	}
}
