package ssm.servlet.test;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import java.util.List;

@WebServlet("/validcode")
public class DemoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedImage image = new BufferedImage(200,100,BufferedImage.TYPE_INT_RGB);

        //向画板
        Random random = new Random();
        Graphics2D gra = image.createGraphics();
        Color []colors = new Color[]{Color.RED,Color.GREEN,Color.PINK,Color.BLUE};

        //加粗 倾斜
        Font font = new Font("黑体",Font.BOLD|Font.ITALIC,30);
        gra.setFont(font);
        gra.fillRect(0,0,200,100);
        gra.drawLine(0,0,100,50);
        List<Integer> randList = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            gra.setColor(colors[random.nextInt(colors.length)]);
            randList.add(random.nextInt(10));
        }

        for (int i = 0; i <4; i++){
            gra.drawString(randList.get(i).toString(),i*40,50+(random.nextInt(21)-10));
        }

        ServletOutputStream outputStream = resp.getOutputStream();
        ImageIO.write(image,"jpg",outputStream);
        HttpSession session = req.getSession();
        session.setAttribute("code",""+randList.get(0)+randList.get(1)+randList.get(2)+randList.get(3));
    }
}
