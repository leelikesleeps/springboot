package com.leetest.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.leetest.pojo.R;
import com.leetest.pojo.test;
import com.leetest.service.bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tests")
public class testcontroller {
    @Autowired
    private bookservice bookservice;
  @PostMapping
    public R save(@RequestBody test test){
    boolean save = bookservice.save(test);
    return new R(save,save?"操作成功":"操作失败") ;
  }
  @DeleteMapping("{id}")
    public R delect(@PathVariable Integer id){
    return new R(bookservice.delect(id)) ;
  }
  @PutMapping
    public R update(@RequestBody test test){
    return new R(bookservice.update(test)) ;
  }
  @GetMapping
    public R getAll(){

    return  new R(true,bookservice.getAll()) ;
  }
  @GetMapping("{cur}/{size}")
  public R getpage(@PathVariable int cur,@PathVariable int size,test test){
    IPage<test> page = bookservice.getpage(cur, size,test);
    if(cur>page.getPages()){
      page = bookservice.getpage((int) page.getPages(), size,test);
    }
    return  new R(true, page);
  }
  @GetMapping("{id}")
  public  R getid(@PathVariable Integer id){
    return new R(true,bookservice.getid(id)) ;
  }
}
