package com.cloud2.consumer.hystric;

import com.cloud2.consumer.remote.HelloRemote;
import org.springframework.stereotype.Component;

/**
 * @Author: ClarkRao
 * @Date: 2019/2/24 0:16
 * @Description:
 */
@Component
public class SchedualServiceHelloHystric implements HelloRemote {
    @Override
    public String hello(String name) {
        return "sorry " + name;
    }
}
