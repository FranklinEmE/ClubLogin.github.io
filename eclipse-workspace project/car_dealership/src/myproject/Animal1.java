package myproject;

public abstract class Animal1 {
	
	
	
	int age = 3;
	String name = "hipo";
	int weight = 3;
	String gender = "male";




public Animal1(int age, String name, int weight, String gender) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
		this.gender = gender;
	}


public void shout() {
	System.out.println("wooow");
}
public void walk() {
	System.out.println("walking");
	
}
public void eat() {
	System.out.println("eating");
}

public abstract void move();
	
}
