package collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String args[]) {
	
		
		List<Integer> list = new ArrayList<>(5); //default size of arraylist is 10
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(50);
		list.add(50);
		
		System.out.println(list.get(2));
		System.out.println(list.size());
		//list.removeAll(list);
		System.out.println(list.size());
		System.out.println("Iterate the list using iterable interface");
		
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("Iterate the list using extended for loop");
		
		for (int i: list) {
			System.out.println(i);
		}
	}
}
