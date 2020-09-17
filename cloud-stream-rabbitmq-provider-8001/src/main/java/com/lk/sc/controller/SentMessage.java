package com.lk.sc.controller;

import com.lk.sc.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author likeLove
 * @time 2020-09-17  11:34
 */
@RestController
public class SentMessage {

    @Resource
    private IMessageProvider iMessageProvider;
    @GetMapping("/send")
    public String sendMessage() {
        return iMessageProvider.send();
    }
}
