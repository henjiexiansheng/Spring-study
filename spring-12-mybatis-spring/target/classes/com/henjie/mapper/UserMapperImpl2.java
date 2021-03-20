package com.henjie.mapper;

import com.henjie.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

//SqlSessionDaoSupport 代替第1种方法的 SqlSessionTemplate
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> selectUser() {
        //SqlSessionDaoSupport 可以调用 getSqlSession()方法 ，返回sqlSession（同方法1的SqlSessionTemplate）
//        SqlSession sqlSession = getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        return mapper.selectUser();
        //精简以上3行代码得到
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }

    public User getUserByID(int id) {
        return null;
    }

    public int addUser(User user) {
        return 0;
    }

    public int deleteUser(int id) {
        return 0;
    }

    public int updateUser(User user) {
        return 0;
    }

    public int addUser2(Map<String, Object> map) {
        return 0;
    }

    public User getUserLike(String value) {
        return null;
    }

    public List<User> getUserByLimit(Map<String, Object> map) {
        return null;
    }
}
