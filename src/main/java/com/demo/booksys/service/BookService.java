package com.demo.booksys.service;


import com.demo.booksys.domain.Book;
import com.demo.booksys.domain.BookExample;
import com.demo.booksys.mapper.BookMapper;
import com.demo.booksys.req.BookReq;
import com.demo.booksys.resp.BookResp;
import com.demo.booksys.utils.CopyUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Resource
    @Autowired
    private BookMapper bookMapper;


    public List<BookResp> list(BookReq req) {
        PageHelper.startPage(1,3);
        BookExample bookExample = new BookExample();
//        BookExample.Criteria criteria = bookExample.createCriteria();
        BookExample.Criteria criteria = bookExample.createCriteria();

        //通过bookname查询
        if(!ObjectUtils.isEmpty(req.getBookName())){
            criteria.andBookNameLike("%" + req.getBookName() + "%" );
        }


        List<Book> bookList = bookMapper.selectByExample(bookExample);


        //分页
        PageInfo<Book> pageInfo = new PageInfo<>(bookList);
        

//        List<BookResp> respList = new ArrayList<>();
//        for (Book book : bookList) {
//            BookResp bookResp = new BookResp();
//            BeanUtils.copyProperties(book,bookResp);
//            respList.add(bookResp);
//        }
        List<BookResp> list = CopyUtils.copyList(bookList,BookResp.class);
        return list;
    }

   public Book getBookById(Integer id){
        return bookMapper.selectByPrimaryKey(id);
   }

    public int insertSelective(Book book){

        return bookMapper.insertSelective(book);
    }
}
