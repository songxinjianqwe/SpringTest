package circle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-circle.xml");
        ctx.getBean("CircleA");
    }
}
