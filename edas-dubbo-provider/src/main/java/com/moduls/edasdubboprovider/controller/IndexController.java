package com.moduls.edasdubboprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: edas+dubbo的测试代码
 * @program: edas-dubbo-provider
 * @author: fangkun
 * @version： 1.0.0
 * @create: 2019-05-23
 */
@RestController
public class IndexController {

    @GetMapping("/test/{str}")
    public String getstr(@PathVariable("str") String str){
        return "asdjsandlnajsnd"+str;
    }
}
