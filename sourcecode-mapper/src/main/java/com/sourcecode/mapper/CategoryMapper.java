package com.sourcecode.mapper;

import com.sourcecode.domain.Category;
import com.sourcecode.vo.CategoryVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *  分类Category Mapper数据接口层
 */
public interface CategoryMapper {

    // 查询全部分类
    public List<Category> selectAll(CategoryVo categoryVo);

    // 添加分类
    public void insert(Category category);

    // 修改分类
    public void update(Category category);

    // 删除分类
    public void deleteById(Integer id);

    // 根据id查询
    public Category selectById(Integer id);
}
