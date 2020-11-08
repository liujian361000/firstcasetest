package com.liu.cloudconfigservereureka.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaseController {
    
    String name;
    
    public void sayHi(){
        
    }

    @RequestMapping("/hi")
    public String hi(){
        name="liujian";
        return "hi";
    }

}
