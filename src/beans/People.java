package beans;

public class People {
	private String name;
	private int age;
	private Car car;
	private double salary;
	public People() {
		// TODO Auto-generated constructor stub
	}
	public People(String name, int age, Car car, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Car getCar() {
		return car;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", car=" + car + ", salary=" + salary + "]";
	}
}
