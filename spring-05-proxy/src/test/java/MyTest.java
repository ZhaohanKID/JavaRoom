import com.kuang.pojo.demo1.Host;
import com.kuang.pojo.demo1.Proxy;
import com.kuang.pojo.demo2.UserService;
import com.kuang.pojo.demo2.UserServiceImpl;
import com.kuang.pojo.demo2.UserServiceProxy;
import org.junit.Test;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/18 17:50
 */
public class MyTest {
    @Test
    public void test6() {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
    @Test
    public void test7() {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);

        proxy.add();
    }
}
