package collections;

import java.util.Map;

import beans.Car;

public class NewPeople {
	private String name;
	private int age;
	private double salary;
	private Map<String,Car> cars;
	public NewPeople() {
		// TODO Auto-generated constructor stub
	}
	public NewPeople(String name, int age,double salary,Map<String,Car> cars) {
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

	public void setCars(Map<String,Car> cars) {
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
	public Map<String,Car> getCars() {
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
