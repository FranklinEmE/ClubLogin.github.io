package myproject;
;

public class Bulkbreaker {
	

private	String name;
private	String address;
private	double cashOnHand;
	


	public Bulkbreaker(String name, String address, double cashOnHand) {
	super();
	this.name = name;
	this.address = address;
	this.cashOnHand = cashOnHand;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address += "Distributor city";
		this.address = address;
	}


public double getCashOnHand() {
		return cashOnHand;
	}

public void setCashOnHand(double cashOnHand) {
		cashOnHand += 500;
		this.cashOnHand = cashOnHand;
	}


 public void purchaseDrink(Beer beer, Staff1 staff, boolean finance) {
		staff.handleBulkbreaker(this, finance, beer);
		
}


}
