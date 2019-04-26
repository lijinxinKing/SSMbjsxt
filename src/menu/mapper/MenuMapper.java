package menu.mapper;

import menu.pojo.Menu;

import java.util.List;

public interface MenuMapper
{
    List<Menu> selByPid(int pid);
}
