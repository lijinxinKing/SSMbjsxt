package ssm.mapper;

import org.apache.ibatis.annotations.Param;
import ssm.pojo.Airplane;
import java.util.List;

public interface AirplaneMapper {
    List<Airplane>selByTakeidLandid(@Param("takeid") int takeid,@Param("landid") int landid);
}
