package com.sourcecode.controller;

import com.github.pagehelper.PageInfo;
import com.sourcecode.domain.Order;
import com.sourcecode.domain.Product;
import com.sourcecode.response.ResponseResult;
import com.sourcecode.service.OrderService;
import com.sourcecode.vo.OrderVo;
import com.sourcecode.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

/**
 *     订单Controller
 */
@RestController
@RequestMapping(value = "/admin/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // 查询所有订单(分页+条件)
    @RequestMapping(value = "/queryOrdersByPage" , method = RequestMethod.GET)
    public ResponseResult queryOrdersByPage(OrderVo orderVo){
        PageInfo<Order> pageInfo = orderService.queryAllByPage(orderVo);
        return ResponseResult.returnData(pageInfo);
    }

    // 根据id查询订单
    @RequestMapping(value = "/queryById", method = RequestMethod.GET)
    public ResponseResult queryById(Integer id){
        Order order = orderService.queryById(id);
        return ResponseResult.returnData(order);
    }
}
