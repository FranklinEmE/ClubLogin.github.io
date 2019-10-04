package myproject;



public class Distributor1 {

	public static void main(String[] args) {
		
		
	Bulkbreaker bulk = new Bulkbreaker("opis and sons", "Ekenguru... ", 2040);
		
		Beer beer = new Beer("Gulder", "brewery",  2060);
	
		Staff1 staff = new Staff1();
		
		 bulk.purchaseDrink(beer, staff, false);
		 
			Beer Drink = new Beer("star", "brewery", 4050);
		 
		 boolean value = Drink.equals(beer);
		 System.out.println(value);
		
				

	}

}
