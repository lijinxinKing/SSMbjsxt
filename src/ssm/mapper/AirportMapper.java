package ssm.mapper;

import org.apache.ibatis.annotations.Select;
import ssm.pojo.Airport;

import java.util.List;

public interface AirportMapper {

    // 查询起飞机场
    @Select("select *from airport where id in(select distinct takeid from airplane)")
    List<Airport>selTakePort();

    // 查询降落机场
    @Select("select *from airport where id in(select distinct landid from airplane)")
    List<Airport>selLandPort();

    @Select("select *from airport")
    List<Airport> selAll();
}
