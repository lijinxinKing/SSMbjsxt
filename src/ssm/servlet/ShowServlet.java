package ssm.servlet;

import ssm.pojo.Flower;
import ssm.pojo.PageInfo;
import ssm.service.FlowerService;
import ssm.service.StudentService;
import ssm.service.impl.FlowerServiceImpl;
import ssm.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.List;

@WebServlet("/student")
public class ShowServlet extends HttpServlet {
    private FlowerService flowerService = new FlowerServiceImpl();
    private StudentService studentService = new StudentServiceImpl();
    @Override
    public void service(ServletRequest req, ServletResponse servletResponse) throws ServletException, IOException {
        String sname = req.getParameter("sname");
        if(sname!=null && !sname.equals(""))
            sname = new String(sname.getBytes("iso-8859-1"),"utf-8");

        String tname = req.getParameter("tname");
        if(tname!=null && !tname.equals(""))
            tname = new String(tname.getBytes("iso-8859-1"),"utf-8");

        String pageSize  = req.getParameter("pageSize");
        String pageNumbwe = req.getParameter("pageNumber");

        PageInfo pi = studentService.showPageInfo(sname,tname,pageSize,pageNumbwe);
        req.setAttribute("pageInfo",pi);
        System.out.println(pi);
        req.getRequestDispatcher("index.jsp").forward(req, servletResponse);

     }
}



