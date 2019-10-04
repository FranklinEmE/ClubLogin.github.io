package myproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
	  
	HashMap<String, String> doc = new HashMap<String, String>();
           doc.put("ofe", "soup");
           doc.put("mmiri", "water");
           doc.put("osicapa", "rice");
           doc.put("mmaya", "drink");
           
           name();
        //   for(String word : doc.keySet()) {
        //	   System.out.println(doc.get(word));
        //   }
        
           for(Map.Entry<String, String> Entry : doc.entrySet()) {
        	   System.out.println(Entry.getKey());
           System.out.println(Entry.getValue());
         }   
           }
     
          static Scanner input = new Scanner(System.in);
           public static void name() {
           String pop = input.nextLine();
           System.out.println(nam(pop));
        	   
	    }
           public static String nam(String lok) {
        	   System.out.println();
			return lok;
           }

}