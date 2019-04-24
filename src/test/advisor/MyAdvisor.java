package test.advisor;


import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;
import test.pojo.User;

import java.lang.reflect.Method;
import java.util.Date;

public class MyAdvisor implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        User u = (User)objects[0];
        Logger logger = Logger.getLogger(User.class);
        System.out.println("The "+ u.getUsername() + ", " +new Date().toLocaleString()+", Login in");
    }
}
