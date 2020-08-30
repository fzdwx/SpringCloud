package com.lk.sc.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author likeLove
 * @time 2020-08-30  10:50
 */
@Data
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
