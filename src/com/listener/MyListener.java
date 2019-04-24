package com.listener;

import javax.servlet.*;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyListener implements ServletRequestListener, ServletRequestAttributeListener, HttpSessionListener,ServletContextListener {
    // 监听器 监听作用域对象Request Response 的创建与销毁
    // 创建 监听属性的添加修改移除，触发新增的数据

    @Override
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        //request 中增加了一条数据
        System.out.println("触发这次新增的数据");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        //

    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        //
    }
    // 创建了一个 指定实现的java 类，配置 监听器类
    // 监听request ServletRequestListener
    //
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        ServletContext sc = servletRequestEvent.getServletContext();
        System.out.println("Request Destroyed ");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {

        System.out.println("Listener Request Interface");
    }

    // 监听 session 的创建 和销毁
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
        Object o = session.getAttribute("str");
        if(o!=null){
            System.out.println(o);
        }
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("Destroy Session");
    }

    // 监听 Application 的创建和销毁 ，服务器启动  和 服务器 关闭 网页浏览次数
    // 形参可以获取当前 Application 对象
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
