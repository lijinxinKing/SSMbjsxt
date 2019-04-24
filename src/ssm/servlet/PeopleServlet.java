package ssm.servlet;
import ssm.pojo.PageInfo;
import ssm.pojo.People;
import ssm.service.PeopleService;
import ssm.service.impl.PeopleServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/people")
public class PeopleServlet extends HttpServlet {
    private PeopleService peopleService = new PeopleServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");


        String size = req.getParameter("pageSize");
        String number = req.getParameter("pageNumber");
        int pageSize = 2;
        int pageNumber= 1;
        if(size!=null && number != null){
            pageSize      = Integer.parseInt(size);
            pageNumber  = Integer.parseInt(number);
        }

        PageInfo pageInfo = peopleService.showPage(pageSize,pageNumber);
        req.setAttribute("pageInfo", pageInfo);
        System.out.println(pageInfo);
        //从当前资源出发 找到 其他资源的过程
        req.getRequestDispatcher("/pageinfo.jsp").forward(req,resp);

    }
}
