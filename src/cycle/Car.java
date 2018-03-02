package cycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Car implements InitializingBean, DisposableBean {

    public Car() {
        System.out.println("constructor...");
    }


    public void initCar() {
        System.out.println("init-method...");
    }

    @PostConstruct
    public void postConstructMethod() {
        System.out.println("post construct ..");
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println("before destroy...");
    }

    public void destroyCar() {
        System.out.println("destroy-method....");
    }

    
    @Override
    public void destroy() throws Exception {
        System.out.println("disposable bean...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initializing bean...");
    }
}
