package test.service;

import test.pojo.User;

public interface UserService {
    User login(User u);
    int insert(User u);
}
