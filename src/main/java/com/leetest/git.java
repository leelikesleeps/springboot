package com.leetest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boot")
public class git {
    public String z(){
        System.out.println("1");
        System.out.println("1");
        return "ok";
    }


}
