package com.lk.sc.service.impl;

import com.lk.sc.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author likeLove
 * @time 2020-09-17  11:24
 */
@Service
@Slf4j
@EnableBinding(Source.class)//定义消息的推送管道
public class IMessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;//消息发送通道

    @Override
    public String send() {
        String id= UUID.randomUUID().toString();
        boolean send = output.send(MessageBuilder.withPayload(id).build());
        log.info("========IMessageProviderImpl==send-id:"+id);
        return null;
    }
}
