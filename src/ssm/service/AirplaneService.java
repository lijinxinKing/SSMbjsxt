package ssm.service;

import ssm.pojo.Airplane;

import java.util.List;

public interface AirplaneService {
    List<Airplane>show(int takeid,int landid);
}
