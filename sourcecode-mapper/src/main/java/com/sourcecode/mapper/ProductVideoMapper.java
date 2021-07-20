package com.sourcecode.mapper;

import com.sourcecode.domain.ProductImages;
import com.sourcecode.domain.ProductVideo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *   商品视频Mapper
 */
public interface ProductVideoMapper {

    // 批量保存商品视频
    public void insertBatch(@Param("productVideos") List<ProductVideo> productVideos);
}
