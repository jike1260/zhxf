package com.product.service.impl;

import com.common.pojo.Product;
import com.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @ClassName ProductApiImpl
 * @Description //TODO
 * @Author lz
 * @Date 15:03 2020/11/6
 */
@Service
public class ProductApiImpl implements ProductService {

    @Override
    public String getProdInfo() {
        return new Product(1, "手机", new BigDecimal(2399), 100).toString();
    }
}
