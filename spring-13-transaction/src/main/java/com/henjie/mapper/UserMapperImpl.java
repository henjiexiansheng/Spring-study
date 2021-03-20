package com.henjie.mapper;

import com.henjie.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;

public class UserMapperImpl implements UserMapper{
    //我们的所有操作在原来都使用sqlSession来执行，现在都是用SqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        User user = new User(3, "任鹭", "123456");
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.deleteUser(8);
        return mapper.selectUser();
    }

    public User getUserByID(int id) {
        return null;
    }

    public int addUser(User user) {
        return sqlSession.getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return sqlSession.getMapper(UserMapper.class).deleteUser(id);
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
