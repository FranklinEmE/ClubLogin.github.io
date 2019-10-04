package myproject;



import java.util.Scanner;

public class Movethem {
	
	static Scanner input =new Scanner(System.in);
	public static void main(String[] args) {

      name();
   }

	public static void name() {
		String kep = input.nextLine();
		System.out.println(set(kep));
}
	
	
	public static String set(String boo) {
	
		if(boo.equals("hi")){
			return "welcome";
		}else {
			return "no way";
			
		
	}
	
	

	
	
	}
