package com.henjie.mapper;

import com.henjie.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    public List<User> selectUser();

    //添加一个用户
    public int addUser(User user);

    //删除一个用户
    public int deleteUser(int id);
}
