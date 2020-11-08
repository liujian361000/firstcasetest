package com.liu.cloudconfigservereureka.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CaseController {

    @RequestMapping("/hi")
    public String hi(){
        List<String> list=new ArrayList<>();
        list.add("张三");
        list.add("里斯");
        list.add("王武");
        list.add("赵六");
        return "hi";
    }

}
