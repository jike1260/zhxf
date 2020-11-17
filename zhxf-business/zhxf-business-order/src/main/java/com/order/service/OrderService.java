package com.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient("zhxf-business-product")
public interface OrderService {

    @GetMapping("/prod/getProdInfo")
    String getProdInfo();
}
