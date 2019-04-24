package ssm.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

// 类被加载后 就被产生
public class MyBatisUtil {
    private static SqlSessionFactory sqlSessionFactory = null;
    private static ThreadLocal<SqlSession> tl = new ThreadLocal<>();

    //经常被使用
    public static SqlSession getSession(){
        SqlSession session = tl.get();
        if(session == null){
            try {
                InputStream is = Resources.getResourceAsStream("mybatis.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
                SqlSession sqlSession = sqlSessionFactory.openSession();
                tl.set(sqlSession);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return tl.get();
    }

    public static void CloseSession(){
        SqlSession session = tl.get();
        if (session !=null){
            session.close();
        }
        tl.set(null);
    }
}



