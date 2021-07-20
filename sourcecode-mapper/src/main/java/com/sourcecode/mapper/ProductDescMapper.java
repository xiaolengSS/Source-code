package com.sourcecode.mapper;
import com.sourcecode.domain.ProductDesc;

/**
 *      商品详情ProductDesc Mapper数据接口层
 */
public interface ProductDescMapper {

    // 保存商品详情
    public void insert(ProductDesc productDesc);

    // 修改商品详情
    public void update(ProductDesc productDesc);
}
