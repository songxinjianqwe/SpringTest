package circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sinjinsong
 * @date 2018/3/2
 */
@Component("CircleA")
public class A {
    private B b;

    public A() {
    }
    @Autowired
    public A(B b) {
        this.b = b;
    }
}
