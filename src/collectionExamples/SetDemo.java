package collectionExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String args[]) {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(30);
		set.add(30);
		set.add(30);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(50);
		set.add(50);
		set.add(60);
		
	System.out.println("Iterating set using iterable interface");
		
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
