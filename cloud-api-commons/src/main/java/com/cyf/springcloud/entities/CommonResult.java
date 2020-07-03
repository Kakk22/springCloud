package com.cyf.springcloud.entities;

import lombok.Getter;
import lombok.Setter;

/**
 * @author by cyf
 * @date 2020/6/28.
 */
@Getter
@Setter

public class CommonResult<T> {
    private Integer code;
    private String message;
    private T date;

    public CommonResult() {
    }

    public CommonResult(Integer code, String message, T date) {
        this.code = code;
        this.message = message;
        this.date = date;
    }

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
