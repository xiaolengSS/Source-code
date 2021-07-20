package com.sourcecode.controller;

import com.github.pagehelper.PageInfo;
import com.sourcecode.domain.Product;
import com.sourcecode.response.ResponseResult;
import com.sourcecode.service.ProductService;
import com.sourcecode.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *      商品Controller
 */
@RestController
@RequestMapping("/admin/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    // 查询所有商品(分页+条件)
    @RequestMapping(value = "/queryProductsByPage" , method = RequestMethod.GET)
    public ResponseResult queryProductsByPage(ProductVo productVo){
        PageInfo<Product> pageInfo = productService.queryAllByPage(productVo);
        return ResponseResult.returnData(pageInfo);
    }

    // 保存商品
    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public ResponseResult save(@RequestBody Product product){
        productService.save(product);
        return ResponseResult.ok();
    }

    // 根据id查询商品
    @RequestMapping(value = "/queryById", method = RequestMethod.GET)
    public ResponseResult queryById(Integer id){
        Product product = productService.queryById(id);
        return ResponseResult.returnData(product);
    }

    // 更新商品
    @RequestMapping(value = "/update" , method = RequestMethod.POST)
    public ResponseResult update(@RequestBody Product product){
        productService.update(product);
        return ResponseResult.ok();
    }

    // 根据id删除商品
    @RequestMapping(value = "/deleteById", method = RequestMethod.GET)
    public ResponseResult deleteById(Integer id){
        productService.deleteById(id);
        return ResponseResult.ok();
    }

    // 批量根据id删除商品
    @RequestMapping(value = "/deleteByIds" , method = RequestMethod.GET)
    public ResponseResult deleteByIds(Integer[] ids){
        productService.deleteByIds(ids);
        return ResponseResult.ok();
    }

    // 根据id上架商品
    @RequestMapping(value = "/enableById",method = RequestMethod.GET)
    public ResponseResult enableById(Integer id){
        productService.enableById(id);
        return ResponseResult.ok();
    }

    // 批量根据id上架商品
    @RequestMapping(value = "/enableByIds",method = RequestMethod.GET)
    public ResponseResult enableByIds(Integer[] ids){
        productService.enableByIds(ids);
        return ResponseResult.ok();
    }
}
