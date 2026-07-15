package example.tliaswebmanagement.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import example.tliaswebmanagement.mapper.EmpMapper;
import example.tliaswebmanagement.pojo.Emp;
import example.tliaswebmanagement.pojo.PageBean;
import example.tliaswebmanagement.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end) {
        PageHelper.startPage(page, pageSize);
        Page<Emp> list = (Page<Emp>) empMapper.list(name, gender, begin, end);

        PageBean pageBean = new PageBean(list.getTotal(), list.getResult());

        return pageBean;
    }
}
