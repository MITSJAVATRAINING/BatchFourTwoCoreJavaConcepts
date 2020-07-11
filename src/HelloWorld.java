
public class HelloWorld {
	
	/**
	 * CLASSES 
	 * 1.	Modifiers :- public/default
	 * 2. 	Class Name :- HelloWorld, is used to uniquely identify. Class name should always start with Capital.
	 * 3. 	Super Class (if any)
	 * 4. 	Interfaces.
	 * 5. 	Body
	 * 
	 * OBJECTS 
	 * 
	 * 1.	State :- attributes of an object
	 * 2. 	Behavior :- methods of object
	 * 3.	Identity :- name of object
	 * */

	public static void main(String args[]) {

		System.out.println("Hello World");

		int age = 18;

		int[] ages = new int[] { 11, 12, 13, 14, 15, 16 }; // size - 6
		
		String[] persons = new String[] {"A", "B", "C", "D", "E"};
		
		int[] variableArray = new int[5];

//		for (int i = 0 ; i<5;i++) {
//			ages[i] = i+10;
//		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Age of person " + persons[i] + " is " + ages[i]);
		}

		if (age < 18) {
			System.out.println("Person is not allowed to vote");
		} else {
			System.out.println("Person is eligible to vote");
		}

		int a = 56;
		if (a < 50) {
			System.out.println("Number is less than 50");
		} else if (a >= 50 && a < 100) { // OR '||'
			System.out.println("Number is greater than 50 but less than 100");
		} else {
			System.out.println("Number is greater than 100");
		}

		// for loop
		// while
		// do while loop
		// extented for loop
		// foreach loop

		for (int i = 1; i < 10; i = i + 1) {
			System.out.println("Hello World using for" + i);
		}

		int i = 0;
		while (i < 10) {
			System.out.println("hello world using while");
			i++;
		}

		/*
		 * i = 1 Check condition if satisfied YES System.out.println("Hello World");
		 * Increment/Decrement Operation i = 2; . . . . . i = 9 Check condition if
		 * satisfied YES System.out.println("Hello World"); Increment/Decrement
		 * Operation i = 10 Check condition if satisfied NO Come out of loop
		 */
	}
}
