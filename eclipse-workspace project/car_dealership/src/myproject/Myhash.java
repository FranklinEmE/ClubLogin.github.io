package myproject;
import java.util.*;
import java.util.Map;
public class Myhash {

	public static void main(String[] args) {
	

		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("franbklin", "A person who is sincere");
		dictionary.put("chiboy", " God is friend to the kid");
		dictionary.put("chiamaka", "God is so good");
		dictionary.put("chidera", "what is written is written");
		
	//	for(String work : dictionary.keySet()) {
	//		System.out.println(dictionary.get(work));
	//	}
		
		for(Map.Entry <String, String> Entry: dictionary.entrySet()){
			System.out.println(Entry.getKey());
			System.out.println(Entry.getValue());
}
}
}
