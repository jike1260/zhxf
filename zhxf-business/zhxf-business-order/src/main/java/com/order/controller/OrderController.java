package com.order.controller;

import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description //TODO
 * @Author lz
 * @Date 12:09 2020/11/17
 */
@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/getOrderInfo")
    public String getOrderInfo(){
        String prodInfo = orderService.getProdInfo();
        return "prodInfo | " + prodInfo;
    }
}
