package ssm.service;

import ssm.pojo.PageInfo;
import ssm.pojo.People;

import java.util.List;

public interface PeopleService {

    List<People> AllPeople();
    People SelectPeopleById(int id);

    PageInfo showPage(int size, int number);


}
