package com.qian.service;

import com.qian.entity.Order;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author qian
 * @date 2018/6/20
 */
@Component
@EnableBinding(Sink.class)
public class MessageListener {
    @StreamListener(Sink.INPUT)
    public void input(Message<Order> message) {
        System.err.println("【*** 消息接收 ***】" + message.getPayload());
    }
}
