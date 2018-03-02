package circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author sinjinsong
 * @date 2018/3/2
 */
@Component("CircleB")
public class B {
   
    private C c;

    public B() {
        
    }
    @Autowired
    public B(C c) {
        this.c = c;
    }

}
