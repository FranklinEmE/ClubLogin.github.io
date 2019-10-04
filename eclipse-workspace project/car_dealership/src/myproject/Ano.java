package myproject;

import java.util.Scanner;

public class Ano {
	public static void main(String[] args) {
		arrival();
		name();
		
	}
	
  static double workhour = 8.00;
 static  double arrivetime = 29.00;	


  public static void arrival() {
	  System.out.println("you must be at work by " + 8.00 + " otherwise you are late");
	
  }
  static Scanner input = new Scanner(System.in);
  public static void name() {
	 
	String arrivetime = input.nextLine();
	System.out.println(ten(arrivetime));
	  
}
  public static String ten(String time) {
  
	  if(arrivetime >= (workhour)){
		  return "you are late to work";
	  } else {
	   if(workhour <= (workhour)) {
		  return "you are early to work today welcome";
	   }else {
		   if(!(workhour > (arrivetime))) {
			   return "unknown time";
		   }

	    
	   }	 
}
	return time;
	  
}
		
  }	
	 

		
	

	
	
		
	
		
	
	


	
	
	





