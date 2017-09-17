package com.my.rabbit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping(value="/AA")
    public String init(){
        System.out.println("hello world");
        int a=0;
        return "";
    }
}
