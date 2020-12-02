package com.baidu.service;

import com.baidu.bean.User;

public interface UserService {
    public Integer login( );
    public void save(User user);
    public User findAll();
}
