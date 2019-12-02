package com.yt.controller;

import com.yt.service.ISimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ssm")
public class SimpleController {

    @Autowired
    private ISimpleService simpleService;

    @RequestMapping("/getUserInfo")
    public Object getUserInfo(@RequestParam(value = "id") Integer id){
        return simpleService.getUserInfo(id);
    }
}
