package generic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-generic.xml");
		UserService service = (UserService) ctx.getBean("userService");
		service.add();
 	}
}
