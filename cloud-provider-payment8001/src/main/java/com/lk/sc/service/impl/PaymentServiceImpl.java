package com.lk.sc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lk.sc.entity.Payment;
import com.lk.sc.mapper.PaymentMapper;
import com.lk.sc.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @author likeLove
 * @time 2020-08-30  10:56
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {

}
