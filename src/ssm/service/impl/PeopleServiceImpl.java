package ssm.service.impl;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import ssm.pojo.PageInfo;
import ssm.pojo.People;
import ssm.service.PeopleService;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PeopleServiceImpl implements PeopleService {

    @Override
    public List<People> AllPeople() {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            SqlSession session = factory.openSession();
            List<People> allPeople = session.selectList("a.b.selPeople");
            session.close();
            return allPeople;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public People SelectPeopleById(int id) {

        try {
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            SqlSession session = factory.openSession();
            People people = session.selectOne("a.b.selById",id);
            session.close();
            return people;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public PageInfo showPage(int size, int number) {
        try{
            InputStream inputStream =  Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = factory.openSession();

            PageInfo pi = new PageInfo();
            pi.setPageNumber(number);// 第几页
            pi.setPageSize(size);   //
            Map<String,Object>map = new HashMap<>();
            map.put("pageStart", size*(number-1));
            map.put("pageSize",size);
            pi.setList(session.selectList("a.b.byPage", map));
            Long count = session.selectOne("a.b.selCount");
            System.out.println("selectOne: " + count);

            pi.setTotal(count/size==0?count/size:count/size+1);

            return pi;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
