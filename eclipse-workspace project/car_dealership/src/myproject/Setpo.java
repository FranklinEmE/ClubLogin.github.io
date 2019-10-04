package myproject;
import java.util.Scanner;
public class Setpo {

	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("input your age before enter the Club");
		insert();
	}
	
	public static void insert() {
		int put = input.nextInt();
		System.out.println(poc(put));
	}
	public static String poc(int pin) {
		if(pin < 18) {
			return "you are too young to enter this Club";
	}else {
		return "you can enter the Club";
	}
	}
}
