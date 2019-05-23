package com.moduls.edasdubboconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDubbo
public class EdasDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EdasDubboConsumerApplication.class, args);
    }

}
