package com.sourcecode.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sourcecode.domain.Category;
import com.sourcecode.domain.Product;
import com.sourcecode.mapper.CategoryMapper;
import com.sourcecode.mapper.ProductMapper;
import com.sourcecode.service.CategoryService;
import com.sourcecode.vo.CategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *  分类Category业务实现
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private ProductMapper productMapper;

    // 查询全部分类
    @Transactional(readOnly = true,propagation = Propagation.NOT_SUPPORTED)
    public PageInfo<Category> queryAllByPage(CategoryVo categoryVo) {
        PageHelper.startPage(categoryVo.getCurrentPage(),categoryVo.getPageSize());
        List<Category> categories = categoryMapper.selectAll(categoryVo);
        PageInfo<Category> pageInfo = new PageInfo<Category>(categories);
        return pageInfo;
    }

    // 保存分类
    public void save(Category category) {
        categoryMapper.insert(category);
    }

    // 更新分类
    public void update(Category category) {
        categoryMapper.update(category);
    }

    // 根据id删除分类
    public Boolean deleteById(Integer id) {
        // 1、判断该分类下是否有商品,如果有商品，不允许删除
        Integer count = productMapper.countByCategoryId(id);
        if(count != null && count > 0){
            return false;
        }
        // 2、否则删除分类
        categoryMapper.deleteById(id);

        return true;
    }

    /**
     *      根据id查询分类
     */
    @Transactional(readOnly = true,propagation = Propagation.NOT_SUPPORTED)
    public Category queryById(Integer id) {
        return categoryMapper.selectById(id);
    }
}
