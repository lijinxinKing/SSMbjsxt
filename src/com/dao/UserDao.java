package com.dao;

import com.pojo.User;

import java.util.HashMap;

public class UserDao {
    static HashMap<Integer,User> Users = new HashMap<Integer, User>();

    static {
        Users.put(1,new User(1,"鲁班","18000","中路","跳跳"));
        Users.put(2,new User(2,"妲己","10000","中路","跳跳"));
        Users.put(3,new User(3,"高渐离","8000","中路","跳跳"));
        Users.put(4,new User(4,"后羿","18000","中路","跳跳"));
    }

    public User ShowUser(String userName){
        for (Integer key:Users.keySet()){
            User u = Users.get(key);
            if(u.getName().equals(userName)) {
                return u;
            }
        }
        return null;
    }
}
