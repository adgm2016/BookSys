package com.demo.booksys.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan("com.demo")
@SpringBootApplication
@MapperScan("com.demo.booksys.mapper")
@EnableSwagger2
public class BookSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookSysApplication.class, args);
    }


}
