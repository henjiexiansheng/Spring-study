import com.henjie.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: henjie
 * @Date: 2021/2/17 - 02 - 17 - 10:51
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("us");
        user.show();
    }
}
