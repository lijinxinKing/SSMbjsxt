package ssm.mapper.test;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import ssm.pojo.Airport;

public interface AirportMapper {
    @Select("select * from airport")
    List<Airport> selAll();
}
