package com.filter;

import javax.servlet.*;
import java.io.IOException;

// 服务器端处理的请求资源 和 响应
// 复写接口的方法
// Servlet 的调用 走servlet 之前调用过滤器
// 配置Web.xml , 请求 /* 拦截所有请求
//
public class MyFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //服务器 启动 就执行 资源初始化
        System.out.println("My Filter Init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //放行 拦截请求的方法，对资源进行管理
        // 需要手动 对请求进行放行
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");
        servletResponse.getWriter().write("Do Filter Finished");

        // Do Filter
        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("Do Filter");

    }

    @Override
    public void destroy() {
        //服务器关闭的时候
        System.out.println("Filter Destory");
    }
}
