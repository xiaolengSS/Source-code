package com.sourcecode.controller;

import com.sourcecode.domain.ProductDesc;
import com.sourcecode.response.ResponseResult;
import com.sourcecode.service.ProductDescService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *  商品详情Controller
 */
@RestController
@RequestMapping("/admin/productdesc")
public class ProductDescController {

    @Autowired
    private ProductDescService productDescService;

    // 根据id修改商品详情
    @RequestMapping(value = "/update" , method = RequestMethod.POST)
    public ResponseResult update(ProductDesc productDesc){
        productDescService.update(productDesc);
        return ResponseResult.ok();
    }

}
