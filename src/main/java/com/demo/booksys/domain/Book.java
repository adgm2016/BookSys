package com.demo.booksys.domain;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Book {
    @ApiModelProperty(value = "书籍id")
    private String id;
    @ApiModelProperty(value = "书籍名称")
    private String book_name;
    @ApiModelProperty(value = "作者")
    private String author;
    @ApiModelProperty(value = "简介")
    private String description;
    @ApiModelProperty(value = "位置")
    private String location;
    @ApiModelProperty(value = "出版时间")
    private String publish_time;
    @ApiModelProperty(value = "出版社")
    private String publisher;
    @ApiModelProperty(value = "状态")
    private String status;
    @ApiModelProperty(value = "书籍类别")
    private String book_type;
    @ApiModelProperty(value = "图片")
    private String image;
}








