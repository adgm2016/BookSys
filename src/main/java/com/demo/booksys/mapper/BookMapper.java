package com.demo.booksys.mapper;

import com.demo.booksys.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {

    public List<Book> list();
}
