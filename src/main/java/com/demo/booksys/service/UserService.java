package com.demo.booksys.service;

import com.demo.booksys.domain.User;
import com.demo.booksys.domain.UserExample;
import com.demo.booksys.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserService {

    @Resource
    @Autowired
    private UserMapper userMapper;
    public List<User> getAllUser(){
        return userMapper.selectByExample(null);
    }

}
