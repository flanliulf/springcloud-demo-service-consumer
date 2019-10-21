package com.fancyliu.springcloud.demo.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 类描述:
 * 自定义相关 web 配置
 *
 * @author : Liu Fan
 * @date : 2019/10/21 13:56
 */
@Configuration
public class CustomerWebConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
