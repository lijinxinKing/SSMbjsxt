package test.advisor;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;
import test.pojo.User;

import java.lang.reflect.Method;
import java.util.Date;

public class MyAfter implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        User u = (User)objects[0];
        org.apache.log4j.Logger logger = Logger.getLogger(User.class);
        if(o!=null){
            logger.info(u.getUsername() + new Date().toLocaleString() + "success");
            System.out.println(u.getUsername() + new Date().toLocaleString() + "success");
        }else{
            logger.info(u.getUsername() + new Date().toLocaleString() + "fail");
            System.out.println(u.getUsername() + new Date().toLocaleString() + "fail");
        }
    }
}
