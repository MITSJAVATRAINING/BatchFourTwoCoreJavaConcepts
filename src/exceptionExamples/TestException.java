package exceptionExamples;

import java.io.FileNotFoundException;

public class TestException {

	/**
	 * Exception - 1. Name : ex.toString() 2. Description :- ex.getMessage(); 3.
	 * StackTrace :- ex.printStackTrace();
	 * 
	 */

	public void divide(int a, int b) {
		int c = 0;

		try {
			c = a / b;
		} catch ( ArithmeticException ex) {
			System.out.println("In Catch block");
			ex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("The value of c is " + c);
		}

	}

	public void readFile() {
		// FileInputStream is = new FileInputStream("C:/abc.txt");
	}

	public static void main(String args[]) throws AgeException, FileNotFoundException{
		TestException obj = new TestException();
		//obj.divide(10, 0);
		
		int age = 17; 
		
		if (age < 18) {
			throw new AgeException("Age can not be greater than 18");
		}
		
		
	}
}
