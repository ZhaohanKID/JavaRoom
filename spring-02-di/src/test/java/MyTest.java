import com.kuang.domain.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/17 21:50
 */
public class MyTest {
    @Test
    public void t1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
