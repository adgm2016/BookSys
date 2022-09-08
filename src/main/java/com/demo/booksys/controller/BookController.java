package com.demo.booksys.controller;

import com.demo.booksys.domain.Book;
import com.demo.booksys.service.BookService;
import com.demo.booksys.utils.BaseResponse;
import com.demo.booksys.utils.RespGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "图书接口")
@RequestMapping("/book")
public class BookController {
    @GetMapping ("/hello")
    @ApiOperation(value = "测试接口")

    public BaseResponse hello() {
        return RespGenerator.returnOK("hello world");
    }
    @Resource
    private BookService bookService;
    @ApiOperation(value = "图书列表")
    @GetMapping("/list")
    public BaseResponse<Book> list() {
        return RespGenerator.returnOK(bookService.list());
    }
}
