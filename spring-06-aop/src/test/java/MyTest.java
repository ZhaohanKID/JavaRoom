import com.kuang.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/19 19:20
 */
public class MyTest {
    @Test
    public void test8() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 务必注意，动态代理代理的是一个接口，所以说这里传入的务必是 UserService.class
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void test9() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        UserService userService2 = context.getBean("userService2", UserService.class);
        userService2.delete();
    }
}
