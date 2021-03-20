import com.henjie.mapper.StudentMapper;
import com.henjie.mapper.UserMapper;
import com.henjie.pojo.Student;
import com.henjie.pojo.User;
import com.henjie.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mybatis.spring.batch.MyBatisCursorItemReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {

    //查询全部用户
    @Test
    public void Test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    //查询指定用户
    @Test
    public void Test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userByID = mapper.getUserByID(1);
        System.out.println(userByID);
        sqlSession.close();
    }

    //插入用户
    @Test
    public void Test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.addUser(new User(8, "王珏", "123456"));
        if(i > 0){
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    //删除用户
    @Test
    public void Test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(8);
        if(i > 0){
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    //更新用户
    @Test
    public void Test5(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.updateUser(new User(3, "任鹭", "123456"));
        if(i > 0){
            System.out.println("更新成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    //插入用户2，使用map
    @Test
    public void Test6(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map map = new HashMap<String, Object>();
        map.put("aaa",8);
        map.put("bbb","王珏");
        map.put("ccc","123456");
        int i = mapper.addUser2(map);
        if(i > 0){
            System.out.println("插入成功2");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    //模糊查询
    @Test
    public void Test7(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userLike = mapper.getUserLike("瀚");
        System.out.println(userLike);
        sqlSession.close();
    }

    //分页查询，结果集映射
    @Test
    public void Test8(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map map = new HashMap<String, Object>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List userByLimit = mapper.getUserByLimit(map);
        for (Object o : userByLimit) {
            System.out.println(userByLimit);
        }
        sqlSession.close();
    }

}
