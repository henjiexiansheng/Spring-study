import com.henjie.mapper.UserMapper;
import com.henjie.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {

    //查询全部用户
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImpl = context.getBean("UserMapperImpl", UserMapper.class);
        List<User> users = userMapperImpl.selectUser();
        for (User user : users) {
            System.out.println(users);
        }
    }

    //查询全部用户方式2
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapperImpl = context.getBean("UserMapperImpl2", UserMapper.class);
        List<User> users = userMapperImpl.selectUser();
        for (User user : users) {
            System.out.println(users);
        }
    }

}
