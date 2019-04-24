package ssm.service;

import ssm.pojo.Flower;

import java.util.List;

public interface FlowerService {
    public List<Flower>showAll();
    public int add(Flower flower);
}
