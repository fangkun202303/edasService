package com.moduls.edasmodulsprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @description: 测试edas的服务发现的controller
 * @program: edas-moduls-provider
 * @author: fangkun
 * @version： 1.0.0
 * @create: 2019-05-23
 */
@RestController
@RequestMapping("/edas")
public class EdasController {

    @Value("${edasmodulsprovider}")
    private String edasmodulsprovider;

    @PostMapping("/getStr/{str}")
    public String gainStr(@PathVariable("str") String str){
        return edasmodulsprovider+"=======>>>>>>>>>>>"+str;
    }

    @PostMapping("/str")
    public String getStr(@RequestParam("str") String str){
        return "提供者的结果: "+str;
    }
}
