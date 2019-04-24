package com.servlet;


import com.pojo.Address;
import com.pojo.User;
import com.serviceimpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// 使用java脚本段语句
// Jsp 页面中使用

public class UserServlet extends HttpServlet {
    UserServiceImpl userServiceImpl = new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        req.setAttribute("listener","My Listener");
        // 监听器 监听 request 对象
        HttpSession session =  req.getSession();
        session.setAttribute("str","My Session ");
        String name = req.getParameter("name");
        if(name==null){
            System.out.println("get user failed");
        }else{

            User user =  userServiceImpl.ShowUser(name);
            User userAddress = new User(user.getId(),user.getName(),user.getPrice(),user.getPosotion(),new Address("hlj","heb","nangang") ,user.getDesc());
            req.setAttribute("str",userAddress);
            Map<String,String> map = new HashMap<>();
            map.put("a","黑龙江");
            map.put("b","北京");
            map.put("c","上海");
            req.setAttribute("city",map);
            //resp.getWriter().write(new Gson().toJson(user));
           // req.getRequestDispatcher("/el.jsp").forward(req,resp);
            System.out.println("get user" + user);
        }
    }
}
