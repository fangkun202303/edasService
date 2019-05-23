package com.moduls.edasdubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.moduls.edasmodulsapi.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @description: edas+dubbo的测试服务实现
 * @program: edas-dubbo-provider
 * @author: fangkun
 * @version： 1.0.0
 * @create: 2019-05-23
 */
@Service(version = "$(dubbo.application.version)")
@Component  //将这个服务注入到ioc中为本服务提供bean
public class EdasDubboUserServiceImpl implements UserService {

    @Override
    public String gainStr(String str) {
        return str+"这是服务提供者";
    }
}
