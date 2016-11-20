package annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation.controller.UserController;
import annotation.dao.UserDAO;
import annotation.service.UserService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
/*		TestObject to = (TestObject) ctx.getBean("testObject");//类名的首字母小写
		System.out.println(to);
		
		UserController controller = (UserController) ctx.getBean("userController");
		System.out.println(controller);
		
		UserDAO service = (UserDAO) ctx.getBean("userDAO");
		System.out.println(service);
		
		UserService dao = (UserService) ctx.getBean("userService");
		System.out.println(dao);*/
		UserController controller = (UserController) ctx.getBean("userController");
		controller.execute();
	}
}
