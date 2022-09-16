package com.demo.booksys.config;

import com.oracle.tools.packager.Log;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@ComponentScan("com.demo")
@SpringBootApplication
@MapperScan("com.demo.booksys.mapper")
@EnableSwagger2
public class BookSysApplication {

    public static void main(String[] args) {
        final Logger LOG = LoggerFactory.getLogger(BookSysApplication.class);
        SpringApplication springApplication = new SpringApplication(BookSysApplication.class);

        //logback
        //设置循环注入问题
        springApplication.setAllowCircularReferences(Boolean.TRUE);
        Environment env = springApplication.run(args).getEnvironment();

        LOG.info("启动成功！");
        LOG.info("地址：http://127.0.0.1:{}",env.getProperty("server.port"));
        LOG.info("swagger测试文档地址：http://127.0.0.1:{}/doc.html",env.getProperty("server.port"));

        LOG.info("仅供调试时使用！");
    }


}
