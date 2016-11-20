package factory;

public class Car {
	private String brand;
	private double price;
	public Car() {
	}
	
	public Car(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public void setName(String brand) {
		this.brand = brand;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + brand + ", price=" + price + "]";
	}
}
