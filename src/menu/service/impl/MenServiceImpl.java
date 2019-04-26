package menu.service.impl;

import menu.mapper.MenuMapper;
import menu.pojo.Menu;
import menu.service.MenuService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class MenServiceImpl implements MenuService
{

    @Resource  //or @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> Show() {
        String result = "结果显示";

        return  menuMapper.selByPid(0);
    }
}
