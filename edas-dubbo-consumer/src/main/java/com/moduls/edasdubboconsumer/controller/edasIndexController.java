package com.moduls.edasdubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.moduls.edasmodulsapi.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: edas+dubbo测试代码
 * @program: edas-dubbo-consumer
 * @author: fangkun
 * @version： 1.0.0
 * @create: 2019-05-23
 */
@RestController
public class edasIndexController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("/test/{str}")
    public String dubbotest(@PathVariable("str") String str){
        return str+"这是消费者调用,返回值是: "+userService.gainStr(str);
    }
}
