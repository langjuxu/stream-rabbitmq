package com.qian.streamrabbitmq;

import com.qian.StreamRabbitmqConsumerApplication;
import com.qian.entity.Order;
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

}
