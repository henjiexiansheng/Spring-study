package com.henjie.mapper;

import com.henjie.pojo.User;

import java.util.List;

public interface StudentMapper {
    //多对一，查询所有的学生信息，以及对应的老师信息
    public List<User> getStudent();
}
