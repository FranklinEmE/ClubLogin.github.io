package myproject;
import java.util.Scanner;
public class lecturetime {
	

	 static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("input your password");
		 name();
	 
	}	

	
	public static void name() {
  int insert = input.nextInt();
   System.out.println(lecture(insert));

}
	
	public static String lecture(double password) {
		
		
	   if(password == 9999){
		return "correct  successful....";
		
			
		}else {
			return "incorrect password!!!";
		}
	}
		
	}
	      
	

	



