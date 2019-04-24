package test.service.impl;

import org.springframework.beans.factory.annotation.Value;
import test.mapper.UserMapper;
import test.pojo.User;
import test.service.UserService;

public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User login(User u) {
        return userMapper.selByUser(u);
    }

    @Override
    public int insert(User u) {
        return 0;
    }
}
