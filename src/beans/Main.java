package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
/*		//以往的方式
		User user = new User();
		user.setUsername("NewSong");
		user.setPassword("123456");
		user.sayHello();
		
		//使用Spring的IOC
		//1.创建IOC容器，参数是配置文件名
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/applicationContext.xml");
		//2.从IOC容器中获取实例 使用getBean方法，参数是配置文件中的类名，也就是id
//		User user2 = (User) ctx.getBean("user");
		User user2 = ctx.getBean(User.class);
		//3.调用方法 
		user2.sayHello();*/
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		People p = (People) ctx.getBean("people");
		System.out.println(p);
	}
}
