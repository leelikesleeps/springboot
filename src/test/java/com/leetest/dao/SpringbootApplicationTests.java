package com.leetest.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leetest.dao.bookdao;
import com.leetest.pojo.test;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {
@Autowired
private bookdao bookdao;
    @Test
    void contextLoads() {
        System.out.println(bookdao.getid(1));
    }
    @Test
    void save(){
        test book = new test();
        book.setName("测试");
        book.setType("123");
        book.setDescription("test3");
        bookdao.save(book);
    }
    @Test
    void delect(){
        bookdao.delect(5);
    }
    @Test
    void selectpage(){
       IPage page = new Page(1,5);
        bookdao.selectPage(page,null);
    }
    @Test
    void conditionget(){
        String name="1";
        LambdaQueryWrapper<test> objectLambdaQueryWrapper = new LambdaQueryWrapper<>();
        objectLambdaQueryWrapper.like(name!=null,test::getName,name);
        bookdao.selectList(objectLambdaQueryWrapper);
    }

}
