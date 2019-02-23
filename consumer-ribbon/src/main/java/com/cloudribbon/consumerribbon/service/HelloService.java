package com.cloudribbon.consumerribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ClarkRao
 * @Date: 2019/2/23 23:14
 * @Description:
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String helloService(String name) {
        return restTemplate.getForObject("http://SPRING-CLOUD-PRODUCER/hello?name="+name,String.class);
    }
}
