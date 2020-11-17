package com.common.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName User
 * @Description //TODO
 * @Author lz
 * @Date 14:36 2020/11/9
 */
@SuppressWarnings("serial")
public class Product implements Serializable {
    private Integer id;
    private String name;
    private BigDecimal price;
    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Product(Integer id, String name, BigDecimal price, Integer num) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }
}
