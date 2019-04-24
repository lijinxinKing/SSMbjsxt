package ssm.service.impl;

import ssm.mapper.AirplaneMapper;
import ssm.pojo.Airplane;
import ssm.service.AirplaneService;
import ssm.util.MyBatisUtil;

import java.util.List;

public class AirplaneServiceImpl implements AirplaneService {

    @Override
    public List<Airplane> show(int takeid, int landid) {
        return MyBatisUtil.getSession().getMapper(AirplaneMapper.class).selByTakeidLandid(takeid,landid);
    }
}
