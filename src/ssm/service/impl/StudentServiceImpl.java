package ssm.service.impl;

import org.apache.ibatis.session.SqlSession;
import ssm.mapper.StudentMapper;
import ssm.mapper.teacherMapper;
import ssm.pojo.PageInfo;
import ssm.pojo.Student;
import ssm.service.StudentService;
import ssm.util.MyBatisUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Override
    public PageInfo showPageInfo(String sname, String tname, String pageSizeStr, String pageNumberStr) {
        int pageSize = 2;
        if(pageSizeStr != null && !pageSizeStr.equals("")){
            pageSize = Integer.parseInt(pageSizeStr);

        }
        if(sname==null||sname.equals("")){
            sname="学生4";
        }

        if(tname==null||tname.equals("")){
            tname="李老师";
        }

        int pageNumber = 1;
        if(pageNumberStr != null && !pageNumberStr.equals("")){
            pageNumber = Integer.parseInt(pageNumberStr);
        }
        SqlSession session = MyBatisUtil.getSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);

        PageInfo pi = new PageInfo();
        pi.setPageNumber(pageNumber);
        pi.setPageSize(pageSize);
        pi.setPageStart((pageNumber-1)*pageSize);
        pi.setTname(tname);
        pi.setSname(sname);

        // 查询出

        List<Student> students = studentMapper.selByPage(pi);
        pi.setList(students);

        teacherMapper teachermapper = session.getMapper(teacherMapper.class);

        //每个学生对应的老师信息

        for (Student student: students){
            student.setTeacher(teachermapper.selById(student.getTid()));
        }

        Long count =  studentMapper.selCountByPageInfo(pi);
        pi.setTotal(count%pageSize==0?count/pageSize:count/pageSize+1);

        return pi;
    }
}
