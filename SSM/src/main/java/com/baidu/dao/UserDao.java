package com.baidu.dao;

import com.baidu.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
   // public Integer login();
   // public void save(User user);
    public User findAll();
}
