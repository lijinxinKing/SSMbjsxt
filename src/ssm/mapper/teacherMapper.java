package ssm.mapper;

import org.apache.ibatis.annotations.Select;
import ssm.pojo.Teacher;

public interface teacherMapper {
    @Select("select *from teacher where id = #{id}")
   Teacher selById(int id);
}
