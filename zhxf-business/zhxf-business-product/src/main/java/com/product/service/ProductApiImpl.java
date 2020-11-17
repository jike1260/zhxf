package com.product.service;

import com.product.api.ProductService;

/**
 * @ClassName ProductApiImpl
 * @Description //TODO
 * @Author lz
 * @Date 15:03 2020/11/6
 */
@org.apache.dubbo.config.annotation.Service
public class ProductApiImpl implements ProductService {

    @Override
    public String getInfo() {
        System.out.println("dubbo productService");
        return "dubbo productService";
    }
}
