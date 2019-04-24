package ssm.servlet;


import ssm.pojo.Flower;
import ssm.service.FlowerService;
import ssm.service.impl.FlowerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// tomcat必须是7以上，
// web 必须是3.0 以上
@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
    private FlowerService flowerService = new FlowerServiceImpl();
    @Override
    protected void service(HttpServletRequest servletRequest, HttpServletResponse resp) throws ServletException, IOException {
        String flowerName = servletRequest.getParameter("flowerName");
        String flowerPrice = servletRequest.getParameter("flowerPrice");
        String flowerLocation = servletRequest.getParameter("flowerLocation");
        int id = flowerService.showAll().size();
        Flower flower = new Flower(id,flowerName,Double.parseDouble(flowerPrice),flowerLocation);
        int result = flowerService.add(flower);
        if(result >0){
            resp.sendRedirect("flower");
            //防止表单重复提交
        }else {
            System.out.println(flower);
        }
    }
}
