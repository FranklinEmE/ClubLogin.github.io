package myproject;



public class Beer {
	

private	String brand ;
private	String model;
private	double price;


public Beer(String brand, String model, double price) {
	super();
	this.brand = brand;
	this.model = model;
	this.price = price;
}


public String getbrand() {
	return brand;
}

public void setMake(String brand) {
	this.brand = brand;
}


public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((brand == null) ? 0 : brand.hashCode());
	result = prime * result + ((model == null) ? 0 : model.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Beer other = (Beer) obj;
	if (brand == null) {
		if (other.brand != null)
			return false;
	} else if (!brand.equals(other.brand))
		return false;
	if (model == null) {
		if (other.model != null)
			return false;
	} else if (!model.equals(other.model))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	return true;
}


@Override
public String toString() {
	return "Beer [brand=" + brand + ", model=" + model + ", price=" + price + "]";
}
}