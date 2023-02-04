package com.leetest.service.imp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leetest.dao.bookdao;
import com.leetest.pojo.test;
import com.leetest.service.bookservice;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class bookserviceimp implements bookservice {
    @Autowired
    private bookdao bookdao;
    @Override
    public boolean save(test test) {
        return bookdao.save(test) >0;
    }

    @Override
    public boolean delect(Integer id) {
        return bookdao.delect(id) >0;
    }

    @Override
    public boolean update(test test) {
        return bookdao.updateById(test)>0;
    }

    @Override
    public test getid(Integer id) {
        return bookdao.getid(id);
    }

    @Override
    public List<test> getAll() {
        return bookdao.selectList(null);
    }

    @Override
    public IPage<test> getpage(int currentpage, int pagesize) {
        IPage page = new Page(currentpage,pagesize);
        return bookdao.selectPage(page,null);
    }

    @Override
    public IPage<test> getpage(int currentpage, int pagesize, test test1) {
        LambdaQueryWrapper<test> queryWrapper = new LambdaQueryWrapper<test>();
queryWrapper.like(Strings.isNotEmpty(test1.getType()),test::getType,test1.getType());
queryWrapper.like(Strings.isNotEmpty(test1.getName()),test::getName,test1.getName());
queryWrapper.like(Strings.isNotEmpty(test1.getDescription()),test::getDescription,test1.getDescription());
        IPage page = new Page(currentpage,pagesize);
        return bookdao.selectPage(page,queryWrapper);
    }
}
