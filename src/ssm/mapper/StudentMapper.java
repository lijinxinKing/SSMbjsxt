package ssm.mapper;

import ssm.pojo.PageInfo;
import ssm.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selByPage(PageInfo pi);
    long selCountByPageInfo(PageInfo pi);
}
