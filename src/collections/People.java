package collections;

import java.util.List;

import beans.Car;

public class People {
	private String name;
	private int age;
	private double salary;
	private List<Car> cars;
	public People() {
		// TODO Auto-generated constructor stub
	}
	public People(String name, int age,double salary, List<Car> cars) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
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
	public List<Car> getCars() {
		return cars;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", cars=" + cars + ", salary=" + salary + "]";
	}
}
