package com.leetest.dao.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leetest.pojo.test;
import com.leetest.service.bookservice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class servicetest {
@Autowired
    private bookservice bookservice;
@Test
    public void save(){
    System.out.println(bookservice.getid(1));
}
@Test
    void delect(){
    bookservice.delect(10);
}
@Test
    void update(){
    test test = new test();
    test.setId(9);
    test.setName("desila");
    bookservice.update(test);
}
@Test
    void getpage(){
    IPage<test> page = bookservice.getpage(1, 5);
    System.out.println(page.getCurrent());
    System.out.println(page.getSize());
    System.out.println(page.getPages());
    System.out.println(page.getTotal());
    System.out.println(page.getRecords());
}
}
