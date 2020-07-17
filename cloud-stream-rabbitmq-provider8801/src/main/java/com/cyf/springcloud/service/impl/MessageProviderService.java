package com.cyf.springcloud.service.impl;

import cn.hutool.core.lang.UUID;
import com.cyf.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;



/**
 * @author by cyf
 * @date 2020/7/17.
 */
@EnableBinding(Source.class)//定义消息的推送管道
public class MessageProviderService implements IMessageProvider {
    //消息发生管道
    @Autowired
    private MessageChannel output;
    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());//发送消息
        System.out.println("**********serial"+serial);
        return null;
    }
}
