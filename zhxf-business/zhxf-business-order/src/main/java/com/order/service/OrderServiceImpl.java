package com.order.service;

import com.order.api.OrderService;
import com.product.api.ProductService;

/**
 * @ClassName OrderServiceImpl
 * @Description //TODO
 * @Author lz
 * @Date 14:26 2020/11/6
 */
@org.apache.dubbo.config.annotation.Service
public class OrderServiceImpl implements OrderService {

    @org.apache.dubbo.config.annotation.Reference
    ProductService productService;

    //dubbo接口实现
    @Override
    public String getInfo() {
        String info = productService.getInfo();
        System.out.println("dubbo orderService");
        return "dubbo orderService | " + info;
    }
}
