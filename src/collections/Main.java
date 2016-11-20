package collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		People p = (People) ctx.getBean("people5");
		System.out.println(p);
//		NewPeople p = (NewPeople) ctx.getBean("people4");
//		System.out.println(p);
//		JDBCUtils jdbc = (JDBCUtils) ctx.getBean("jdbcutils");
//		System.out.println(jdbc.getProp());
	}
}
