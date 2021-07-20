package com.sourcecode.mapper;

import com.sourcecode.domain.ProductImages;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *   商品图片Mapper
 */
public interface ProductImagesMapper {

    // 批量保存商品图片
    public void insertBatch(@Param("productImages") List<ProductImages> productImages);
}
