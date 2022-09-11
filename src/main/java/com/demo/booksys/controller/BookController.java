package com.demo.booksys.controller;

import com.demo.booksys.domain.Book;
import com.demo.booksys.req.BookReq;
import com.demo.booksys.resp.BookResp;
import com.demo.booksys.service.BookService;
import com.demo.booksys.common.BaseResponse;
import com.demo.booksys.common.RespGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
    public BaseResponse<BookResp> list(BookReq req) {
        return RespGenerator.returnOK(bookService.list(req));
    }


//    @ApiOperation(value = "插入图书")
//    @GetMapping("/insert")

//     "author": "",
//             "bookName": "",
//             "description": "",
//             "id": 1,
//             "location": "",
//             "publishTime": 1,
//             "publisher": "",
//             "status": 1,
//             "type": "",
//    public BaseResponse<Book> insertSelective(Book book, @RequestParam(value = "file", required = false)) {
//        if (file == null){
//
//        }
//        return RespGenerator.returnOK(bookService.insertSelective(book));
//    }

    @ApiOperation(value = "根据ID查找图书")
    @GetMapping("getBookById")
    public BaseResponse<Book> getBookById(Integer id){
        return RespGenerator.returnOK(bookService.getBookById(id));
    }
}
