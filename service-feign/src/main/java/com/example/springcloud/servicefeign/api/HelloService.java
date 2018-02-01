package com.example.springcloud.servicefeign.api;

import com.example.springcloud.servicefeign.hystrix.HelloHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "EUREKA-CLIENT", fallback = HelloHystrix.class)
public interface HelloService {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
