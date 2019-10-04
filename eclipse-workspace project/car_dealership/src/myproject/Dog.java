package myproject;

public class Dog implements Animal{


	public void noise() {
		System.out.println("is too much");
	
	}


	public String eat() {
	
		return "quick";
	}

	public int numofLegs() {
	
		return 4;
	}


	public int age() {
	
		return 34;
	}
public static void main(String[] args) {
	
	Dog g = new Dog();
	 g.noise();
	  System.out.println(g.eat());
	  System.out.println(g.numofLegs());
	  System.out.println(g.age());
	  
	  Cat frk = new Cat();
		System.out.println("meow");
		System.out.println(frk.eat());
		System.out.println(frk.numofLegs());
		System.out.println(frk.age());

}
}

