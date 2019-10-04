package car_dealership;

public class Bigboy {

	public static void main(String[] args) {
	
		
	 Customer cust1 = new Customer();
		
		cust1.setName("Amadi");
		cust1.setAddress("123 Enyiogugu st. ");
		cust1.setCashOnHand(12000);
		
		Drinks drinks = new Drinks();
		
		Staffs emp = new Staffs();
		
	
		cust1.purchaseDrink(Drinks, emp, false);
		
		cust1.toString();
		
	}                                                               

}
  