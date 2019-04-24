package ssm.service.impl;

import ssm.dao.FlowerDao;
import ssm.dao.impl.FlowerDaoImpl;
import ssm.pojo.Flower;
import ssm.service.FlowerService;

import java.util.List;

public class FlowerServiceImpl implements FlowerService {

    private FlowerDao flowerDao = new FlowerDaoImpl();
    @Override
    public List<Flower> showAll() {
        return flowerDao.selectAll();
    }

    @Override
    public int add(Flower flower) {
        int result = flowerDao.insertFlower(flower);
        return result;
    }
    public int CurrentFlowerCount(){

        return flowerDao.selectAll().size();

    }
}
