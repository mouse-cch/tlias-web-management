package example.tliaswebmanagement.service.impl;

import example.tliaswebmanagement.mapper.DeptMapper;
import example.tliaswebmanagement.pojo.Dept;
import example.tliaswebmanagement.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }

    @Override
    public void deleteById(Integer id) {
        deptMapper.deleteById(id);
    }

    @Override
    public void add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.add(dept);
    }

    @Override
    public void updateById(Integer id, Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.updateById(id,dept);
    }
}
