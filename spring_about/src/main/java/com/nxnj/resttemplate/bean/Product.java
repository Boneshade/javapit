package com.nxnj.resttemplate.bean;

import java.math.BigDecimal;

/**
 * @author xubr
 * @title: Product
 * @projectName javapit
 * @description: <h1></h1>
 * @date 2021/3/1611:11
 */
public class Product {

    private Integer id;

    private String name;

    private BigDecimal price;

    public Product() {
    }

    public Product(Integer id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
