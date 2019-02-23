package com.cloud2.consumer.controller;

import com.cloud2.consumer.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ClarkRao
 * @Date: 2019/2/23 17:46
 * @Description:
 */
@RestController
public class HelloController {
    @Autowired
    HelloRemote HelloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return HelloRemote.hello(name);
    }
}
