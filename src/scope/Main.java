package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowire.Car;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");
		Car c1 = (Car) ctx.getBean("car");
		Car c2 = (Car) ctx.getBean("car");
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
}
