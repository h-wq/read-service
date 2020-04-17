package com.xupt.read.server.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xupt.read.sdk.service.HelloWorldDubboService;
import com.xupt.read.server.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = HelloWorldDubboService.class)
public class HelloWorldDubboServiceImpl implements HelloWorldDubboService {

    @Autowired
    private HelloWorldService helloWorldService;

    @Override
    public String helloWorld() {
        return helloWorldService.helloWorld();
    }
}
