import com.kuang.config.JavaConfig;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/18 16:25
 */
public class MyTest {
    @Test
    public void test5() {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user);
    }
}
