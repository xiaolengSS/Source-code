package com.sourcecode.service;

import com.github.pagehelper.PageInfo;
import com.sourcecode.domain.Product;
import com.sourcecode.vo.ProductVo;

/**
 *  商品Product业务
 */
public interface ProductService {

    // 查询全部商品（分页 + 条件）
    public PageInfo<Product> queryAllByPage(ProductVo productVo);

    // 保存商品
    public void save(Product product);

    // 删除商品 (下架商品)
    public void deleteById(Integer id);

    // 批量id列表删除商品
    public void deleteByIds(Integer... ids);

    // 更新商品
    public void update(Product product);

    // 根据id查询商品
    public Product queryById(Integer id);

    // 上架商品（status状态设置为1）
    public void enableById(Integer id);

    // 批量上架商品
    public void enableByIds(Integer... ids);
}
