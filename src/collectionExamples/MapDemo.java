package collectionExamples;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String args[]) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Shaleen");
		map.put(2, "Ankita");
		map.put(6, "Rajesh");
		
		System.out.println(map.get(6));
		
		for(int i: map.keySet()) {
			System.out.println("key is " + i + " and value is " + map.get(i));
		}
	}
}
