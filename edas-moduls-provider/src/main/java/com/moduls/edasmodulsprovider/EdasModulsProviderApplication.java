package com.moduls.edasmodulsprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //注解表明此应用需开启服务注册与发现功能。
public class EdasModulsProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EdasModulsProviderApplication.class, args);
    }

}
