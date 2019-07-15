package com.sjyg.lzx.servicefeign.Service;

import com.sjyg.lzx.servicefeign.ServiceImpl.ServiceHiImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lzx
 * @create 2019-07-10
 */
@FeignClient(value = "service-hi",fallback = ServiceHiImpl.class)
public interface ServiceHi {

    @GetMapping(value = "/hi")
    String sayHi(@RequestParam("name") String name);
}
