package com.sourcecode.service;

import com.github.pagehelper.PageInfo;
import com.sourcecode.domain.Order;
import com.sourcecode.domain.Product;
import com.sourcecode.vo.OrderVo;
import com.sourcecode.vo.ProductVo;

/**
 *      订单Service业务
 */
public interface OrderService {

    // 查询所有的订单（分页 + 条件）
    public PageInfo<Order> queryAllByPage(OrderVo orderVo);

    // 根据id查询订单信息
    public Order queryById(Integer id);

    // 保存订单
    public void save(Order order);
}
