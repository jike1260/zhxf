package com.product.controller;

import com.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ProductController
 * @Description //TODO
 * @Author lz
 * @Date 12:00 2020/11/17
 */
@RequestMapping("/prod")
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/getProdInfo")
    public String getProdInfo(){
        String Info = productService.getProdInfo();
        return "getProdInfo | " + Info;
    }
}
