package com.demo.booksys.controller;

import com.demo.booksys.domain.Book;
import com.demo.booksys.domain.User;
import com.demo.booksys.service.UserService;
import com.demo.booksys.common.BaseResponse;
import com.demo.booksys.common.RespGenerator;
import com.demo.booksys.utils.TokenUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
@Api(tags = "登录接口")
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    @ApiOperation(value = "登录")
    @GetMapping("/login")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userName", value = "用户名", paramType = "query"),
            @ApiImplicitParam(name = "passWord", value = "密码", paramType = "query")
    })
    public BaseResponse<HashMap> login(@RequestParam(value = "userName") String userName, @RequestParam(value = "passWord") String passWord) throws JsonProcessingException {
        //包装token
        User user = new User();
        user.setUserName(userName);
        user.setPassword(passWord);
        String token= TokenUtils.sign(user);
        HashMap<String,Object> hs=new HashMap<>();
        hs.put("token",token);
        return RespGenerator.returnOK(hs);
    }

    @ApiOperation(value = "查询用户")
    @GetMapping("/getalluser")
    public BaseResponse<User> getAllUser(){

        return RespGenerator.returnOK(userService.getAllUser());
    }
    @ApiOperation(value = "新增用户")
    @GetMapping("/addUser")
    public BaseResponse<Book> insertSelective(User user) {
        return RespGenerator.returnOK(userService.insertSelective(user));
    }

}
