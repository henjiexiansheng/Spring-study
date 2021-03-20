package com.henjie.service;

import com.henjie.dao.UserDao;
import com.henjie.dao.UserDaoImpl;

/**
 * @Auther: henjie
 * @Date: 2021/1/30 - 01 - 30 - 16:14
 * @Description: com.henjie.service 业务层调用dao层
 * @version: 1.0
 */
public class UserServiceImpl implements UserService{
    //业务层调用dao层的方法
    private UserDao userdao;

    //利用set进行动态实现值得注入
    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }

    public void getUser() {
        userdao.getUser();
    }
}
