import com.henjie.mapper.UserMapperImpl;
import com.henjie.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl userMapperImpl = context.getBean("UserMapperImpl", UserMapperImpl.class);
        for (User user : userMapperImpl.selectUser()) {
            System.out.println(user);
        }
    }
}
