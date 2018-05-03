package com.bufoon.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: bufoon
 * @Email: 285395841@qq.com
 * @Datetime: Created In 2018/4/7 22:22
 * @Desc: as follows.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.bufoon.*"})
@MapperScan(basePackages = {"com.bufoon.demo.mapper"})
public class DemoApp {
    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class, args);
    }
}
