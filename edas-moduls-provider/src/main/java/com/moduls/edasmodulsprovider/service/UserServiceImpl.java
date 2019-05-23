package com.moduls.edasmodulsprovider.service;

import com.moduls.edasmodulsapi.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @description: 作为服务的提供者的接口实现
 * @program: edas-moduls-provider
 * @author: fangkun
 * @version： 1.0.0
 * @create: 2019-05-23
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String gainStr(String str) {
        return str+">>>>>>";
    }
}
