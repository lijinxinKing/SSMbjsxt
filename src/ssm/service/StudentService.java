package ssm.service;

import ssm.pojo.PageInfo;

public interface StudentService {
    PageInfo showPageInfo(String sname,String tname,String pageSize,String pageNumber);
}
