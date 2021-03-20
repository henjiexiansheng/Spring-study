package com.henjie.mapper;

import com.henjie.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    Teacher getTeacher(@Param("tid") int id);
}
