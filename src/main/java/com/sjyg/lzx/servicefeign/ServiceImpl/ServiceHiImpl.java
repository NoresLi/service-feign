package com.sjyg.lzx.servicefeign.ServiceImpl;

import com.sjyg.lzx.servicefeign.Service.ServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author lzx
 * @create 2019-07-10
 */
@Component
public class ServiceHiImpl implements ServiceHi {

    @Override
    public String sayHi(String name) {
        return "sorry! "+name+", application is error!";
    }
}
