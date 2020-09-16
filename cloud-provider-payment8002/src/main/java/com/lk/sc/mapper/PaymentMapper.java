package com.lk.sc.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lk.sc.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author likeLove
 * @time 2020-08-30  10:53
 */
@Mapper
@Repository
public interface PaymentMapper  extends BaseMapper<Payment> {

}
