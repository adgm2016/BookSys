package com.demo.booksys.controller;

import com.demo.booksys.domain.Book;
import com.demo.booksys.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BookController {
    @GetMapping ("/hello")
    public String hello() {
        return "hello world";
    }
    @Resource
    private BookService bookService;

    @GetMapping("book/list")
    public List<Book> list() {
        return bookService.list();
    }
}
