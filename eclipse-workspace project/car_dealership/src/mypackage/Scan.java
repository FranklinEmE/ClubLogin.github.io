package mypackage;
import java.util.Scanner;
public class Scan {

	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	franco();

	}
	
	public static void franco() {
	String message = input.nextLine();
	//String milk = input.nextLine();
	
	System.out.println(ha(message));
	
	
}
  
	 public static String ha(String message){
	 if(message.equals("hi")){
	 return "ga wa";
	 }else {
	return "ijeoma";
}
}
}