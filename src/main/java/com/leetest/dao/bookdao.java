package com.leetest.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leetest.pojo.test;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface bookdao extends BaseMapper<test> {
    @Select("select *from tb_test where id=#{id}")
    public test getid(Integer id);
    @Insert("insert into tb_test VALUES (null,#{name},#{type},#{description})")
    int  save(test test);
    @Delete("delete from tb_test where id=#{id}")
    int  delect(Integer id);
}
