package com.app.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName AppService
 * @Description //TODO
 * @Author lz
 * @Date 12:14 2020/11/17
 */
@FeignClient("zhxf-business-order")
public interface AppService {

    @GetMapping("/order/getOrderInfo")
    String getOrderInfo();
}
