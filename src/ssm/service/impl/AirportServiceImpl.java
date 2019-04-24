package ssm.service.impl;

import org.apache.ibatis.session.SqlSession;
import ssm.mapper.test.AirportMapper;

import ssm.pojo.Airport;
import ssm.service.AirportService;
import ssm.util.MyBatisUtil;

import java.util.List;

public class AirportServiceImpl implements AirportService {

    public AirportMapper getAirportMapper() {
        return airportMapper;
    }

    public void setAirportMapper(AirportMapper airportMapper) {
        this.airportMapper = airportMapper;
    }

    private AirportMapper airportMapper;
    @Override
    public List<Airport> selTakePort() {
        SqlSession session =  MyBatisUtil.getSession();
        ssm.mapper.AirportMapper aiportMapper =  session.getMapper(ssm.mapper.AirportMapper.class);
        return aiportMapper.selTakePort();
    }

    @Override
    public List<Airport> selLandPort() {
        SqlSession session =  MyBatisUtil.getSession();
        ssm.mapper.AirportMapper aiportMapper =  session.getMapper(ssm.mapper.AirportMapper.class);
        return aiportMapper.selLandPort();
    }

    @Override
    public List<Airport> selAll() {
        return airportMapper.selAll();
    }
}
