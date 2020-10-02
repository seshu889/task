package com.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@ComponentScan
@ComponentScan(basePackages ="com.test1.*" )
@RestController
@Component
@EnableAutoConfiguration
@SpringBootApplication
public class CouponManagement {
private  final Message messahge1;

    public CouponManagement(Message messahge1) {
        this.messahge1 = messahge1;
    }

    @GetMapping("/msg")
public String msgs()
{
    return messahge1.message();
}
    public static void main(String[] args)
    {
        SpringApplication.run(CouponManagement.class,args);
    }
}
