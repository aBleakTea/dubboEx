package com.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.service.UserService;

@Controller
@RequestMapping("/User")
public class UserController {

    //远程注入（来自dubbo)
    @Reference(version = "1.0")
    public UserService service;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return service.sayHello();
    }

}
