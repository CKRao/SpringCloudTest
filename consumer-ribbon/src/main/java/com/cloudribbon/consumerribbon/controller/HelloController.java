package com.cloudribbon.consumerribbon.controller;

import com.cloudribbon.consumerribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ClarkRao
 * @Date: 2019/2/23 23:24
 * @Description:
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        System.out.println("Ribbon");
        return helloService.helloService(name);
    }
}
