package com.henjie.mapper;

import com.henjie.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    public List<User> selectUser();

    //查询指定用户
    public User getUserByID(int id);

    //插入一个用户
    public int addUser(User user);

    //删除用户
    public int deleteUser(int id);

    //更新用户
    public int updateUser(User user);

    //插入用户，使用map
    public int addUser2(Map<String, Object> map);

    //模糊查询
    public User getUserLike(String value);

    //分页查询，结果集映射
    public List<User> getUserByLimit(Map<String, Object> map);

}
