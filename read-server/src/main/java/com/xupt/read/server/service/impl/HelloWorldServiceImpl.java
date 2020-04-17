package com.xupt.read.server.service.impl;

import com.xupt.read.server.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public String helloWorld() {
        return "success, helloWorld";
    }
}
