package myproject;

import java.util.Scanner;

public class Mypocket {

	
  static Scanner input = new Scanner(System.in);
    public static void main(String [] args) {
    	System.out.println("please enter your age here");
    	name();
    

		
	}
    public static void name() {
    	int luk =input.nextInt();
    	System.out.println(book(luk));
    	
    }
    
    public static String book(int lok) {
    	if(lok < (18)) {
    		return "you are young for this";
    	}else {
    		return "you can have it";
    	}
    	

	
    }	
}

