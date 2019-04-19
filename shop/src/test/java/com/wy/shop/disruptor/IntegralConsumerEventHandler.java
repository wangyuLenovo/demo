package com.wy.shop.disruptor;

import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.WorkHandler;

public class IntegralConsumerEventHandler  implements EventHandler<Order>,WorkHandler<Order> {

    @Override
    public void onEvent(Order order, long l, boolean b) throws Exception {
        Thread.sleep(2000);
        System.out.println("增加积分"+order.getOrderId());
    }

    @Override
    public void onEvent(Order order) throws Exception {
        Thread.sleep(2000);
        System.out.println("增加积分"+order.getOrderId());
    }
}
