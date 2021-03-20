import com.henjie.pojo.Student;
import com.henjie.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: henjie
 * @Date: 2021/2/24 - 02 - 24 - 9:18
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = (User)context.getBean("user2");
        System.out.println(user);
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = (User)context.getBean("user2");
        User user2 = (User)context.getBean("user2");
        System.out.println(user==user2);
    }
}
