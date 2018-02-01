package com.example.springcloud.servicefeign.hystrix;

import com.example.springcloud.servicefeign.api.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloHystrix implements HelloService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }

}
