package com.order;

import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Override
    public OrderDto doOrder(OrderDto orderDto) {
        OrderDto dto = new OrderDto();
        dto.setMsg("成功");
        return dto;
    }
}
