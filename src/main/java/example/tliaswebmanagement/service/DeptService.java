package example.tliaswebmanagement.service;

import example.tliaswebmanagement.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> list();
    void deleteById(Integer id);
    void add(Dept dept);
    void updateById(Integer id,Dept dept);
}
