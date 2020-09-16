package com.lk.sc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author likeLove
 * @time 2020-08-30  10:50
 */
@Data
public class Payment implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String serial;

}
