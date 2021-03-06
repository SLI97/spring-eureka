package com.sli.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-gateway")
public interface RemoteServer {

    @GetMapping("hello")
    public String returnYourStr(@RequestParam("str") String str);
}
