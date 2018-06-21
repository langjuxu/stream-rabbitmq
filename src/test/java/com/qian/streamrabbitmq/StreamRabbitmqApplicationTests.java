package com.qian.streamrabbitmq;

import com.qian.StreamRabbitmqConsumerApplication;
import com.qian.entity.Order;
import com.qian.service.IMessageProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StreamRabbitmqConsumerApplication.class)
@WebAppConfiguration
public class StreamRabbitmqApplicationTests {

    @Resource
    private IMessageProvider messageProvider;

    @Test
    public void testSend() {

        // 实体类型发送MQ
        System.out.println("订单实体发送");
        Order order = new Order();
        order.setOrderNum("0000001");
        order.setNum(10);
        order.setType("APPLE");
        order.setCreateAt(new Date());
        messageProvider.send(order);
    }

}
