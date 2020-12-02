package com.baidu.service.imp;

import com.baidu.bean.User;
import com.baidu.dao.UserDao;
import com.baidu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public Integer login() {
        System.out.println("业务层登录");
        return null;
    }


    public void save(User user) {
        System.out.println("业务层注册");
    }


    public User findAll() {
        System.out.println("业务");
        return userDao.findAll();
    }
}
