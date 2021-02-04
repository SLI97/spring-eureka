package com.sli.client.controller;

import com.sli.api.RemoteServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    private RemoteServer remoteService;

    @RequestMapping("test")
    public String test(@RequestParam String str){
        return remoteService.returnYourStr(str);
    }

}
