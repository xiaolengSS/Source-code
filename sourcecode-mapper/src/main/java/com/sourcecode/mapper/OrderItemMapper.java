package com.sourcecode.mapper;

import com.sourcecode.domain.OrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *   订单明细Mapper
 */
public interface OrderItemMapper {

    // 批量保存订单明细
    public void insertBatch(@Param("orderItems") List<OrderItem> orderItems);
}
