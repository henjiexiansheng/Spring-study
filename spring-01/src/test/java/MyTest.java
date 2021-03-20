import com.henjie.dao.UserDaoMysqlImpl;
import com.henjie.dao.UserDaoOracleImpl;
import com.henjie.service.UserService;
import com.henjie.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: henjie
 * @Date: 2021/1/30 - 01 - 30 - 16:19
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class MyTest {
    public static void main(String[] args) {
        //获取ApplicationContext；通过配置文件拿到Spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //需要什么对象，直接get
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
