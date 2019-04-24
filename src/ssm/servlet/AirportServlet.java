package ssm.servlet;

import ssm.pojo.Airport;
import ssm.service.AirportService;
import ssm.service.impl.AirportServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/showairport")
public class AirportServlet extends HttpServlet {

    private AirportService aitportService = new AirportServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        List<Airport> landPort =  aitportService.selLandPort();
        List<Airport> takePort = aitportService.selLandPort();
        req.setAttribute("landPort", landPort);
        req.setAttribute("takePort", takePort);
        System.out.println(landPort);
        //resp.getWriter().write(landPort.toString());
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
