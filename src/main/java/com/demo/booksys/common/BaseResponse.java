package com.demo.booksys.common;

import lombok.Data;

@Data
public class BaseResponse<T> {

    public BaseResponse(String code, String message, T data) {
        super();
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private String code;
    private String message;
    private T data;

    public BaseResponse(){
        super();
    }
}



