import com.henjie.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: henjie
 * @Date: 2021/2/24 - 02 - 24 - 15:01
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.name);
    }
}
