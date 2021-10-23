package com.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    public String sayHello() {
        return "hello dubbo";
    }
}
