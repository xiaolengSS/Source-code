package com.sourcecode.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sourcecode.domain.Order;
import com.sourcecode.domain.OrderItem;
import com.sourcecode.domain.Product;
import com.sourcecode.mapper.OrderItemMapper;
import com.sourcecode.mapper.OrderMapper;
import com.sourcecode.service.OrderService;
import com.sourcecode.utils.CollectionUtils;
import com.sourcecode.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 *      订单Service业务实现
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderItemMapper orderItemMapper;

    // 查询所有的订单（分页 + 条件）
    @Transactional(readOnly = true,propagation = Propagation.NOT_SUPPORTED)
    public PageInfo<Order> queryAllByPage(OrderVo orderVo){
        PageHelper.startPage(orderVo.getCurrentPage(),orderVo.getPageSize());
        List<Order> orders = orderMapper.selectAll(orderVo);
        PageInfo<Order> pageInfo = new PageInfo<Order>(orders);
        return pageInfo;
    }

    // 根据id查询订单信息
    @Transactional(readOnly = true,propagation = Propagation.NOT_SUPPORTED)
    public Order queryById(Integer id){
        return orderMapper.selectById(id);
    }

    // 保存订单
    public void save(Order order){
        // 1、保存订单
        //TODO 订单其他信息还需要维护，比如说订单金额、订单号
        orderMapper.insert(order);

        // 2、保存订单明细
        List<OrderItem> orderItems = order.getOrderItems();
        if (CollectionUtils.isNotEmpty(orderItems)){
            orderItems.stream().forEach(oi -> oi.setOrder(order)); // 设置订单详情和订单的关系
            orderItemMapper.insertBatch(orderItems);
        }
    }
}
