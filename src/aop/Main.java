package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop-beforeadvice.xml");
		ArithmaticCalculator calculator = (ArithmaticCalculator) ctx.getBean("arithmaticCalculator");
		System.out.println(calculator.add(1, 2));
//		System.out.println(calculator.div(2, 0));
	}
}	
