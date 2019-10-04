package carDealership;


public class CarDealer {

	public static void main(String[] args) {

		
		Customer cust1 = new Customer();
		cust1.setName("tom");
		cust1.setAddress("123 Anything st. ");
		cust1.setCashOnHand(25000);
		
		Vehicle vehicle = new Vehicle("Honda", "Accord", 20000);
		vehicle.setMake("Honda");
		vehicle.setModel("accord");
		vehicle.setPrice(20000);
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);
		
		Vehicle car = new Vehicle("BMW", "M3", 20000);
				
		boolean value = car.equals(vehicle);
		System.out.println(value);
	}

}
