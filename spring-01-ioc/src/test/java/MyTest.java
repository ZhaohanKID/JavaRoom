import com.kuang.entity.Hello;
import com.kuang.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/17 19:05
 */
public class MyTest {
    @Test
    public void test1() {
        // 获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans01.xml");
        Hello hello = context.getBean("hello", Hello.class);
        System.out.println(hello.toString());
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans02.xml");
        User user = context.getBean("user2", User.class);

        User user1 = context.getBean("user3", User.class);
        user.show();
        user1.show();
    }
}
