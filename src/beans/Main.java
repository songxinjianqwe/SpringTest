package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
/*		//�����ķ�ʽ
		User user = new User();
		user.setUsername("NewSong");
		user.setPassword("123456");
		user.sayHello();
		
		//ʹ��Spring��IOC
		//1.����IOC�����������������ļ���
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/applicationContext.xml");
		//2.��IOC�����л�ȡʵ�� ʹ��getBean�����������������ļ��е�������Ҳ����id
//		User user2 = (User) ctx.getBean("user");
		User user2 = ctx.getBean(User.class);
		//3.���÷��� 
		user2.sayHello();*/
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		People p = (People) ctx.getBean("people");
		System.out.println(p);
	}
}
