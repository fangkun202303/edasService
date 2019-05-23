package com.moduls.edasmodulsconsumer.feigin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @description: 用Feigin做的调用接口
 * @program: edas-moduls-consumer
 * @author: fangkun
 * @version： 1.0.0
 * @create: 2019-05-23
 */
@FeignClient(value = "edas-moduls-provider")
public interface EdasFeiginInterface {

    @PostMapping(value = "/edas/getStr/{str}",consumes="application/json")
    public String gainStr(@PathVariable("str") String str);


    @PostMapping("/edas/str")
    public String getStr(@RequestParam("str") String str);
}
