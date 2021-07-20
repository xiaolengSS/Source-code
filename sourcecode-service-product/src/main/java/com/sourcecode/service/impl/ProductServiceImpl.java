package com.sourcecode.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sourcecode.constant.Status;
import com.sourcecode.domain.Product;
import com.sourcecode.domain.ProductDesc;
import com.sourcecode.domain.ProductImages;
import com.sourcecode.domain.ProductVideo;
import com.sourcecode.mapper.ProductDescMapper;
import com.sourcecode.mapper.ProductImagesMapper;
import com.sourcecode.mapper.ProductMapper;
import com.sourcecode.mapper.ProductVideoMapper;
import com.sourcecode.service.ProductService;
import com.sourcecode.utils.CollectionUtils;
import com.sourcecode.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 *  商品Product 业务实现
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductDescMapper productDescMapper;

    @Autowired
    private ProductImagesMapper productImagesMapper;

    @Autowired
    private ProductVideoMapper productVideoMapper;

    // 查询全部商品（分页 + 条件）
    @Transactional(readOnly = true,propagation = Propagation.NOT_SUPPORTED)
    public PageInfo<Product> queryAllByPage(ProductVo productVo) {
        PageHelper.startPage(productVo.getCurrentPage(),productVo.getPageSize());
        List<Product> products = productMapper.selectAll(productVo);
        PageInfo<Product> pageInfo = new PageInfo<Product>(products);
        return pageInfo;
    }

    // 保存商品
    public void save(Product product) {
        // 1、保存商品基本信息【需要返回自增主键】
        product.setStatus(Status.DISABLE.getType()); // 未上架,禁用
        product.setUploadTime(new Date());           // 商品上传到系统的时间
        productMapper.insert(product);

        // 2、保存商品详情信息
        ProductDesc productDesc = product.getProductDesc();
        if (productDesc != null && productDesc.getInfo() != null && !"".equals(productDesc.getInfo())){
            productDesc.setProduct(product); // 维护商品详情和商品的关联关系
            productDescMapper.insert(productDesc);
        }

        // 3、批量保存商品图片信息
        List<ProductImages> productImages = product.getProductImages();
        if (CollectionUtils.isNotEmpty(productImages)){
            productImages.stream().forEach(pi -> pi.setProduct(product)); // 维护商品图片和商品关联关系
            productImagesMapper.insertBatch(productImages);
        }

        // 4、批量保存商品视频信息
        List<ProductVideo> productVideos = product.getProductVideos();
        if (CollectionUtils.isNotEmpty(productVideos)){
            productVideos.stream().forEach(pv -> pv.setProduct(product)); // 维护商品视频和商品关联关系
            productVideoMapper.insertBatch(productVideos);
        }
    }

    // 删除商品
    public void deleteById(Integer id) {
        productMapper.deleteById(id);
    }

    // 批量删除商品
    public void deleteByIds(Integer... ids) {
        if(ids != null && ids.length > 0){
            for (Integer id : ids) {
                this.deleteById(id);
            }
        }
    }

    // 更新商品信息
    public void update(Product product) {

        // 第一步、修改商品信息
        product.setUpdatedTime(new Date());     // 商品修改的时间
        productMapper.update(product);

        // 第二步、修改商品详情
        ProductDesc productDesc = product.getProductDesc();
        if (productDesc != null && productDesc.getInfo() != null && !"".equals(productDesc.getInfo())){
            productDescMapper.update(productDesc);
        }
    }

    // 根据id查询商品信息
    public Product queryById(Integer id) {
        return productMapper.selectById(id);
    }

    // 根据id上架商品
    public void enableById(Integer id) {
        Product product = new Product();
        product.setId(id);
        product.setStatus(Status.ENABLE.getType()); // 状态启用
        product.setCheckTime(new Date()); // 审核时间
        productMapper.update(product);
    }

    // 批量上架商品
    public void enableByIds(Integer... ids) {
        if(ids != null && ids.length > 0){
            for (Integer id : ids) {
                this.enableById(id);
            }
        }
    }
}
