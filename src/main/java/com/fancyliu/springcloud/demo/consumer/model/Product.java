package com.fancyliu.springcloud.demo.consumer.model;

import lombok.Data;

/**
 * 类描述:
 * 用来接收 Product 实体类
 *
 * @author : Liu Fan
 * @date : 2019/10/21 14:06
 */
@Data
public class Product {

    private int id;
    private String name;

}