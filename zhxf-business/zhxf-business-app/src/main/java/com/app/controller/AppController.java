package com.app.controller;

import com.order.api.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName BusController
 * @Description //TODO
 * @Author lz
 * @Date 13:53 2020/11/6
 */
@RequestMapping("/app")
@RestController
public class AppController {

    //注入service(基于dubbo协议)
    @org.apache.dubbo.config.annotation.Reference
    OrderService orderService;

    @GetMapping("/getInfo")
    public String getInfo(){
        String info = orderService.getInfo();
        return "getInfo ｜ " + info;
    }
}
