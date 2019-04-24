package ssm.dao;

import ssm.pojo.Flower;

import java.util.List;

// 和数据库有关的名字 要查询数据库
public interface FlowerDao  {
    List<Flower> selectAll();
    int insertFlower(Flower flower);

}
