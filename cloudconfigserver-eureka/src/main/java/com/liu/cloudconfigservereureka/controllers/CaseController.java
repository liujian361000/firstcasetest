package com.liu.cloudconfigservereureka.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CaseController {

    String name;

    @RequestMapping("/hi")
    public String hi(){
        List<String> list=new ArrayList<>();
        list.add("张三");
        list.add("里斯");
        list.add("王武");
        list.add("赵六");
        list.clear();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        name="刘建";
        this.getName();
        System.out.println(name);
        return "hi";
    }

    public String getName(){
        return name;
    }

}
