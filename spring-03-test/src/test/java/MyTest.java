import com.kuang.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/18 12:34
 */
public class MyTest {
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
        person.getDog().shout();
        person.getCat().shout();
    }
}
