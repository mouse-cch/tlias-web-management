package example.tliaswebmanagement.mapper;

import example.tliaswebmanagement.pojo.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
//    @Select("select count(*) from emp")
//    Long count();
//
//    @Select("select * from emp limit #{start},#{pageSize}")
//    List<Emp> page(@Param("start") Integer start, @Param("pageSize") Integer pageSize);

   // @Select("select * from emp")
    List<Emp> list(@Param("name")String name, @Param("gender") Short gender,@Param("begin") LocalDate begin,@Param("end") LocalDate end);
    void delete(List<Integer> ids);

    @Insert("insert into emp(username,name,gender,image,job,entry_date,dept_id,create_time,update_time) " +
            "values(#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    void insert(Emp emp);
}
