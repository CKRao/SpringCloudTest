package com.cloud2.consumer.remote;

import com.cloud2.consumer.hystric.SchedualServiceHelloHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: ClarkRao
 * @Date: 2019/2/23 17:45
 * @Description:
 */
@FeignClient(name= "spring-cloud-producer",fallback = SchedualServiceHelloHystric.class)
public interface HelloRemote {

    @RequestMapping("/hello")
    String hello(@RequestParam(value = "name") String name);
}
