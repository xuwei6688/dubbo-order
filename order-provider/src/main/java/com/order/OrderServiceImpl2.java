package com.order;

import org.springframework.stereotype.Service;

@Service("orderService2")
public class OrderServiceImpl2 implements OrderService {
    @Override
    public OrderDto doOrder(OrderDto orderDto) {
        OrderDto dto = new OrderDto();
        dto.setMsg("成功 version-2");
        return dto;
    }
}
