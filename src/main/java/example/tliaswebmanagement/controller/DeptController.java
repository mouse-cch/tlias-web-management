package example.tliaswebmanagement.controller;

import example.tliaswebmanagement.pojo.Dept;
import example.tliaswebmanagement.pojo.Result;
import example.tliaswebmanagement.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class DeptController {

    @Autowired
    private DeptService deptService;

//    @RequestMapping(value="/depts",method = RequestMethod.GET)
    @GetMapping("/depts")
    public Result list(){
        log.info("查询全部部门数据");
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    @DeleteMapping("/depts/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除id为{}的部门",id);
        deptService.deleteById(id);
        return Result.success();
    }

    @PostMapping("/depts")
    public Result add(@RequestBody Dept dept){
        log.info("添加部门{}",dept);
        deptService.add(dept);
        return Result.success();
    }

    @PostMapping("/depts/{id}")
    public Result update(@PathVariable Integer id,@RequestBody Dept dept){
        deptService.updateById(id,dept);
        return Result.success();
    }
}
