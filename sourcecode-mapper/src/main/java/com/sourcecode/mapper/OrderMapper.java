package com.sourcecode.mapper;

import com.sourcecode.domain.Order;
import com.sourcecode.vo.OrderVo;
import java.util.List;

/**
 *      订单Mapper
 */
public interface OrderMapper {

    // 查询全部订单
    public List<Order> selectAll(OrderVo orderVo);

    // 根据id查询订单信息
    public Order selectById(Integer id);

    // 保存订单
    public void insert(Order order);
}
