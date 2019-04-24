package ssm.filter;

import org.apache.ibatis.session.SqlSession;
import ssm.util.MyBatisUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


public class OpenSessionInView implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        SqlSession sql = MyBatisUtil.getSession();
        try{
            filterChain.doFilter(servletRequest,servletResponse);
           // sql.commit();
        }catch (Exception ex){
            sql.rollback();
            ex.printStackTrace();
        }finally {
            MyBatisUtil.CloseSession();
        }
    }

    @Override
    public void destroy() {

    }
}
