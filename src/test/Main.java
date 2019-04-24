package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssm.pojo.People;
public class Main {
    public static void main(String[] args){
/*
        singleton sin = singleton.newInstance();
        singleton sin1 = singleton.newInstance();
        System.out.println(sin == sin1);
        ehanSingleton ehanSingleton = test.ehanSingleton.newInstance();
        ehanSingleton ehanSingleton1 = ehanSingleton.newInstance();
        System.out.println(ehanSingleton==ehanSingleton1);
*/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        People people = applicationContext.getBean("people", People.class);
        System.out.println(people);
    }
}
