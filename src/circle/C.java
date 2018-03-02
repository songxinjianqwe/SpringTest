package circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sinjinsong
 * @date 2018/3/2
 */
@Component("CircleC")
public class C {
    private A a;

    public C() {
    }
    @Autowired
    public C(A a) {
        this.a = a;
    }
}
