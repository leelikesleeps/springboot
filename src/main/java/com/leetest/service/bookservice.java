package com.leetest.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.leetest.pojo.test;

import java.util.List;

public interface bookservice {
    boolean save(test test);
    boolean delect(Integer id);
    boolean update(test test);
    test getid(Integer id);
    List<test> getAll();
    IPage<test> getpage(int currentpage,int pagesize);
    IPage<test> getpage(int currentpage,int pagesize,test test);
}
