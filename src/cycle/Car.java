package cycle;

public class Car {
	private String brand;
	public Car() {
		System.out.println("Construct Car");
	}
	public void setBrand(String brand) {
		System.out.println("set brand");
		this.brand = brand;
	}
	public void initCar(){
		System.out.println("init...");
	}
	public void destroyCar(){
		System.out.println("destroy....");
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}
}
