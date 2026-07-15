package example.tliaswebmanagement.mapper;

import example.tliaswebmanagement.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {
    @Select("select * from dept")
    List<Dept> list();

    @Delete("delete from dept where id = #{id}")
    void deleteById(int id);

    @Insert("insert into dept(name,create_time,update_time) values (#{name},#{createTime},#{updateTime})")
    void add(Dept dept);

    @Update("update dept set name = #{dept.name} where id = #{id}")
    void updateById(@Param("id") Integer id,@Param("dept") Dept dept);
}