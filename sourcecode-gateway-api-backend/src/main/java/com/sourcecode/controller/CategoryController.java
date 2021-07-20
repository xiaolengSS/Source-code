package com.sourcecode.controller;

import com.github.pagehelper.PageInfo;
import com.sourcecode.constant.Status;
import com.sourcecode.domain.Category;
import com.sourcecode.response.ResponseResult;
import com.sourcecode.service.CategoryService;
import com.sourcecode.vo.CategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *      分类Category 控制器
 */
@RestController
@RequestMapping("/admin/category")
@CrossOrigin
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     *      查询全部分类
     */
    @RequestMapping(value = "/queryAll" , method = RequestMethod.GET)
    public ResponseResult queryAll(CategoryVo categoryVo){
        PageInfo<Category> pageInfo = categoryService.queryAllByPage(categoryVo);
        return ResponseResult.returnData(pageInfo);
    }

    /**
     *      添加分类
     */
    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public ResponseResult save(@RequestBody Category category){
        categoryService.save(category);
        return ResponseResult.ok();
    }

    /**
     *      删除分类
     */
    @RequestMapping(value = "/deleteById" , method = RequestMethod.GET)
    public ResponseResult deleteById(Integer id){
        Boolean result = categoryService.deleteById(id);
        if (result){
            return ResponseResult.ok();
        }
        return new ResponseResult(null,"该分类下包含商品，不能删除",500);
    }

    /**
     *      启用分类
     */
    @RequestMapping(value = "/enableStatusById" , method = RequestMethod.GET)
    public ResponseResult enableStatusById(Integer id){
        Category category = new Category();
        category.setId(id);
        category.setStatus(Status.ENABLE.getType());
        categoryService.update(category);
        return ResponseResult.ok();
    }

    /**
     *      禁用分类
     */
    @RequestMapping(value = "/disableStatusById" , method = RequestMethod.GET)
    public ResponseResult disableStatusById(Integer id){
        Category category = new Category();
        category.setId(id);
        category.setStatus(Status.DISABLE.getType());
        categoryService.update(category);
        return ResponseResult.ok();
    }

    /**
     *      根据id查询分类
     */
    @RequestMapping(value = "/queryById" , method = RequestMethod.GET)
    public ResponseResult queryById(Integer id){
        Category category = categoryService.queryById(id);
        if (category == null) return ResponseResult.notFound();
        return ResponseResult.returnData(category);
    }

    /**
     *      更新分类
     */
    @RequestMapping(value = "/update" , method = RequestMethod.POST)
    public ResponseResult update(@RequestBody Category category){
        categoryService.update(category);
        return ResponseResult.ok();
    }
}
