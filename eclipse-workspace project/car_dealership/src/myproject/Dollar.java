package myproject;
import java.util.Scanner;
public class Dollar {
	

	 static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("lecture start by 9.30 am");
		 name();
	 
	}	

	
	public static void name() {
  double Arrivetime = input.nextDouble();
   System.out.println(lecture(Arrivetime));

}
	
	public static String lecture(double lecturetime) {
		
		
		
		   if(lecturetime <= (9.30)){
		return "you are welcome to this morning lecture";
		
			
		}else {
			return "am sorry you are late to this class";
		}
		}
	      
	}
	
	



