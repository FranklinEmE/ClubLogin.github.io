package myproject;

public class Sparrow extends Bird implements Flyable {

	public Sparrow(int age, String name, int weight, String gender) {
		super(age, name, weight, gender);
	
	}


	public void move() {
		System.out.println("Sparrow is flying high");
	
		
	}


	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

}
