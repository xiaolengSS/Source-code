package com.sourcecode.mapper;

import com.sourcecode.domain.Product;
import com.sourcecode.vo.ProductVo;

import java.util.List;

/**
 *      商品Product Mapper数据接口层
 */
public interface ProductMapper {

    // 带条件查询商品信息
    public List<Product> selectAll(ProductVo productVo);

    // 保存商品
    public void insert(Product product);

    // 删除商品
    public void deleteById(Integer id);

    // 更新商品
    public void update(Product product);

    // 根据id查询商品信息
    public Product selectById(Integer id);

    // 根据分类id获取该分类下的商品数量
    public Integer countByCategoryId(Integer categoryId);
}
