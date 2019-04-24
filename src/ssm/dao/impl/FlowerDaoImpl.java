package ssm.dao.impl;

import ssm.dao.FlowerDao;
import ssm.pojo.Flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerDaoImpl implements FlowerDao
{
    List<Flower> flowers = new ArrayList<>();
    @Override
    public List<Flower> selectAll() {
        // 数据库 加载 驱动

        try{
            /*Class.forName("com.mysql.jdbc.Driver");
            Connection root = DriverManager.getConnection("", "root", "12345");
            String sql = "select *from flower";
            PreparedStatement ps = root.prepareStatement(sql);
            ResultSet rs =  ps.executeQuery();
            // 游标数据 是一行 数据
            while (rs.next()){
                Flower f = new Flower(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getString(4));
                flowers.add(f);
            }*/

            Flower f0 = new Flower(1,"百果",23.3,"巴西");
            Flower f1 = new Flower(2,"百香果",23.3,"墨西哥");
            Flower f2 = new Flower(3,"蔚蓝",23.3,"阿根廷");

            flowers.add(f0);
            flowers.add(f1);
            flowers.add(f2);


        }catch (Exception ex){
            ex.printStackTrace();
        }

       return flowers;
    }

    @Override
    public int insertFlower(Flower flower) {
        try{
            flowers.add(flower);
            return 1;
        }catch (Exception ex){
            return 0;
        }
    }
}
