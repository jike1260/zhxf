package com.app.controller;

import com.app.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    AppService appService;

    @GetMapping("/getInfo")
    public String getInfo(){
        String orderInfo = appService.getOrderInfo();
        return "appInfo | " + orderInfo;
    }
}
