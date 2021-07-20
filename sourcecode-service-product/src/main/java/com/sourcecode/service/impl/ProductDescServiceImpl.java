package com.sourcecode.service.impl;

import com.sourcecode.domain.ProductDesc;
import com.sourcecode.mapper.ProductDescMapper;
import com.sourcecode.service.ProductDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *      商品详情Service实现
 */
@Service
public class ProductDescServiceImpl implements ProductDescService {

    @Autowired
    private ProductDescMapper productDescMapper;

    // 更新商品详情
    @Transactional(propagation = Propagation.REQUIRED)
    public void update(ProductDesc productDesc){
        productDescMapper.update(productDesc);
    }
}
