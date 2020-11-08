package com.liu.cloudconfigservereureka.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaseController {

    @RequestMapping("/hi")
    public String hi(){
        return "hi";
    }

}
