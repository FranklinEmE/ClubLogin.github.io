package myproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MyReverse {

	public static void main(String[] args) {

		
		ArrayList<String> words = new ArrayList<String>();
		words.add("book");
	//	words.add("pencil");
	//	words.add("biro");
	//	words.add("cleaner");
	//	words.add("cup");
	//	words.add("seat");
		
	//	System.out.println(words.get(3));
		
		
	//	LinkedList<Integer> number = new LinkedList<Integer>();
	//	number.add(100);
	//	number.add(200);
	//	number.add(300);
	//	number.add(400);
	//	number.add(500);
	//	number.add(600);
		
	//	for(int sup : number)
		
	//	System.out.println(sup);
		
		
		HashMap<String, String> dic = new HashMap<String, String>();
		dic.put("frank", "good boy");
		dic.put("chiboy", "good pinki");
		dic.put("chiamaka", "good girl");
		dic.put("amaka", "good daughther");
		
		for(String word : dic.values()){
		
		System.out.println(dic.get(word));
		}
	for(Map.Entry<String, String> entry : dic.entrySet()){
         System.out.println(entry . getKey());
         System.out.println(entry . getValue());
	}
}
}
    