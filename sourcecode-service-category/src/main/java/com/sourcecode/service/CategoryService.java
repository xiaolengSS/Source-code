package com.sourcecode.service;

import com.github.pagehelper.PageInfo;
import com.sourcecode.domain.Category;
import com.sourcecode.vo.CategoryVo;

import java.util.List;

/**
 *      分类Category业务
 */
public interface CategoryService {

    // 查询全部分类
    public PageInfo<Category> queryAllByPage(CategoryVo categoryVo);

    // 保存分类
    public void save(Category category);

    // 修改分类
    public void update(Category category);

    // 删除分类
    public Boolean deleteById(Integer id);

    // 根据id查询分类
    public Category queryById(Integer id);
}
