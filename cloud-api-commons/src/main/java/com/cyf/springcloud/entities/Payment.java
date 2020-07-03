package com.cyf.springcloud.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * @author by cyf
 * @date 2020/6/28.
 */
@Data
public class Payment implements Serializable {
    private Long id;
    private String serial;

}
