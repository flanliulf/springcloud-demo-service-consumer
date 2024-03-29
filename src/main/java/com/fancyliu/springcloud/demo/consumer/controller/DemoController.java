package com.fancyliu.springcloud.demo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 类描述:
 * Demo Controller, 演示 web 接口调用
 *
 * @author : Liu Fan
 * @date : 2019/10/21 13:34
 */
@RestController
@RequestMapping("/consumer")
public class DemoController {

    /**
     * 定义服务提供方的 url 地址
     */
    private static final String SERVICE_PROVIDER = "http://localhost:8090/product";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello(String msg) {

        String result = "hello " + msg;
        System.out.println(result);

        return result;
    }

    @GetMapping("/api/list")
    public String apiList() {

        String url = SERVICE_PROVIDER + "/list";
        List list = restTemplate.getForObject(url, List.class);

        return list.toString();
    }

}
