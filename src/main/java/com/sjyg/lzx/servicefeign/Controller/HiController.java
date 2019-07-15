package com.sjyg.lzx.servicefeign.Controller;

import com.sjyg.lzx.servicefeign.Service.ServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzx
 * @create 2019-07-10
 */
@RestController
public class HiController{

    @Autowired
    ServiceHi serviceHi;

    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam("name") String name){
        return serviceHi.sayHi(name);
    }
}
