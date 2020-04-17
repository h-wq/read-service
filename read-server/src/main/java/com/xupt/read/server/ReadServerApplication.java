package com.xupt.read.server;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableDubboConfiguration
@EnableAsync
@MapperScan(basePackages = "com.hello.micro.service.mapper")
public class ReadServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadServerApplication.class, args);
	}

}
