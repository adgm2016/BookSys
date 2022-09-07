package com.demo.booksys.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.demo")
@SpringBootApplication
@MapperScan("com.demo.booksys.mapper")
public class BookSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookSysApplication.class, args);
    }


}
