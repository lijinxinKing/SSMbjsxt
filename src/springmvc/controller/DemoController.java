package springmvc.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.pojo.People;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class DemoController {

    @RequestMapping("demo")
    public String test(HttpSession session){
        session.setAttribute("test","value");
        return "/WEB-INF/jsp/main.jsp";
    }

    @RequestMapping("demo1")
    public String demo1(@Param("username") String username, String password, HttpSession session){
        System.out.println(session.getId());
        System.out.println(username +", " + password);
        return "";
    }

    @ResponseBody
    @RequestMapping("demo2")
    public People demo2(@Param("username") String username, String password){
        People p = new People();
        p.setAge(1);
        p.setName("李金鑫");
        return p;
    }
}
