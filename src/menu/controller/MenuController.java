package menu.controller;

import menu.pojo.Menu;
import menu.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MenuController {
    @Resource//by name 进行注入 (menuService by type) spring mvc 调用 spring 容器的内容
    private MenuService menuServiceImpl;

    @ResponseBody
    @RequestMapping("show")
    public List<Menu>show(HttpServletRequest request){
        request.setAttribute("test","结果显示");
        return menuServiceImpl.Show();
    }
}
