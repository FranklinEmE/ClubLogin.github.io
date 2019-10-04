package myproject;


public class Staff1 {
	public void handleBulkbreaker(Bulkbreaker bulk, boolean finance, Beer beer) {
		
		if(finance == true) {
			
			double loanAmount = beer.getPrice() - bulk.getCashOnHand();
			runCreditHistory(beer, loanAmount);
			
		}else if(beer.getPrice() <= bulk.getCashOnHand()){
	
			processTransaction(bulk, beer);
		}else {
			System.out.println("Customer will need more money to purchase Beer: " + beer);
		}
	}
     public void runCreditHistory(Beer beer, double loanAmount) {
     System.out.println("Ran credit History for Customer...");
     System.out.println("customer has been approved to purchase the vehicle");
     }
      
     public void processTransaction(Bulkbreaker bulk, Beer beer) {
    	 System.out.println("Customer has purchase the vehicle:"
              + beer + "for the price" + beer.getPrice());
     }


}



