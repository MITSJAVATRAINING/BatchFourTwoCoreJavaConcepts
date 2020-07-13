package collectionExamples;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String args[]) {
		
		Queue<Integer> queue = new PriorityQueue<Integer>(5); // size is five size/2 - 5/2 = 2 queue = 10;
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		queue.add(70);
		queue.add(80);
		
		System.out.println("Sie of queue is " + queue.size());
		
		System.out.println("Peek element" + queue.peek());
		System.out.println("Poll element" + queue.poll()); // take the first element and remove the queue
		
		
		System.out.println("Peek element" + queue.peek());
		System.out.println("Poll element" + queue.poll());
		
		System.out.println("Iterating queue using iterable interface");
		
		Iterator<Integer> iter = queue.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
