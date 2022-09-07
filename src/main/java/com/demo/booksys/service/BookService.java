package com.demo.booksys.service;


import com.demo.booksys.domain.Book;
import com.demo.booksys.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookService {
    @Resource
    @Autowired
    private BookMapper bookMapper;

    public List<Book> list() {
        return bookMapper.list();
    }
}
