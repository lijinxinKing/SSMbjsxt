package com.serviceimpl;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDao();

    public User ShowUser(String username) {
        User user = userDao.ShowUser(username);
        return user;
    }
}
