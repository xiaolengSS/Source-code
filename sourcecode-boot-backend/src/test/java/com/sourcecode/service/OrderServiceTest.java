package com.sourcecode.service;

import com.github.pagehelper.PageInfo;
import com.sourcecode.SourceCodeBackendApplication;
import com.sourcecode.domain.*;
import com.sourcecode.vo.ProductVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SourceCodeBackendApplication.class})
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    // 保存
    @Test
    public void testSave() throws Exception {

        for (int i = 1 ; i <= 26 ; i++){
            Order order = new Order();
            order.setBuyerId(1);
            order.setBuyerName("HelloWorld" + i);
            order.setBuyerOther("额外信息" + i);
            order.setCreateTime(new Date());
            order.setIsHelp(1);
            order.setNote("快快的解决哦" + i);
            order.setOrderAmount(new BigDecimal("129.8"));
            order.setOrderNumber("2021070512131415" + i);
            order.setOuterTradeNo("zfb2021666888999" + i);
            order.setPayAmount(new BigDecimal("129.8"));
            order.setPayTime(new Date());
            order.setPayTradeSource("zfb");
            order.setQqCode("1554224355" + i);
            order.setWxAccount("13282430000" + i);
            order.setWxCode("guoguo_best" + i);
            order.setWxOpenId("afdjkiwerjkldfi123k" + i);

            List<OrderItem> orderItems = new ArrayList<OrderItem>();

            OrderItem oi1 = new OrderItem();
            oi1.setOrder(order);
            oi1.setAmount(3);
            oi1.setProductAmount(new BigDecimal("79.8"));
            oi1.setProductId(18);
            oi1.setProductName("邮件开发系统" + i);
            oi1.setProductPrice(new BigDecimal("26.6"));

            OrderItem oi2 = new OrderItem();
            oi2.setOrder(order);
            oi2.setAmount(1);
            oi2.setProductAmount(new BigDecimal("50"));
            oi2.setProductId(32);
            oi2.setProductName("在线音乐系统" + i);
            oi2.setProductPrice(new BigDecimal("50"));

            orderItems.add(oi1);
            orderItems.add(oi2);

            order.setOrderItems(orderItems);

            orderService.save(order);
        }
    }
}
