package com.cloud.producer.clontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: ClarkRao
 * @Date: 2019/2/23 17:19
 * @Description:
 */
@RestController
public class HelloController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        try {
            String url = Inet4Address.getLocalHost().getHostAddress() + ":" + port;
            return "hello " + name + ", this is the first message from " + url;
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "error";
    }
}
